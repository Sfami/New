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

public class RoadSignsMainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private RegulatorySignsFragment regulatorySignsFragment;
    private WarningSignsFragment warningSignsFragment;
    private GuidanceSignsFragment guidanceSignsFragment;
    private TemporarySignsFragment temporarySignsFragment;
    private InformationSignsFragment informationSignsFragment;
    private RoadMarkingFragment roadMarkingFragment;
    private TrafficSignalsFragment trafficSignalsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_signs_main);

//        MyRoadSignData[] myRoadSignData = new MyRoadSignData[]{
//                new MyRoadSignData("Regulatory Signs", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Warning Signs", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Guidance Signs", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Temporary Signs", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//                new MyRoadSignData("Road Markings", signName, signDescriptions, signPurpose, signAction, signWhere, signImage)
//        };

        MyRoadSignData[] myRegulatorySignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.controlSignsSign),
                new MyRoadSignData(GlobalElements.commandSignsSign),
                new MyRoadSignData(GlobalElements.prohibitionsSignsSign),
                new MyRoadSignData(GlobalElements.reservationSignsSign),
                new MyRoadSignData(GlobalElements.comprehensiveSignsSign),
                new MyRoadSignData(GlobalElements.secondarySignsSign),
                new MyRoadSignData(GlobalElements.deRestrictionSignsSign),
        };

        MyRoadSignData[] myWarningSignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.roadLayoutSignsSign),
                new MyRoadSignData(GlobalElements.directionOfMovementSignsSign),
                new MyRoadSignData(GlobalElements.symbolicSignsSign),
        };

        MyRoadSignData[] myGuidanceSignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.routeMarkersSign),
                new MyRoadSignData(GlobalElements.directionSignsSign),
                new MyRoadSignData(GlobalElements.diagrammaticSignsSign),
        };

        MyRoadSignData[] myRoadMarkingData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.regulatoryMarkingsSign),
                new MyRoadSignData(GlobalElements.warningMarkingsSign),
                new MyRoadSignData(GlobalElements.guidanceMarkingsSign),
        };

        MyRoadSignData[] myTrafficSignalsSignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.trafficLightsSign),
                new MyRoadSignData(GlobalElements.otherRegulatorySignalsSign),
        };

        MyRoadSignData[] myTemporarySignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.exampleOfTemporarySignsSign),
        };



        MyRoadSignData[] myInformationSignsData = new MyRoadSignData[]{
                new MyRoadSignData(GlobalElements.informationSignsSign),
        };



        ActionBar actionBar = getSupportActionBar();
//        String toolbarTitle = String.format("Road Signs (%s)", myRoadSignData.length);
//        actionBar.setTitle(toolbarTitle);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        regulatorySignsFragment = new RegulatorySignsFragment(myRegulatorySignsData);
        warningSignsFragment = new WarningSignsFragment(myWarningSignsData);
        guidanceSignsFragment = new GuidanceSignsFragment(myGuidanceSignsData);
        roadMarkingFragment = new RoadMarkingFragment(myRoadMarkingData);
        trafficSignalsFragment = new TrafficSignalsFragment(myTrafficSignalsSignsData);
        temporarySignsFragment = new TemporarySignsFragment(myTemporarySignsData);
        informationSignsFragment = new InformationSignsFragment(myInformationSignsData);


        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(regulatorySignsFragment, "REGULATORY SIGNS");
        viewPagerAdapter.addFragment(warningSignsFragment, "WARNING SIGNS");
        viewPagerAdapter.addFragment(guidanceSignsFragment, "GUIDANCE SIGNS");
        viewPagerAdapter.addFragment(roadMarkingFragment, "ROAD MARKINGS");
        viewPagerAdapter.addFragment(trafficSignalsFragment, "TRAFFIC SIGNALS");
        viewPagerAdapter.addFragment(temporarySignsFragment, "TEMPORARY SIGNS");
        viewPagerAdapter.addFragment(informationSignsFragment, "INFORMATION SIGNS");
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
