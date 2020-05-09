package com.meyuyw.moviecatalog;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DramaFragment extends Fragment {
    RecyclerView rvDrama;
    ArrayList<Movie> dramas = new ArrayList<>();

    public DramaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drama, container, false);
        rvDrama = (RecyclerView) view.findViewById(R.id.rv_drama);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadView();

    }
    public void loadView() {
        MovieAdapter adapter = new MovieAdapter(getActivity(), DataDrama.getData());
        rvDrama.setAdapter(adapter);
        rvDrama.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}
