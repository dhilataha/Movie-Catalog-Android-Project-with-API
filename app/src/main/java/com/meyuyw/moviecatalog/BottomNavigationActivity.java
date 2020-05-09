package com.meyuyw.moviecatalog;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BottomNavigationActivity extends AppCompatActivity {
    private Fragment fragment;
    private BottomNavigationActivity bottomNavigationActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
    }
}
