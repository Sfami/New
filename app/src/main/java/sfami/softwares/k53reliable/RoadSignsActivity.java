package sfami.softwares.k53reliable;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class RoadSignsActivity extends AppCompatActivity {


    private AdView mAdView;
    private RewardedAd mRewardedAd;
    private final String TAG = "RoadSignsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_signs);
//        MyRoadSignData[] myRoadSignData = new MyRoadSignData[]{
//                new MyRoadSignData("Stop Sign","Regulatory road signs are used to regulate the actions of road users.", R.drawable.stop),
//                new MyRoadSignData("Park Sign","Used to alert drivers to dangerous situations on or bordering the roadway.",R.drawable.park),
//                new MyRoadSignData("No overtaking Sign","Provided to help navigate our increasingly complex and developing road network.",R.drawable.no_overtaking),
//                new MyRoadSignData("Yield Sign","2019 film",R.drawable.yield),
//                new MyRoadSignData("Pedestrian Crossing","2012 film",R.drawable.pedestrian_crossing)
//        };

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        MyRoadSignData[] myRoadSignData  = (MyRoadSignData[]) intent.getSerializableExtra("data");
        String toolbarTitle = String.format("%s (%s)", title, myRoadSignData.length);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MySpecificRoadSignAdapter mySpecificRoadSignAdapter = new MySpecificRoadSignAdapter(myRoadSignData, RoadSignsActivity.this);
        recyclerView.setAdapter(mySpecificRoadSignAdapter);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}