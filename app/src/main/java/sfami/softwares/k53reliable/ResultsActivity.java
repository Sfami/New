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
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    private ImageView image;
    private Button nextButton;
    private TextView time, question, ans1, ans2, ans3, ans4;
    private Integer index = 0;

    private RadioButton ans1Btn, ans2Btn, ans3Btn, ans4Btn;
    private ArrayList<String> answersArray = new ArrayList<>();
    private ArrayList<String> correctAnswersArray = new ArrayList<>();

    private MyRoadSignData[] myTestFragmentData;
    private RewardedAd mRewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
//
//        Intent intent = getIntent();
//        String title = intent.getStringExtra("title");
//        myTestFragmentData  = (MyRoadSignData[]) intent.getSerializableExtra("data");
//        answersArray  = (ArrayList<String>) intent.getSerializableExtra("answers");
//        correctAnswersArray  = (ArrayList<String>) intent.getSerializableExtra("correctAnswers");
//        String toolbarTitle = String.format("%s (%s)", title, myTestFragmentData.length);
//
//        time = findViewById(R.id.time);
//        question = findViewById(R.id.question);
//        image = findViewById(R.id.image);
//        ans1 = findViewById(R.id.ans);
//        ans2 = findViewById(R.id.ans2);
//        ans3 = findViewById(R.id.ans3);
//        ans4 = findViewById(R.id.ans4);
//
//        ans1Btn = findViewById(R.id.ans1_btn);
//        ans2Btn = findViewById(R.id.ans2_btn);
//        ans3Btn = findViewById(R.id.ans3_btn);
//        ans4Btn = findViewById(R.id.ans4_btn);
//        nextButton = findViewById(R.id.next);
//
//        question.setText(myTestFragmentData[index].getSignPurpose());
//        image.setImageResource(myTestFragmentData[index].getSignImage());
//
//        ans1.setText(myTestFragmentData[index].getSignWhere());
//        ans2.setText(myTestFragmentData[index].getSignWhere());
//        ans3.setText(myTestFragmentData[index].getSignWhere());
//        ans4.setText(myTestFragmentData[index].getSignWhere());
//
//        markQuestions();
//
//
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nextQuestion();
//                markQuestions();
//            }
//        });
//
//        AdRequest adRequest = new AdRequest.Builder().build();
//
//        RewardedAd.load(this, "ca-app-pub-2673466865976859/1247420299",
//                adRequest, new RewardedAdLoadCallback() {
//                    @Override
//                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                        mRewardedAd = null;
//                    }
//
//                    @Override
//                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
//                        mRewardedAd = rewardedAd;
//                        Log.d(TAG, "Ad was loaded.");
//                    }
//                });

    }

    private void nextQuestion() {
        Toast.makeText(ResultsActivity.this, String.format("i: %s, size:%s", index, myTestFragmentData.length),Toast.LENGTH_LONG).show();

        if (nextButton.getText().equals("Close")){
            startFragmentsActivity("");
//            Toast.makeText(this,"Done", Toast.LENGTH_SHORT).show();
        }

        if (index < myTestFragmentData.length - 2) {
            index++;

            ans1Btn.setChecked(false);
            ans2Btn.setChecked(false);
            ans3Btn.setChecked(false);
            ans4Btn.setChecked(false);

            image.setImageResource(myTestFragmentData[index].getSignImage());
            question.setText(myTestFragmentData[index].getSignPurpose());
            ans1.setText(myTestFragmentData[index].getSignWhere());
            ans2.setText(myTestFragmentData[index].getSignWhere());
            ans3.setText(myTestFragmentData[index].getSignWhere());
            ans4.setText(myTestFragmentData[index].getSignWhere());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            nextButton.setText("Close");
        }

    }

    private void markQuestions() {
        String correctAnswer = correctAnswersArray.get(index);
        String answer = answersArray.get(index);
        if (answer.contains(ans1.getText())) ans1Btn.setChecked(true);
        if (answer.contains(ans2.getText())) ans2Btn.setChecked(true);
        if (answer.contains(ans3.getText())) ans3Btn.setChecked(true);
        if (answer.contains(ans4.getText())) ans4Btn.setChecked(true);

        if (correctAnswer.contains(ans1.getText())) ans1.setTextColor(getResources().getColor(R.color.green));
        else ans1.setTextColor(getResources().getColor(R.color.purple_500));

        if (correctAnswer.contains(ans2.getText())) ans2.setTextColor(getResources().getColor(R.color.green));
        else ans2.setTextColor(getResources().getColor(R.color.purple_500));

        if (correctAnswer.contains(ans3.getText())) ans3.setTextColor(getResources().getColor(R.color.green));
        else ans3.setTextColor(getResources().getColor(R.color.purple_500));

        if (correctAnswer.contains(ans4.getText())) ans4.setTextColor(getResources().getColor(R.color.green));
        else ans4.setTextColor(getResources().getColor(R.color.purple_500));
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
                // When the user click yes button
                // then app will close
                finish();
                startFragmentsActivity("");
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


    public void startFragmentsActivity(String reward){
        Intent faqs = new Intent(this, FragmentsActivity.class);
        faqs.putExtra("reward",reward);
        startActivity(faqs);
    }
}