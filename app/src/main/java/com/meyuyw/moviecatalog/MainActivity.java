package com.meyuyw.moviecatalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView listMovieRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMovieRV = findViewById(R.id.rv_listmovie);
        loadView();
    }

    public void loadView() {
        MovieAdapter adapter = new MovieAdapter(this, DataBase.getData());
        listMovieRV.setAdapter(adapter);
        listMovieRV.setLayoutManager(new LinearLayoutManager(this));
    }

}
