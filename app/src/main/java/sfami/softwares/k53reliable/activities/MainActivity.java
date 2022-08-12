package sfami.softwares.k53reliable.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import sfami.softwares.k53reliable.utilities.CheckConnection;
import sfami.softwares.k53reliable.utilities.DataProcessor;
import sfami.softwares.k53reliable.utilities.DataRequest;
import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.utilities.PopulateDataTask;
import sfami.softwares.k53reliable.utilities.PopulateDataThread;
import sfami.softwares.k53reliable.utilities.RequestHandler;
import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;

public class MainActivity extends AppCompatActivity  {

    Button btn_check;
    List<String[]> roadSignsInformation;
    List<String[]> testsInformation;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign variable
        btn_check = findViewById(R.id.btn_check);
        CheckConnection connection = new CheckConnection(MainActivity.this, btn_check);
        btn_check.setVisibility(View.INVISIBLE);

        if (!areDatabasesPopulated()) {
            boolean isConnected = connection.checkConnection();
            Toast.makeText(MainActivity.this, "Data Does Not Exists", Toast.LENGTH_SHORT).show();
            if (isConnected) {
                PopulateDataTask task = new PopulateDataTask(this);
                task.execute();
            }
            else {
                startAgain();
            }
        }
        if (areDatabasesPopulated()) startFAQsActivity();

    }
    public void startFAQsActivity(){
        Intent main = new Intent(this, FAQsActivity.class);
        startActivity(main);
    }

    public void startAgain(){
        Intent main = new Intent(this, ConnectionActivity.class);
        startActivity(main);
    }

    public boolean areDatabasesPopulated(){
        RoadSignDataBaseHelper helper;
        helper = new RoadSignDataBaseHelper(MainActivity.this, "learnMenu", GlobalElements.getDatabasesMap().get("learnMenu"));
        return helper.getAllTestsResults().size() > 0 ;
    }

    public void exitApplication(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void sendAlert(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Application?");
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                exitApplication();
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        sendAlert();
    }



}
