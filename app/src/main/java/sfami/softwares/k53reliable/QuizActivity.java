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
//        time.setText(score.toString());

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
//        previousButton = findViewById(R.id.previous);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.cancel();
                nextQuestion();
            }
        });

//        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });

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
//            previousButton.setVisibility(View.INVISIBLE);
//                        nextButton.setVisibility(View.INVISIBLE);
        }
        timer();
        if (index >= 0 && index < myTestFragmentData.length - 1) {
            checkAnswer();
//                        previousButton.setText("Prev");
            index++;

            question = findViewById(R.id.question);
            question.setText(myTestFragmentData[index].getSignPurpose());

            image = findViewById(R.id.image);
            image.setImageResource(myTestFragmentData[index].getSignImage());

            ans1 = findViewById(R.id.ans);
            ans1.setText(myTestFragmentData[index].getSignWhere());

            ans2 = findViewById(R.id.ans2);
            ans2.setText(myTestFragmentData[index].getSignWhere());

            ans3 = findViewById(R.id.ans3);
            ans3.setText(myTestFragmentData[index].getSignWhere());

            ans4 = findViewById(R.id.ans4);
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
//        Toast.makeText(this,answers,Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,trueAnswers,Toast.LENGTH_SHORT).show();
        if (answers.equals(trueAnswers)){
//            Toast.makeText(QuizActivity.this,String.format("Correct: %s and %s", answers,trueAnswers),Toast.LENGTH_SHORT).show();
            score++;
        }
//        else Toast.makeText(QuizActivity.this,"Wrong.",Toast.LENGTH_SHORT).show();
        answers = "";
    }

    public void timeOverDialog(){
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(QuizActivity.this);
        // Set the message show for the Alert time
        builder.setMessage("Press Ok to proceed.");

        // Set Alert Title
        builder.setTitle("Time up!");

        // Set Cancelable false
        // for when the user clicks on the outside
        // the Dialog Box then it will remain show
        builder.setCancelable(false);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                nextQuestion();
                // When the user click yes button
                // then app will close
//                finish();
            }
        });
        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {

        // Create the object of
        // AlertDialog Builder class
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(QuizActivity.this);

        // Set the message show for the Alert time
        builder.setMessage("Do you want to exit ?");

        // Set Alert Title
        builder.setTitle("Warning !");

        // Set Cancelable false
        // for when the user clicks on the outside
        // the Dialog Box then it will remain show
        builder.setCancelable(false);

        // Set the positive button with yes name
        // OnClickListener method is use of
        // DialogInterface interface.

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {
                                // When the user click yes button
                                // then app will close
                                finish();
                            }
                        });

        // Set the Negative button with No name
        // OnClickListener method is use
        // of DialogInterface interface.
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {
                                // If user click no
                                // then dialog box is canceled.
                                dialog.cancel();
                            }
                        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();
    }


    public void submitDialog(){
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(QuizActivity.this);
        // Set the message show for the Alert time
        String msg = String.format("Congratulations!\nScore: %s/%s (%s)\nWatch full Video Ad to get your full test results.",score,myTestFragmentData.length,score.floatValue()/myTestFragmentData.length);
        builder.setMessage(msg);

        // Set Alert Title
        builder.setTitle("Test Completed");

        // Set Cancelable false
        // for when the user clicks on the outside
        // the Dialog Box then it will remain show
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
                // When the user click yes button
                // then app will close
                finish();
            }
        });
        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();
    }

    public void startFragmentsActivity(String reward){
        Intent faqs = new Intent(this, FragmentsActivity.class);
        faqs.putExtra("reward",reward);
        startActivity(faqs);
    }
}