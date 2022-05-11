package sfami.softwares.k53reliable;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class DriversManualFragment extends Fragment {


    private AdView mAdView;
    private Button button;
    private MyRoadRuleData[] myRoadRuleData;
    private InterstitialAd mInterstitialAd;

    public DriversManualFragment(MyRoadRuleData[] myRoadRuleData) {
        // Required empty public constructor
        this.myRoadRuleData = myRoadRuleData;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learners_manual, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        MyRoadRulesAdapter myRoadRulesAdapter = new MyRoadRulesAdapter(myRoadRuleData,this.getActivity());
        recyclerView.setAdapter(myRoadRulesAdapter);

        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//        Sample AdMob InterstitialAd ID: ca-app-pub-3940256099942544/1033173712
//        Production AdMob InterstitialAd ID: ca-app-pub-2673466865976859/7429685266

        InterstitialAd.load(getContext(),getString(R.string.InterstitialAd_sample), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });

        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),button.getText(), Toast.LENGTH_SHORT).show();
                startFragmentsActivity();
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(getActivity());
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
            }
        });

        return view;
    }
    public void startFragmentsActivity(){
        Intent faqs = new Intent(this.getContext(), FragmentsActivity.class);
        startActivity(faqs);
    }
}