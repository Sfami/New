package sfami.softwares.k53reliable;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class WarningSignsFragment extends Fragment {


    private final MyRoadSignData[] myRoadSignData;

    private int count = 0;
    private AdView mAdView;
    private Button button;


    public WarningSignsFragment(MyRoadSignData[] myRoadSignData) {
        // Required empty public constructor
        this.myRoadSignData = myRoadSignData;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        MyRoadSignAdapter myRoadSignAdapter = new MyRoadSignAdapter(myRoadSignData,this.getActivity());
        recyclerView.setAdapter(myRoadSignAdapter);

//        MobileAds.initialize(this.getContext(), new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
//            }
//        });

        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return view;
    }
    public void startFragmentsActivity(){
        Intent faqs = new Intent(this.getContext(), FragmentsActivity.class);
        startActivity(faqs);
    }
}