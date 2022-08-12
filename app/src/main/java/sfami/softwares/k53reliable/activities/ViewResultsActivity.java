
package sfami.softwares.k53reliable.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import sfami.softwares.k53reliable.adapters.TestResultsAdapter;
import sfami.softwares.k53reliable.models.Question;
import sfami.softwares.k53reliable.R;

public class ViewResultsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TestResultsAdapter testResultsAdapter;
    List<Question> questions;
    private String title;
    String[] answers;
    private List<Question> data;
    int score = 0;
    int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        questions = new ArrayList<>();

        Intent i = getIntent();

        String ans = i.getStringExtra("answers");
        ans = ans.replace("[","");
        ans = ans.replace("]","");

        Log.i("Answers", ans);

        title = i.getStringExtra("title");
        number = i.getIntExtra("number", 0);

        Toast.makeText(this, title, Toast.LENGTH_SHORT).show();
        score = i.getIntExtra("score", 0);
        data = (List<Question>) i.getSerializableExtra("data");
        questions = data;
        answers = ans.split(",");

        Log.i("", "" + questions.size());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        actionBar.setTitle(String.format("Score (%s/%s)", score, questions.size()));

        recyclerView = findViewById(R.id.recyclerView);

        Log.i("", "" + questions.size());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        testResultsAdapter = new TestResultsAdapter(this, questions, number);
        recyclerView.setAdapter(testResultsAdapter);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ViewResultsActivity.this);
        builder.setMessage("Do you want to exit ?");
        builder.setTitle("Warning !");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void startMainMenuActivity(){
        Intent faqs = new Intent(this, MainMenuActivity.class);
        startActivity(faqs);
    }


}