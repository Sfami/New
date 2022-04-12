package sfami.softwares.k53reliable;

import android.os.Bundle;

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
import java.util.List;

public class FragmentsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private LearnFragment learnFragment;
    private ProgressFragment progressFragment;
    private TestFragment testFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

//        MyRoadSignData[] myLearnFragmentData = new MyRoadSignData[]{
//                new MyRoadSignData("Road Signs", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Road Rules", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Controls", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//        };
        MyRoadSignData[] myLearnFragmentData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.roadSignsSign),
                new MyRoadSignData(GlobalElements.roadRulesSign),
                new MyRoadSignData(GlobalElements.controlsSign),
//                new MyRoadSignData(GlobalElements.yieldSign),
//                new MyRoadSignData(GlobalElements.pedestrianCrossingSign)
        };

//        MyRoadSignData[] myTestFragmentData = new MyRoadSignData[]{
//                new MyRoadSignData("K53 Test", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Book Test", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Controls Test", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Road Signs Test", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Road Rules Test", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//        };

        MyRoadSignData[] myTestFragmentData = new MyRoadSignData[]{
                new MyRoadSignData(new Sign("Controls Test", "R.drawable.signs","","","",R.drawable.controls)),
                new MyRoadSignData(new Sign("Road Signs Test", "R.drawable.signs","","","",R.drawable.signs)),
                new MyRoadSignData(new Sign("Road Rules Test", "R.drawable.signs","","","",R.drawable.rules)),
                new MyRoadSignData(new Sign("K53 Test", "R.drawable.signs","","","",R.drawable.k53)),
                new MyRoadSignData(new Sign("Book Test", "R.drawable.signs","","","",R.drawable.books)),
        };

        MyRoadSignData[] myProgressFragmentData = new MyRoadSignData[]{
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.gold)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.gold)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.bronze)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.gold)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.silver)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.silver)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.bronze)),
                new MyRoadSignData(new Sign("K53 TEST", "24/26 (86%)","","","",R.drawable.gold)),
        };

        //Get title using intent like before

        String toolbarTitle = String.format("Learner's Manual", myLearnFragmentData.length);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        learnFragment = new LearnFragment(myLearnFragmentData);
        testFragment = new TestFragment(myTestFragmentData);
        progressFragment = new ProgressFragment(myProgressFragmentData);


        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(testFragment, "TEST");
        viewPagerAdapter.addFragment(learnFragment, "LEARN");
        viewPagerAdapter.addFragment(progressFragment, "PROGRESS");

        viewPager.setAdapter(viewPagerAdapter);

//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_explore_24);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_flight_24);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_card_travel_24);

//        BadgeDrawable badgeDrawable = tabLayout.getTabAt(0).getOrCreateBadge();
//        badgeDrawable.setVisible(true);
//        badgeDrawable.setNumber(12);


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