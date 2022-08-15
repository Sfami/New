package sfami.softwares.k53reliable.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.database.RoadRuleDataBaseHelper;
import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadRule;
import sfami.softwares.k53reliable.adapters.RoadRulesAdapter;

public class RoadRulesActivity extends AppCompatActivity {


    private HashMap<String, String> databasesMap;
    private List<RoadRule> roadRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_rules);

        getData();

//        Intent intent = getIntent();
//        String title = intent.getStringExtra("title");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(String.format("%s (%s)", "Vehicle Controls", roadRules.size()));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RoadRulesAdapter myControlsAdapter = new RoadRulesAdapter(roadRules,this);
        recyclerView.setAdapter(myControlsAdapter);

    }

    public void getData(){
        databasesMap = GlobalElements.getDatabasesMap();
//        Intent intent = getIntent();
        String dbName = "roadRules";
//        title = intent.getStringExtra("title");
        Log.i(RoadSignsActivity.class.getName(), dbName + " " + databasesMap.get(dbName));
        try {
            roadRules = new RoadRuleDataBaseHelper(RoadRulesActivity.this, dbName, databasesMap.get(dbName)).getAllTestsResults();
        }
        catch (Exception e) {
            Log.d("ERROR", e.getMessage());
            Log.d("ERROR", "DB Not Found");
        }
    }
}