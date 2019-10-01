package com.example.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView demoVideoView = findViewById(R.id.demoVideoView);
        demoVideoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demovideo);
        MediaController demoMediaController = new MediaController(this);
        demoMediaController.setAnchorView(demoVideoView);
        demoVideoView.setMediaController(demoMediaController);
        demoVideoView.start();
    }
}
