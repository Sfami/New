package sfami.softwares.k53reliable;

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

public class RoadRulesMainActivity extends AppCompatActivity {

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_rules_main);
//        MyRoadSignData[] myRoadSignData = new MyRoadSignData[]{
//                new MyRoadSignData("General Rules", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Overtaking, Lanes, Freeway", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Direction Indicators, Road Lanes", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Speed", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Parking and Stopping Areas", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Reflectors", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("View and Visibility", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Lights, Number Plates", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Vehicle Length, Height, and Width", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Steering", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Brake, Tyres", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Fuel Tank, Engine", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Vehicle Length, Height, and Width", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Transporting Goods", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Towing, Vehicle Combinations", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Destruction Vehicles", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Recklessness and Negligence On the Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Noise On The Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//
//        };


        MyRoadRuleData[] myRoadRuleData = new MyRoadRuleData[]{
                new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                new MyRoadRuleData(GlobalElements.generalRoadRules),
                new MyRoadRuleData(GlobalElements.speedRules)
        };

        ActionBar actionBar = getSupportActionBar();
        String toolbarTitle = String.format("Road Rules (%s)", myRoadRuleData.length);
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyRoadRulesAdapter myRoadRulesAdapter = new MyRoadRulesAdapter(myRoadRuleData,RoadRulesMainActivity.this);
        recyclerView.setAdapter(myRoadRulesAdapter);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}