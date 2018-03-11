package com.edu.utng.aquintero.iikcha2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new PlaceFragment());
    }

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()){

            case R.id.navigation_place:
                fragment = new PlaceFragment();
                break;

            case R.id.navigation_travel:
                fragment = new TravelFragment();
                break;

            case R.id.navigation_events:
                fragment = new EventsFragment();
                break;
        }

        return loadFragment(fragment);
    }
}
