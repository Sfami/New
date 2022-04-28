package sfami.softwares.k53reliable;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class RoadRulesActivity extends AppCompatActivity {


    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_rules);
//        MyRoadSignData[] myRoadSignData = new MyRoadSignData[]{
//                new MyRoadSignData("General Rules","Regulatory road signs are used to regulate the actions of road users.", R.drawable.yield),
//                new MyRoadSignData("Overtaking, Lanes, Freeway","Used to alert drivers to dangerous situations on or bordering the roadway.",R.drawable.info),
//                new MyRoadSignData("Direction Indicators, Road Lanes","Provided to help navigate our increasingly complex and developing road network.",R.drawable.guidance),
//                new MyRoadSignData("Speed","2019 film",R.drawable.temporary),
//                new MyRoadSignData("Parking and Stopping Areas","2012 film",R.drawable.road_markings),
//                new MyRoadSignData("Reflectors","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("View and Visibility","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Lights, Number Plates","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Steering","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Brake, Tyres","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Fuel Tank, Engine","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Vehicle Length, Height, and Width","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Transporting Goods","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Towing, Vehicle Combinations","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Destruction Vehicles","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Recklessness and Negligence On the Road","2012 film",R.drawable.good_deeds),
//                new MyRoadSignData("Noise On The Road","2012 film",R.drawable.good_deeds),
//        };


        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        MyRoadRuleData[] myRoadRuleData = (MyRoadRuleData[]) intent.getSerializableExtra("data");
        String toolbarTitle = String.format("%s (%s)", title, myRoadRuleData.length);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyRoadRulesAdapter myRoadRulesAdapter = new MyRoadRulesAdapter(myRoadRuleData,RoadRulesActivity.this);
        recyclerView.setAdapter(myRoadRulesAdapter);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}