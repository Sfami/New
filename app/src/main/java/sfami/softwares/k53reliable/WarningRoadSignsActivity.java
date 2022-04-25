package sfami.softwares.k53reliable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

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

public class WarningRoadSignsActivity extends AppCompatActivity {

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
                new MyRoadSignData(GlobalElements.roadLayoutSignsSign),
                new MyRoadSignData(GlobalElements.directionOfMovementSignsSign),
                new MyRoadSignData(GlobalElements.symbolicSignsSign),
                new MyRoadSignData(GlobalElements.hazardMarkerSignsSign),
                new MyRoadSignData(GlobalElements.informationSignsSign)
        };

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String toolbarTitle = String.format("%s (%s)", title, myRoadSignData.length);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyRoadSignAdapter myRoadSignAdapter = new MyRoadSignAdapter(myRoadSignData, WarningRoadSignsActivity.this);
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