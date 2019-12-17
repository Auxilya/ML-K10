package com.k10.quran;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        loadFragment(new SurahFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Surah");
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.nav_surah:
                    toolbar.setTitle("Surah");
                    fragment = new SurahFragment();
                    break;
                case R.id.nav_juz:
                    toolbar.setTitle("Juz");
                    fragment = new JuzFragment();
                    break;
                case R.id.nav_mekah:
                    toolbar.setTitle("Makkiyah");
                    fragment = new MekahFragment();
                    break;
                case R.id.nav_madinah:
                    toolbar.setTitle("Madaniyah");
                    fragment = new MadinahFragment();
                    break;
            }
            return loadFragment(fragment);
        }
    };
}