package com.example.dontp.pets;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuPrincipal extends AppCompatActivity {


    private TextView actionBarText;


    private ImageView goToRated;


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.pets_tab_layout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerConfig();



        actionBarText = (TextView) findViewById(R.id.action_bar_text);
        actionBarText.setText("Pets Lover");
        Toolbar ActionBar= (Toolbar)findViewById(R.id.ActionBar);
        setSupportActionBar(ActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);






        goToRated = (ImageView)findViewById(R.id.imgButton);
        goToRated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this,MasVistas.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pets_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_contact:
                Intent intent = new Intent(this,ContactUs.class);
                startActivity(intent);
                break;

            case R.id.menu_settings:
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> addFragments()
    {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new FragmentRecyclerview());
        fragments.add(new PetFragment());

        return fragments;
    }

    private void  ViewPagerConfig()
    {
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),addFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name);

    }
}
