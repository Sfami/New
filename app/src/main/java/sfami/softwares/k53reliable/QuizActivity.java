package sfami.softwares.k53reliable;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
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

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private List<QuestionModel> questionList;
    private TextView timer, question, questionNumber;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button nextBtn;

    int totalQuestions;
    int qCounter = 0;
    int score = 0;
    int ticks = 0;

    private QuestionModel currentQuestion;

    ColorStateList dfRbColor;
    boolean answered;
    private CountDownTimer countDownTimer;
    private ProgressBar progressBar;

    private ArrayList<String> questions, answers, options;

    private String title;

    private QuestionModel[] data;
    private ImageView image;
    private ProgressBar questionProgress;
    int progress = 0;

    private AdView mAdView;
    private MyRoadRuleData[] myRoadRuleData;
    private InterstitialAd mInterstitialAd;
    private RewardedAd mRewardedAd;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent i = getIntent();
        title = i.getStringExtra("title");
        data = (QuestionModel[]) i.getSerializableExtra("data");

        questionList = new ArrayList<>();
        timer = findViewById(R.id.time);
        progressBar = findViewById(R.id.progress);
        progressBar.setProgress(progress);

        question = findViewById(R.id.question);
        questionNumber = findViewById(R.id.question_number);
        questionProgress = findViewById(R.id.question_progress);
        image = findViewById(R.id.image);
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
        answers = new ArrayList<>();
        questions = new ArrayList<>();
        options = new ArrayList<>();
        showNextQuestion();

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answered == false){
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){
                        checkAnswer();
                        countDownTimer.cancel();
                        updateCountdownUI();
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
        if (answerNo == currentQuestion.getCorrectAnsNo()){
            score++;
        }

        answers.add(Integer.toString(answerNo));
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);

        switch (currentQuestion.getCorrectAnsNo()){
            case 1:
                rb1.setTextColor(Color.BLUE);
                rb1.isChecked();
                break;
            case 2:
                rb2.setTextColor(Color.BLUE);
                rb2.isChecked();
                break;
            case 3:
                rb3.setTextColor(Color.BLUE);
                rb3.isChecked();
                break;
            case 4:
                rb4.setTextColor(Color.BLUE);
                rb4.isChecked();
                break;
        }
        if (qCounter < totalQuestions){
            nextBtn.setText(R.string.btn_next);
        }
        else {
            nextBtn.setText(R.string.btn_submit);
        }

    }
    private void updateQuestionProgress(){
        int step = 100 / data.length;
        progress = step * (qCounter + 1);
        if (qCounter + 1 == data.length) progress = 100;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            questionProgress.setProgress(progress);
        }
    }
    private void showNextQuestion() {
        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb2.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);
        rb4.setTextColor(dfRbColor);

        if (qCounter < totalQuestions){
            timer();
//            currentQuestion = questionList.get(qCounter);
            currentQuestion = data[qCounter];
            question.setText(currentQuestion.getQuestion());
//            questions.add();
            updateQuestionProgress();
            questionNumber.setText(String.format("Question %s of %s", qCounter + 1, data.length));
            image.setImageResource(currentQuestion.getImage());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());
            qCounter++;
            nextBtn.setText("Check");
            answered = false;
        }
        else {
            nextBtn.setText(R.string.btn_submit);

            if (answers.size() > 0) {
                saveTestResults();
//                Toast.makeText(QuizActivity.this, "Results saved.", Toast.LENGTH_SHORT).show();
                startResultsActivity();
            }
            else finish();
        }

    }

    private void addQuestions() {
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2, 0));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",1, 0));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",1, 0));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",4, 0));
        questionList.add(new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",3, 0));
    }


    private void timer() {
        countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long l) {
                String string = Long.toString((l/1000));
                timer.setText("00:" + string);
                ticks++;
                updateCountdownUI();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    progressBar.setProgress(ticks, true);
                }
            }
            @Override
            public void onFinish() {
                finish();
//                showNextQuestion();
//                updateCountdownUI();
            }
        }.start();
    }

    private void updateCountdownUI(){
        progressBar.setProgress(ticks);
    }

    private void saveTestResults(){
        TestResultModel results;
        results = new TestResultModel(-1, "This test", 0, 0, "questions");
        try {
            results = new TestResultModel(-1, title, score, totalQuestions, answers.toString());
            Toast.makeText(QuizActivity.this, results.getTotal().toString(), Toast.LENGTH_SHORT).show();
        } catch (Exception e){
            Toast.makeText(QuizActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
            results = new TestResultModel(-1, title, score, totalQuestions, answers.toString());
        }
        DataBaseHelper dataBaseHelper = new DataBaseHelper(QuizActivity.this);
        boolean success = dataBaseHelper.addOne(results);
        Toast.makeText(QuizActivity.this, "Success = " + success, Toast.LENGTH_SHORT).show();
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
                dialog.dismiss();
                startFragmentsActivity();
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(QuizActivity.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

//
//        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
//        builder.setMessage("Do you want to exit ?");
//        builder.setTitle("Warning !");
//        builder.setCancelable(false);
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which)
//            {
//                // When the user click yes button
//                // then app will close
//                finish();
////                startFragmentsActivity(score);
//            }
//        });
//
//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which)
//            {
//                dialog.cancel();
//            }
//        });
//
//        AlertDialog alertDialog = builder.create();
//        alertDialog.show();
    }


    public void startResultsActivity(){
        Intent faqs = new Intent(this, ResultsActivity.class);
        faqs.putExtra("score", score);
        faqs.putExtra("title", title);
        faqs.putExtra("answers", answers);
        faqs.putExtra("data", data);
        startActivity(faqs);
    }

    public void startFragmentsActivity(){
        Intent faqs = new Intent(this, FragmentsActivity.class);
//        faqs.putExtra("score", score);
        startActivity(faqs);
    }
}