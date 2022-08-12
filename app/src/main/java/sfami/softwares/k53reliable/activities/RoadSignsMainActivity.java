package sfami.softwares.k53reliable.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadSign;
import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.fragments.RoadSignsFragment;

public class RoadSignsMainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private RoadSignsFragment roadSignsFragment;
    private RoadSignsFragment warningSignsFragment;
    private RoadSignsFragment guidanceSignsFragment;
    private RoadSignsFragment temporarySignsFragment;
    private RoadSignsFragment informationSignsFragment;
    private RoadSignsFragment roadMarkingFragment;
    private RoadSignsFragment trafficSignalsFragment;

    private List<RoadSign> myRegulatorySignsData;
    private List<RoadSign> myWarningSignsData;
    private List<RoadSign> myGuidanceSignsData;
    private List<RoadSign> myRoadMarkingData;
    private List<RoadSign> myTrafficSignalsSignsData;
    private List<RoadSign> myTemporarySignsData;
    private List<RoadSign> myInformationSignsData;

    private HashMap<String, String> databasesMap;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_signs_main);

        myRegulatorySignsData = new ArrayList<>();
        myWarningSignsData = new ArrayList<>();
        myRoadMarkingData = new ArrayList<>();
        myGuidanceSignsData = new ArrayList<>();
        myTrafficSignalsSignsData = new ArrayList<>();
        myTemporarySignsData = new ArrayList<>();
        myInformationSignsData = new ArrayList<>();

        getData();

        Intent intent = getIntent();
        title = "Road Signs";

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        int size = myGuidanceSignsData.size();
        size += myInformationSignsData.size();
        size += myRegulatorySignsData.size();
        size += myRoadMarkingData.size();
        size += myTemporarySignsData.size();
        size += myTrafficSignalsSignsData.size();
        size += myWarningSignsData.size();

        actionBar.setTitle(String.format("%s (%s)", title, size));

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        roadSignsFragment = new RoadSignsFragment(myRegulatorySignsData);
        warningSignsFragment = new RoadSignsFragment(myWarningSignsData);
        guidanceSignsFragment = new RoadSignsFragment(myGuidanceSignsData);
        roadMarkingFragment = new RoadSignsFragment(myRoadMarkingData);
        trafficSignalsFragment = new RoadSignsFragment(myTrafficSignalsSignsData);
        temporarySignsFragment = new RoadSignsFragment(myTemporarySignsData);
        informationSignsFragment = new RoadSignsFragment(myInformationSignsData);

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(warningSignsFragment, "WARNING SIGNS");
        viewPagerAdapter.addFragment(guidanceSignsFragment, "GUIDANCE SIGNS");
        viewPagerAdapter.addFragment(roadMarkingFragment, "ROAD MARKINGS");
        viewPagerAdapter.addFragment(roadSignsFragment, "REGULATORY SIGNS");
        viewPagerAdapter.addFragment(trafficSignalsFragment, "TRAFFIC SIGNALS");
        viewPagerAdapter.addFragment(temporarySignsFragment, "TEMPORARY SIGNS");
        viewPagerAdapter.addFragment(informationSignsFragment, "INFORMATION SIGNS");
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void getData(){
        databasesMap = GlobalElements.getDatabasesMap();
        myWarningSignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "warningSigns", databasesMap.get("warningSigns")).getAllTestsResults();
        myGuidanceSignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "guidanceSigns", databasesMap.get("guidanceSigns")).getAllTestsResults();
        myRegulatorySignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "regulatorySigns", databasesMap.get("regulatorySigns")).getAllTestsResults();
        myTemporarySignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "tempSigns", databasesMap.get("tempSigns")).getAllTestsResults();
        myInformationSignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "infoSigns", databasesMap.get("infoSigns")).getAllTestsResults();
        myTrafficSignalsSignsData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "trafficSignals", databasesMap.get("trafficSignals")).getAllTestsResults();
        myRoadMarkingData = new RoadSignDataBaseHelper(RoadSignsMainActivity.this, "roadMarkings", databasesMap.get("roadMarkings")).getAllTestsResults();

        Log.i("Finished getting data", " Number of table = "+ databasesMap.keySet().size());
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
