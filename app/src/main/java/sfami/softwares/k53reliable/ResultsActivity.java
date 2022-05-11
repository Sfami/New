package sfami.softwares.k53reliable;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.ArrayList;
import java.util.List;

public class ResultsActivity extends AppCompatActivity {

    private List<QuestionModel> questionList;
    private TextView timer, question;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button nextBtn;

    int totalQuestions;
    int qCounter = 0;
    int score = 0;
    int ticks = 0;
    int index = 0;

    private QuestionModel currentQuestion;
    private int currentAnswerNo;
    ArrayList<String> answers;

    ColorStateList dfRbColor;
    boolean answered;
    private CountDownTimer countDownTimer;
    private ProgressBar progressBar;

    private QuestionModel[] data;
    private String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent i = getIntent();
        answers = i.getStringArrayListExtra("answers");
        title = i.getStringExtra("title");
        data = (QuestionModel[]) i.getSerializableExtra("data");

        questionList = new ArrayList<>();
        timer = findViewById(R.id.time);
        progressBar = findViewById(R.id.progress);
        progressBar.setProgress(0);

        question = findViewById(R.id.question);
        radioGroup = findViewById(R.id.rdg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        nextBtn = findViewById(R.id.next);

        dfRbColor = rb1.getTextColors();

        addQuestions();
//        totalQuestions = questionList.size();
        totalQuestions = data.length;
        showNextQuestion();
        populateWithAnswers();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nextBtn.getText().toString().equals("Finish")) startFragmentsActivity();
                showNextQuestion();
                populateWithAnswers();
            }
        });

    }

    private void populateWithAnswers() {
        if (qCounter < totalQuestions){
            currentAnswerNo = Integer.parseInt(answers.get(qCounter));
        }
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);

        switch (currentQuestion.getCorrectAnsNo()){
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                break;
        }

        switch (currentAnswerNo){
            case 1:
                rb1.setChecked(true);
                break;
            case 2:
                rb2.setChecked(true);
                break;
            case 3:
                rb3.setChecked(true);
                break;
            case 4:
                rb4.setChecked(true);
                break;
        }

        if (qCounter < totalQuestions){
            nextBtn.setText(R.string.btn_next);
        }
        else {
            nextBtn.setText("Finish");
//            finish();
        }

    }

    private void showNextQuestion() {
        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb2.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);
        rb4.setTextColor(dfRbColor);

        if (qCounter < totalQuestions){
//            currentQuestion = questionList.get(qCounter);
            currentQuestion = data[qCounter];
            question.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());
            qCounter++;

        }
        else {
//            nextBtn.setText(R.string.btn_submit);
            finish();
        }
    }

    private void addQuestions() {
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",1));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",5));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",4));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",3));
    }




    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ResultsActivity.this);
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

    public void startFragmentsActivity(){
        Intent faqs = new Intent(this, FragmentsActivity.class);
        startActivity(faqs);
    }

}