package sfami.softwares.k53reliable;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class QuizActivity extends AppCompatActivity {
    private AdView mAdView;
    private ImageView image;
    private Button nextButton, previousButton;
    private TextView time, question, ans1, ans2, ans3, ans4;
    private String title, answers = "", trueAnswers;
    private Integer index = 0, score = 0;
    private InterstitialAd mInterstitialAd;
    private RewardedAd mRewardedAd;
    private RadioButton ans1Btn, ans2Btn, ans3Btn, ans4Btn;

    private CountDownTimer countDownTimer;
    private MyRoadSignData[] myTestFragmentData = new MyRoadSignData[]{
            new MyRoadSignData(GlobalElements.stopSign),
            new MyRoadSignData(GlobalElements.stopFlagSignalSign),
            new MyRoadSignData(GlobalElements.overheadDirectionSign),
            new MyRoadSignData(GlobalElements.staggeredJunctionsSign),
            new MyRoadSignData(GlobalElements.secondarySignsSign),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        long start = System.currentTimeMillis();

        Intent titleIntent = getIntent();
        title = titleIntent.getStringExtra("title");


        time = findViewById(R.id.time);
        timer();

        question = findViewById(R.id.question);
        question.setText(myTestFragmentData[0].getSignPurpose());

        image = findViewById(R.id.image);
        image.setImageResource(myTestFragmentData[0].getSignImage());

        ans1 = findViewById(R.id.ans);
        ans1.setText(myTestFragmentData[0].getSignWhere());

        ans2 = findViewById(R.id.ans2);
        ans2.setText(myTestFragmentData[0].getSignWhere());

        ans3 = findViewById(R.id.ans3);
        ans3.setText(myTestFragmentData[0].getSignWhere());

        ans4 = findViewById(R.id.ans4);
        ans4.setText(myTestFragmentData[0].getSignWhere());

        ans1Btn = findViewById(R.id.ans1_btn);
        ans2Btn = findViewById(R.id.ans2_btn);
        ans3Btn = findViewById(R.id.ans3_btn);
        ans4Btn = findViewById(R.id.ans4_btn);

        nextButton = findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.cancel();
                nextQuestion();
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-2673466865976859/1247420299",
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "Ad was loaded.");
                    }
                });

    }

    private void nextQuestion() {
        if (nextButton.getText().equals("Submit")){
            countDownTimer.cancel();
            submitDialog();
        }

        if (index < myTestFragmentData.length - 1) {
            timer();
            checkAnswer();
            index++;

            image = findViewById(R.id.image);
            question = findViewById(R.id.question);
            ans1 = findViewById(R.id.ans);
            ans2 = findViewById(R.id.ans2);
            ans3 = findViewById(R.id.ans3);
            ans4 = findViewById(R.id.ans4);

            image.setImageResource(myTestFragmentData[index].getSignImage());
            question.setText(myTestFragmentData[index].getSignPurpose());
            ans1.setText(myTestFragmentData[index].getSignWhere());
            ans2.setText(myTestFragmentData[index].getSignWhere());
            ans3.setText(myTestFragmentData[index].getSignWhere());
            ans4.setText(myTestFragmentData[index].getSignWhere());

            ans1Btn.setChecked(false);
            ans2Btn.setChecked(false);
            ans3Btn.setChecked(false);
            ans4Btn.setChecked(false);
        }
        else {
            nextButton.setText("Submit");
        }
    }

    private void timer() {
        countDownTimer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long l) {
                String string = Long.toString((l/1000));
                time.setText("00:" + string);
            }

            @Override
            public void onFinish() {
                if (index == myTestFragmentData.length - 1) submitDialog();
                else {
                    if (!ans1Btn.isChecked() && !ans2Btn.isChecked() && !ans3Btn.isChecked() && !ans4Btn.isChecked()){
                        timeOverDialog();
                    }
                }
            }
        }.start();
    }


    public void checkAnswer(){
        if (ans1Btn.isChecked()) answers += ans1.getText() + ",";
        if (ans2Btn.isChecked()) answers += ans2.getText() + ",";
        if (ans3Btn.isChecked()) answers += ans3.getText() + ",";
        if (ans4Btn.isChecked()) answers += ans4.getText() +  ",";
        trueAnswers = String.format("%s,%s,%s,", ans1.getText(),ans2.getText(),ans3.getText());
        if (answers.equals(trueAnswers)){
            Toast.makeText(QuizActivity.this, "Correct Answer.",Toast.LENGTH_SHORT).show();
            score++;
        }
        else Toast.makeText(QuizActivity.this,"Wrong Answer.",Toast.LENGTH_SHORT).show();
        answers = "";
    }

    public void timeOverDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
        builder.setMessage("Press Ok to proceed.");
        builder.setTitle("Time up!");
        builder.setCancelable(false);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                // When the user click yes button
                // then app will close
                finish();
                nextQuestion();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
        builder.setMessage("Do you want to exit ?");
        builder.setTitle("Warning !");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                // When the user click yes button
                // then app will close
                finish();
                nextQuestion();
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


    public void submitDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizActivity.this);
        String msg = String.format("Congratulations!\nScore: %s/%s (%s)\nWatch full Video Ad to get your full test results.",score,myTestFragmentData.length,score.floatValue()/myTestFragmentData.length);
        builder.setMessage(msg);
        builder.setTitle("Test Completed");
        builder.setCancelable(false);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                if (mRewardedAd != null) {
                    Activity activityContext = QuizActivity.this;
                    mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                        @Override
                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                                            // Handle the reward.
                            Log.d(TAG, "The user earned the reward.");
                            int rewardAmount = rewardItem.getAmount();
                            String rewardType = rewardItem.getType();
                            startFragmentsActivity(rewardType);
                        }
                    });
                } else {
                    Log.d(TAG, "The rewarded ad wasn't ready yet.");
                }
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void startFragmentsActivity(String reward){
        Intent faqs = new Intent(this, FragmentsActivity.class);
        faqs.putExtra("reward",reward);
        startActivity(faqs);
    }
}