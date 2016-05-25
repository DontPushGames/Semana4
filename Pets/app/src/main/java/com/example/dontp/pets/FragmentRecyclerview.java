package com.example.dontp.pets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerview extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager _layoutManager;

    public FragmentRecyclerview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_recyclerview, container, false);



        recyclerView = (RecyclerView) view.findViewById(R.id.recView);


        _layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(_layoutManager);

        List<Pets> gatos = new ArrayList<>();

        gatos.add(new Pets(R.drawable.cat_1, "Fivi", 3));
        gatos.add(new Pets(R.drawable.cat_2, "Sonny", 1));
        gatos.add(new Pets(R.drawable.cat_3, "Gabo", 3));
        gatos.add(new Pets(R.drawable.cat_4, "Yayita", 5));
        gatos.add(new Pets(R.drawable.cat_5, "Tommy", 3));

        recyclerAdapter = new Adapter(gatos);
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }


}
