package sfami.softwares.k53reliable.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.activities.MainMenuActivity;
import sfami.softwares.k53reliable.adapters.ProgressFragmentAdapter;
import sfami.softwares.k53reliable.models.TestResult;

public class ProgressFragment extends Fragment {

    private final List<TestResult> myTestsResultsData;

    private int count = 0;
    private Button button;
    private String PACKAGE_NAME = "sfami.softwares.k53reliable";


    public ProgressFragment(List<TestResult> myTestsResultsData) {
        // Required empty public constructor
        this.myTestsResultsData = myTestsResultsData;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_progress, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ProgressFragmentAdapter myProgressFragmentAdapter = new ProgressFragmentAdapter(myTestsResultsData,this.getActivity());
        recyclerView.setAdapter(myProgressFragmentAdapter);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    // When play store is available
                    // Initialize uri
                    Uri uri = Uri.parse("market://details?id=" + PACKAGE_NAME);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                }
                catch (ActivityNotFoundException e){
                    // When play store is unavailable.
                    // Initialize uri
                    Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + PACKAGE_NAME);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
    public void startFragmentsActivity(){
        Intent faqs = new Intent(this.getContext(), MainMenuActivity.class);
        startActivity(faqs);
    }
}