package sfami.softwares.k53reliable.activities;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.utilities.DataRequest;
import sfami.softwares.k53reliable.fragments.FAQsFragment;
import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadRule;

public class FAQsActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FAQsFragment learnersFAQSFragment;
    private FAQsFragment driversFAQsFragment;
    private ArrayList<RoadRule> myDriverFAQs, myLearnersFAQs;
    private DataRequest req;
    private HashMap<String, String> databasesMap;
    private Button button;
    private RelativeLayout layout;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databasesMap = GlobalElements.getDatabasesMap();
        Log.i("FAQsActivity", "onCreate()");
        setContentView(R.layout.activity_faqs);

        String toolbarTitle = String.format("Welcome - FAQs", "");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(toolbarTitle);
        actionBar.setLogo(R.drawable.app_logo);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        myDriverFAQs = GlobalElements.driversFAQs;
        myLearnersFAQs = GlobalElements.learnersFAQs;
        learnersFAQSFragment = new FAQsFragment(myLearnersFAQs);
        driversFAQsFragment = new FAQsFragment(myDriverFAQs);

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(learnersFAQSFragment, "LEARNER'S");
        viewPagerAdapter.addFragment(driversFAQsFragment, "DRIVER'S");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_directions_car_filled_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_school_24);

    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FAQsActivity", "onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("FAQsActivity", "onStop()");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FAQsActivity", "onResume()");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FAQsActivity", "onRestart()");
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
