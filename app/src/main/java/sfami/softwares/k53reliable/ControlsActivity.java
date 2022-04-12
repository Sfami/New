package sfami.softwares.k53reliable;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ControlsActivity extends AppCompatActivity {

    private MyRoadRuleData[] myRoadSignData =  new MyRoadRuleData[]{
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
    };

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);
        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(R.drawable.light_motor_manual_controls);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyControlsAdapter myControlsAdapter = new MyControlsAdapter(myRoadSignData,this);
        recyclerView.setAdapter(myControlsAdapter);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView = findViewById(R.id.adView);
        mAdView.loadAd(adRequest);
    }
}