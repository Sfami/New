package sfami.softwares.k53reliable.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.activities.FAQsActivity;
import sfami.softwares.k53reliable.activities.MainMenuActivity;
import sfami.softwares.k53reliable.adapters.RoadRulesAdapter;
import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.models.RoadRule;

public class FAQsFragment extends Fragment {

    private Button button;
    ArrayList<RoadRule> faqs;

    private Dialog dialog;

    public FAQsFragment(ArrayList<RoadRule> faqs) {
        // Required empty public constructor
        this.faqs = faqs;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faqs, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        RoadRulesAdapter roadRulesAdapter = new RoadRulesAdapter(faqs, this.getActivity());
        recyclerView.setAdapter(roadRulesAdapter);

        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!areDatabasesPopulated()) {
                    Toast.makeText(getActivity(), "Still loading data\n   Please wait...", Toast.LENGTH_SHORT).show();
                }
                else dialog.show();
//                submitDialog();
            }
        });


        dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.dialog_box);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        TextView title = dialog.findViewById(R.id.title);
        TextView message = dialog.findViewById(R.id.message);

        Button cancel = dialog.findViewById(R.id.cancel);
        Button okay = dialog.findViewById(R.id.okay);

        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();
                startMainMenuActivity();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        return view;
    }

    public void startMainMenuActivity(){
        Intent main = new Intent(this.getContext(), MainMenuActivity.class);
        startActivity(main);
    }

    public boolean areDatabasesPopulated(){
        RoadSignDataBaseHelper helper;
        helper = new RoadSignDataBaseHelper(this.getContext(), "learnMenu", GlobalElements.getDatabasesMap().get("learnMenu"));
        return helper.getAllTestsResults().size() > 0 ;
    }
}