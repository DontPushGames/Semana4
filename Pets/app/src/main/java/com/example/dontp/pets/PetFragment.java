package com.example.dontp.pets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class PetFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager _layoutManager;


    public PetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pet, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recView2);


        _layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(_layoutManager);

        List<Pets2> gatos = new ArrayList<>();

        gatos.add(new Pets2(R.drawable.cat_1, 3));
        gatos.add(new Pets2(R.drawable.cat_1, 1));
        gatos.add(new Pets2(R.drawable.cat_1, 3));
        gatos.add(new Pets2(R.drawable.cat_1, 5));
        gatos.add(new Pets2(R.drawable.cat_1, 3));
        gatos.add(new Pets2(R.drawable.cat_1, 9));
        gatos.add(new Pets2(R.drawable.cat_1, 6));
        gatos.add(new Pets2(R.drawable.cat_1, 3));
        gatos.add(new Pets2(R.drawable.cat_1, 0));
        gatos.add(new Pets2(R.drawable.cat_1, 3));

        recyclerAdapter = new SecondAdapter(gatos);
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }

}
