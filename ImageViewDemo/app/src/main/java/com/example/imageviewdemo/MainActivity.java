package com.example.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View changeImageView) {
        ImageView chickClipartImageView = findViewById(R.id.chickClipartImageView);

        if(chickClipartImageView.getTag() == null)
            chickClipartImageView.setTag(R.drawable.chick_clipart0);

        if((int)chickClipartImageView.getTag() == R.drawable.chick_clipart0) {
            chickClipartImageView.setImageResource(R.drawable.chick_clipart1);
            chickClipartImageView.setTag(R.drawable.chick_clipart1);
        }
        else if((int)chickClipartImageView.getTag() == R.drawable.chick_clipart1) {
            chickClipartImageView.setImageResource(R.drawable.chick_clipart0);
            chickClipartImageView.setTag(R.drawable.chick_clipart0);
        }

        Log.i("chickClipartImageViewId", chickClipartImageView.getTag().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
