package sfami.softwares.k53reliable;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.gson.Gson;

public class LearnFragment extends Fragment {

    private final MyRoadSignData[] myRoadSignData;

    private int count = 0;
    private AdView mAdView;
    private Button button;


    public LearnFragment(MyRoadSignData[] myRoadSignData) {
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


        MyMenuAdapter myMenuAdapter = new MyMenuAdapter(myRoadSignData,this.getActivity());
        recyclerView.setAdapter(myMenuAdapter);
        Gson gson = new Gson();
        String json = gson.toJson(myRoadSignData);
        Log.i("json", "");
        Log.i("json", "");
        Log.i("json", "");
        Log.i("json", json);


        Log.i("json", "");
        Log.i("json", "");


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