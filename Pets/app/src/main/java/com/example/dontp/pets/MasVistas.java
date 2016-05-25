package com.example.dontp.pets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MasVistas extends AppCompatActivity {

    private TextView actionBarText;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mas_vistas);

        actionBarText = (TextView) findViewById(R.id.action_bar_text);
        actionBarText.setText("Mas Vistas");

        Toolbar ActionBar= (Toolbar)findViewById(R.id.ActionBar);
        setSupportActionBar(ActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        List<Pets> gatos = new ArrayList<>();

        gatos.add(new Pets(R.drawable.cat_4, "Yayita", 5));
        gatos.add(new Pets(R.drawable.cat_5, "Tommy", 3));
        gatos.add(new Pets(R.drawable.cat_3, "Gabo", 3));
        gatos.add(new Pets(R.drawable.cat_1, "Fivi", 3));
        gatos.add(new Pets(R.drawable.cat_5, "Sonny", 1));

        recyclerView = (RecyclerView) findViewById(R.id.recView);



        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(gatos);
        recyclerView.setAdapter(adapter);
    }
}
