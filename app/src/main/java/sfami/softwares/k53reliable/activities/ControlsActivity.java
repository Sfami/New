package sfami.softwares.k53reliable.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadRule;
import sfami.softwares.k53reliable.adapters.RoadRulesAdapter;

public class ControlsActivity extends AppCompatActivity {


    private ArrayList<RoadRule> myRoadRuleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);

        myRoadRuleData =  GlobalElements.driversFAQs;
        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(R.drawable.light_motor_manual_controls);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(String.format("%s (%s)", "Vehicle Controls", myRoadRuleData.size()));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RoadRulesAdapter myControlsAdapter = new RoadRulesAdapter(myRoadRuleData,this);
        recyclerView.setAdapter(myControlsAdapter);

    }
}