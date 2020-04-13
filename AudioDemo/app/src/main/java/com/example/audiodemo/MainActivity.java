package com.example.audiodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button playBtn;
    //Button pauseBtn = findViewById(R.id.pauseBtn);
    public MediaPlayer demoMediaPlayer;

    public void playAudio(View view) {
        //Button playBtn = findViewById(R.id.playBtn);

        if(!demoMediaPlayer.isPlaying()) {
            demoMediaPlayer.start();
            playBtn.setText("Pause");
        } else {
            demoMediaPlayer.pause();
            playBtn.setText("Play");
        }
    }

    public void pauseAudio(View view) {
        if(demoMediaPlayer.isPlaying()) {
            demoMediaPlayer.pause();
            playBtn.setText("Play");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = findViewById(R.id.playBtn);
        demoMediaPlayer = MediaPlayer.create(this, R.raw.bell);
    }
}
