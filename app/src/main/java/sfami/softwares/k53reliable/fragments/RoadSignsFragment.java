package sfami.softwares.k53reliable.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sfami.softwares.k53reliable.adapters.MenuAdapter;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadSign;

public class RoadSignsFragment extends Fragment {

    List<RoadSign> categories;
    RecyclerView recyclerView;
    MenuAdapter menuAdapter;
    View view;

    public RoadSignsFragment(List<RoadSign> categories) {
        this.categories = categories;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_road_signs, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        menuAdapter = new MenuAdapter(this.getActivity(), categories);
        recyclerView.setAdapter(menuAdapter);
        return view;
    }

}