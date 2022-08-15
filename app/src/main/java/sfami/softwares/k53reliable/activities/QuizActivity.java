package sfami.softwares.k53reliable.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.models.Question;
import sfami.softwares.k53reliable.database.QuestionDataBaseHelper;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.TestResult;
import sfami.softwares.k53reliable.database.TestResultDataBaseHelper;

public class QuizActivity extends AppCompatActivity {

    private TextView question, questionNumber;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3;
    private Button nextBtn;

    int totalQuestions;
    int qCounter = 0;
    int score = 0;

    private Question currentQuestion;
    ColorStateList dfRbColor;
    boolean answered;
    private List<Question> questions;
    private ArrayList<String> answers;
    private String title;
    private ImageView image;
    private ProgressBar questionProgress;
    private Dialog dialog;

    private HashMap<String, String> databasesMap;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getData();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setTitle(String.format("%s", title, questions.size()));

        Log.d("Number Of Questions", "" + questions.size());
        totalQuestions = questions.size();
        answers = new ArrayList<>();

        questionProgress = findViewById(R.id.question_progress);
        questionProgress.setMax(totalQuestions);
        questionProgress.setProgress(qCounter);
        question = findViewById(R.id.question);
        questionNumber = findViewById(R.id.question_number);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);

        image = findViewById(R.id.image);

        radioGroup = findViewById(R.id.rdg);
        nextBtn = findViewById(R.id.next);
        dfRbColor = rb1.getTextColors();
        showNextQuestion();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionProgress.setProgress(qCounter);

                if (!answered){
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked()){
                        checkAnswer();
                    }
                    else {
                        Toast.makeText(QuizActivity.this, "Please select one.", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    showNextQuestion();
                }
            }
        });

    }

    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(rbSelected) + 1;
        int correctAnsNo = Integer.parseInt(currentQuestion.getCorrectAnsNo());
        if (answerNo == correctAnsNo){
            score++;
        }


        answers.add(Integer.toString(answerNo));
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);

        switch (correctAnsNo){
            case 1:
                rb1.setTextColor(Color.parseColor("#347E37"));
                break;
            case 2:
                rb2.setTextColor(Color.parseColor("#347E37"));
                break;
            case 3:
                rb3.setTextColor(Color.parseColor("#347E37"));
                break;
        }
        if (qCounter < totalQuestions){
            nextBtn.setText(R.string.btn_next);
        }
        else {
            nextBtn.setText(R.string.btn_submit);
        }
    }

    private void showNextQuestion() {
        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb2.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);


        if (qCounter < totalQuestions){

            currentQuestion = questions.get(qCounter);
            question.setText(currentQuestion.getQuestion());
            questionNumber.setText(String.format("Question %s of %s", qCounter + 1, questions.size()));

            if (title.equals("Controls Test")) image.setImageResource(R.drawable.light_motor_manual_controls);
            else image.setImageBitmap(currentQuestion.getImage());

            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            qCounter++;
            nextBtn.setText("Check");
            answered = false;
        }
        else {
            nextBtn.setText(R.string.btn_submit);
            if (answers.size() > 0) {
                saveTestResults();
                startResultsActivity();
            }
            else finish();
        }

    }

    public void getData(){
        databasesMap = GlobalElements.getDatabasesMap();
        Intent intent = getIntent();
        String dbName = intent.getStringExtra("dbName");
        title = intent.getStringExtra("title");
        Log.i(RoadSignsActivity.class.getName(), dbName + " " + databasesMap.get(dbName));
        try {
            questions = new QuestionDataBaseHelper(QuizActivity.this, dbName, databasesMap.get(dbName)).getAllTestsResults();
        }
        catch (Exception e) {
            Log.d("ERROR", e.getMessage());
            Log.d("ERROR", "DB Not Found");
        }
    }


    private void saveTestResults(){
        TestResult results;
        results = new TestResult(-1, "This test", 0, 0, "questions");
        try {
            results = new TestResult(-1, title, score, totalQuestions, answers.toString());
        } catch (Exception e){
            results = new TestResult(-1, title, score, totalQuestions, answers.toString());
        }
        Log.d("", "");
        Log.d("Results", "" + results.toString());
        Log.d("# of answers/qs", "" + answers.size());
        Log.d("Answers", "" + answers.toString());
        Log.d("", "");
        TestResultDataBaseHelper dataBaseHelper = new TestResultDataBaseHelper(QuizActivity.this);
        boolean success = dataBaseHelper.addOne(results);
        number = dataBaseHelper.getAllTestsResults().size() - 1;
    }

    @Override
    public void onBackPressed() {
        dialog = new Dialog(QuizActivity.this);
        dialog.show();
        dialog.setContentView(R.layout.dialog_box);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        TextView title = dialog.findViewById(R.id.title);
        TextView message = dialog.findViewById(R.id.message);
        Button cancel = dialog.findViewById(R.id.cancel);
        Button okay = dialog.findViewById(R.id.okay);

        title.setText("Warning!");
        message.setText("Do you want to exit ?");

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainMenuActivity();
                dialog.dismiss();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

    }

    public void startResultsActivity(){
        Intent faqs = new Intent(this, ResultsActivity.class);
        faqs.putExtra("score", score);
        faqs.putExtra("title", title);
        faqs.putExtra("answers", answers.toString());
        faqs.putExtra("data", (Serializable) questions);
        faqs.putExtra("number", number);
        startActivity(faqs);
    }

    public void startMainMenuActivity(){
        Intent faqs = new Intent(this, MainMenuActivity.class);
        startActivity(faqs);
    }
}