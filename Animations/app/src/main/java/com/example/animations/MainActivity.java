package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fadeSimpson(View fadeImageView) {
        ImageView bartImageView = findViewById(R.id.bartImageView);
        //ImageView homerImageView = findViewById(R.id.homerImageView);

        //bartImageView.animate().alpha(0f).setDuration(2000);
        //homerImageView.animate().alpha(1f).setDuration(2000);

        //bartImageView.animate().translationYBy(1000f).setDuration(2000);
        //bartImageView.animate().translationXBy(1000f).setDuration(2000);
        //bartImageView.animate().rotation(360f).setDuration(2000);
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = findViewById(R.id.bartImageView);
        bartImageView.setX(-1000f);
        bartImageView.animate().translationXBy(1000f).setDuration(2000);
    }
}
