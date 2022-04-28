package sfami.softwares.k53reliable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class RegulatoryRoadSignsActivity extends AppCompatActivity {

    TextView textView;
    Button prevButton;
    Button nextButton;
    private ImageButton imageButton;
    private int count = 0;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_signs);

        MyRoadSignData[] myRoadSignData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.controlSignsSign),
                new MyRoadSignData(GlobalElements.commandSignsSign),
                new MyRoadSignData(GlobalElements.prohibitionsSignsSign),
                new MyRoadSignData(GlobalElements.reservationSignsSign),
                new MyRoadSignData(GlobalElements.comprehensiveSignsSign),
                new MyRoadSignData(GlobalElements.secondarySignsSign),
                new MyRoadSignData(GlobalElements.deRestrictionSignsSign),
                new MyRoadSignData(GlobalElements.signalsSign),
        };


        ActionBar actionBar = getSupportActionBar();
        String toolbarTitle = String.format("Type of Signs (%s)", myRoadSignData.length);
        actionBar.setTitle(toolbarTitle);
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyRoadSignAdapter myRoadSignAdapter = new MyRoadSignAdapter(myRoadSignData, RegulatoryRoadSignsActivity.this);
        recyclerView.setAdapter(myRoadSignAdapter);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void increaseCount(){
        this.count += 1;
    }
    public void decreaseCount(){
        this.count -= 1;
    }
}