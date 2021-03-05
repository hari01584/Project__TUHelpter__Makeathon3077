package com.skullzbones.tuhelpter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.skullzbones.tuhelpter.ui.laundary.LaundaryFragment;
import com.skullzbones.tuhelpter.ui.main.MainFragment;
import com.skullzbones.tuhelpter.ui.medical.MedicalFragment;
import com.skullzbones.tuhelpter.ui.mess.MessFragment;
import com.skullzbones.tuhelpter.ui.roomsvc.RoomFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
            bottomNav.setOnNavigationItemSelectedListener(navListener);

            // as soon as the application opens the first
            // fragment should be shown to the user
            // in this case it is algorithm fragment
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, new MainFragment()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            // By using switch we can easily get
            // the selected fragment
            // by using there id.
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.home:
                    selectedFragment = new MainFragment();
                    break;
                case R.id.mess:
                    selectedFragment = new MessFragment();
                    break;
                case R.id.medical:
                    selectedFragment = new MedicalFragment();
                    break;
                case R.id.laundary:
                    selectedFragment = new LaundaryFragment();
                    break;
                case R.id.roomsvc:
                    selectedFragment = new RoomFragment();
                    break;
            }
            // It will help to replace the
            // one fragment to other.
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, selectedFragment)
                    .commit();
            return true;
        }
    };
}