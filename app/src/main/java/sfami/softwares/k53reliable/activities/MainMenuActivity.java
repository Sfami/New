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
import sfami.softwares.k53reliable.fragments.ProgressFragment;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadSign;
import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.fragments.RoadSignsFragment;
import sfami.softwares.k53reliable.models.TestResult;
import sfami.softwares.k53reliable.database.TestResultDataBaseHelper;

public class MainMenuActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private RoadSignsFragment learnFragment;
    private RoadSignsFragment testFragment;
    private ProgressFragment progressFragment;
    private List<RoadSign> myLearnFragmentData;
    private List<RoadSign> myTestFragmentData;
    private List<TestResult> allTestsResults;

    private HashMap<String, String> databasesMap;
    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        getData();
        Intent intent = getIntent();
//        title = intent.getStringExtra("title");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setTitle("Menu");

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        learnFragment = new RoadSignsFragment(myLearnFragmentData);
        testFragment = new RoadSignsFragment(myTestFragmentData);
        progressFragment = new ProgressFragment(allTestsResults);

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(learnFragment, "LEARN");
        viewPagerAdapter.addFragment(testFragment, "TESTS");
        viewPagerAdapter.addFragment(progressFragment, "PROGRESS");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_quiz_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_local_library_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_insights_24);

    }

    public void getData(){
        databasesMap = GlobalElements.getDatabasesMap();
        myTestFragmentData = new RoadSignDataBaseHelper(MainMenuActivity.this, "testMenu", databasesMap.get("testMenu")).getAllTestsResults();
        myLearnFragmentData = new RoadSignDataBaseHelper(MainMenuActivity.this, "learnMenu", databasesMap.get("learnMenu")).getAllTestsResults();
        TestResultDataBaseHelper testResultDataBaseHelper = new TestResultDataBaseHelper(MainMenuActivity.this);
        allTestsResults = testResultDataBaseHelper.getAllTestsResults();
        Log.i("allTestsResults", "" + allTestsResults.size());
        Log.i("myTestFragmentData", " "+ myTestFragmentData.size());
        Log.i("myLearnFragmentData", " "+ myLearnFragmentData.size());
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