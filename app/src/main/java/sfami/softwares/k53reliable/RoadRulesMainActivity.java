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

        MyRoadRuleData[] myRoadRuleData = new MyRoadRuleData[]{
                new MyRoadRuleData(GlobalElements.lightsRules),
                new MyRoadRuleData(GlobalElements.dipBeamRules),
                new MyRoadRuleData(GlobalElements.mainBeamOrBrightRules),
                new MyRoadRuleData(GlobalElements.parkingLampsRules),
                new MyRoadRuleData(GlobalElements.rearLampsRules),
                new MyRoadRuleData(GlobalElements.spotLampRules),
                new MyRoadRuleData(GlobalElements.fogLampsRules),
                new MyRoadRuleData(GlobalElements.stopLampsRules),
                new MyRoadRuleData(GlobalElements.numberPlateLampRules),
                new MyRoadRuleData(GlobalElements.numberPlatesRules),
                new MyRoadRuleData(GlobalElements.rearViewMirrorsRules),
                new MyRoadRuleData(GlobalElements.steeringGearRules),
                new MyRoadRuleData(GlobalElements.turningRadiusRules),
                new MyRoadRuleData(GlobalElements.brakesRules),
                new MyRoadRuleData(GlobalElements.hooterRules),
                new MyRoadRuleData(GlobalElements.sirenRules),
                new MyRoadRuleData(GlobalElements.seatBeltsRules),
                new MyRoadRuleData(GlobalElements.protectiveHelmetRules),
                new MyRoadRuleData(GlobalElements.engineRules),
                new MyRoadRuleData(GlobalElements.windscreenWipersRules),
                new MyRoadRuleData(GlobalElements.windscreenRules),
                new MyRoadRuleData(GlobalElements.exhaustPipesRules),
                new MyRoadRuleData(GlobalElements.fuelTankRules),
                new MyRoadRuleData(GlobalElements.engineRules),
                new MyRoadRuleData(GlobalElements.trianglesRules),
                new MyRoadRuleData(GlobalElements.excessiveNoiseRules),
                new MyRoadRuleData(GlobalElements.speedometerRules),
                new MyRoadRuleData(GlobalElements.speedLimitsRules),
                new MyRoadRuleData(GlobalElements.speedLimitForPassengerVehiclesRules),
                new MyRoadRuleData(GlobalElements.speedLimitForParticularClassOFVehicleRules),
                new MyRoadRuleData(GlobalElements.overallLengthOfVehicleRules),
                new MyRoadRuleData(GlobalElements.overallHeightOfVehicleRules),
                new MyRoadRuleData(GlobalElements.overallWidthOfVehicleRules),
                new MyRoadRuleData(GlobalElements.conveyingOfGoodsRules),
                new MyRoadRuleData(GlobalElements.carryingPersonsInGoodsVehicleRules),
                new MyRoadRuleData(GlobalElements.projectionsRules),
                new MyRoadRuleData(GlobalElements.warningFlagsRules),
                new MyRoadRuleData(GlobalElements.drivingODividedPublicRoadRules),
                new MyRoadRuleData(GlobalElements.drivingOnLeftSideOfRoadwayRules),
                new MyRoadRuleData(GlobalElements.laneChangingRules),
                new MyRoadRuleData(GlobalElements.drivingSignalsRules),
                new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                new MyRoadRuleData(GlobalElements.reflectorsRules),
                new MyRoadRuleData(GlobalElements.yellowReflectiveMaterialRules),
                new MyRoadRuleData(GlobalElements.overtakingRules),
                new MyRoadRuleData(GlobalElements.intersectionsRules),
                new MyRoadRuleData(GlobalElements.stopLampsRules),
                new MyRoadRuleData(GlobalElements.stoppingRules),
                new MyRoadRuleData(GlobalElements.parkingRules),
                new MyRoadRuleData(GlobalElements.generalDutiesOfDriverRules),
                new MyRoadRuleData(GlobalElements.dutiesRelatingToMotorcyclesRules),
                new MyRoadRuleData(GlobalElements.motorcycleSideCarRules),
                new MyRoadRuleData(GlobalElements.cellphonesRules),
                new MyRoadRuleData(GlobalElements.pedestriansRightOfWayRules),
                new MyRoadRuleData(GlobalElements.abandonedVehiclesRules),
                new MyRoadRuleData(GlobalElements.damageToPublicRoadsRules),
                new MyRoadRuleData(GlobalElements.freewaysRules),
                new MyRoadRuleData(GlobalElements.towingRules),
                new MyRoadRuleData(GlobalElements.combinationOfMotorVehiclesRules),
                new MyRoadRuleData(GlobalElements.enteringPublicRoadRules),
                new MyRoadRuleData(GlobalElements.compulsoryStopsRules),
                new MyRoadRuleData(GlobalElements.tyresRules),
                new MyRoadRuleData(GlobalElements.accidentsRules),
                new MyRoadRuleData(GlobalElements.inconsiderateDrivingRules),
                new MyRoadRuleData(GlobalElements.recklessDrivingRules),
                new MyRoadRuleData(GlobalElements.drivingUnderTheInfluenceRules),
                new MyRoadRuleData(GlobalElements.fuelTankRules),
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

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}