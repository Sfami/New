package sfami.softwares.k53reliable.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadSign;
import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.adapters.RoadSignsAdapter;


public class RoadSignsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RoadSignsAdapter roadSignsAdapter;
    List<RoadSign> roadSigns;
    private HashMap<String, String> databasesMap;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_signs);

        getData();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(String.format("%s (%s)", title, roadSigns.size()));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        roadSignsAdapter = new RoadSignsAdapter(RoadSignsActivity.this, roadSigns);
        recyclerView.setAdapter(roadSignsAdapter);
    }

    public void getData(){
        databasesMap = GlobalElements.getDatabasesMap();
        Intent intent = getIntent();
        title = intent.getStringExtra("title");
        String dbName = intent.getStringExtra("dbName");

        Log.i(RoadSignsActivity.class.getName(), dbName + " " + databasesMap.get(dbName));
        try {
            roadSigns = new RoadSignDataBaseHelper(RoadSignsActivity.this, dbName, databasesMap.get(dbName)).getAllTestsResults();
        }
        catch (Exception e) {
            Log.d("ERROR", e.getMessage());
            Log.d("ERROR", "DB Not Found");
        }
    }

}