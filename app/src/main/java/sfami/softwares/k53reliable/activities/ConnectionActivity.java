package sfami.softwares.k53reliable.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import sfami.softwares.k53reliable.utilities.CheckConnection;
import sfami.softwares.k53reliable.R;

public class ConnectionActivity extends AppCompatActivity  {

    Button btn_check;
    List<String[]> roadSignsInformation;
    List<String[]> testsInformation;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_check = findViewById(R.id.btn_check);
        sendAlert();
        btn_check.setVisibility(View.INVISIBLE);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // call method
            }
        });
    }
    public void startFAQsActivity(){
        Intent main = new Intent(this, FAQsActivity.class);
        startActivity(main);
    }

    public void startAgain(){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
    public void sendAlert(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Not Connected to Internet!");
        alertDialogBuilder
                .setMessage("Connect to Internet and Try Again!")
                .setCancelable(false)
                .setPositiveButton("Try Again",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                CheckConnection connection = new CheckConnection(ConnectionActivity.this, btn_check);
                                if (!connection.checkConnection()) sendAlert();
                                else startAgain();

                            }
                        })

                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        exitApplication();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void exitApplication(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void sendAlertExit(){
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
        sendAlertExit();
    }



}
