package com.meyuyw.moviecatalog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {
    TextView titleTV, overviewTV, runtimeTV, releaseTV;
    ImageView posterIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        posterIV = findViewById(R.id.iv_poster);
        titleTV = findViewById(R.id.tv_title);
        overviewTV = findViewById(R.id.tv_overview);
        runtimeTV = findViewById(R.id.tv_runtime);
        releaseTV = findViewById(R.id.tv_release);
        getDetail();
    }

    public void getDetail() {
        Intent detail = getIntent();
        Movie data = detail.getParcelableExtra("MOVIE_DETAIL");
        posterIV.setImageResource(data.getPoster());
        titleTV.setText(data.getTitle());
        overviewTV.setText(data.getOverview());
        runtimeTV.setText(data.getRuntime());
        releaseTV.setText(data.getRelease());
        setTitle(data.getTitle());
    }
}
