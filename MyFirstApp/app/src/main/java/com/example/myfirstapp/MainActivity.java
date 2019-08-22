package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void changeHelloRupamTextFunction(View helloButtonView) {
        EditText helloEditText = findViewById(R.id.helloEditText);
        Log.i("Info", helloEditText.getText().toString());
        Toast.makeText(this, helloEditText.getText().toString() + "!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
