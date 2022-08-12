package sfami.softwares.k53reliable.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadRule;
import sfami.softwares.k53reliable.adapters.RoadRulesAdapter;

public class RoadRulesActivity extends AppCompatActivity {

    ArrayList<RoadRule> myRoadRuleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_rules);

        myRoadRuleData =  GlobalElements.driversFAQs;

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        String toolbarTitle = String.format("%s (%s)", title, myRoadRuleData.size());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        RoadRulesAdapter myRoadRulesAdapter = new RoadRulesAdapter(myRoadRuleData,RoadRulesActivity.this);
        recyclerView.setAdapter(myRoadRulesAdapter);


    }




}