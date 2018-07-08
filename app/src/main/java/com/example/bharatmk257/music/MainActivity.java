package com.example.bharatmk257.music;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;



public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //start code for fragment

        //loading the default fragment
        loadFragment(new HomeFragment());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        //onclicklistner for texte

        TextView songName = (TextView) findViewById(R.id.SongName);

            songName.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songNameIntent = new Intent(MainActivity.this, activity_music.class);
                    startActivity(songNameIntent);
                }
            });
        }


        public boolean onNavigationItemSelected (@NonNull MenuItem item){
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    break;

                case R.id.navigation_list:
                    fragment = new com.example.bharatmk257.music.ListFragment();
                    break;

                case R.id.navigation_favourite:
                    fragment = new FavouriteFragment();
                    break;
            }

            return loadFragment(fragment);
        }

        private boolean loadFragment (Fragment fragment){
            //switching fragment
            if (fragment != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                return true;
            }
            return false;
        }

        @Override
        public void onPointerCaptureChanged ( boolean hasCapture){

        }

        //Fragment is over


    }


