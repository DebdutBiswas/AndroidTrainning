package com.example.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logCred(View logCredView) {
        EditText userNameText = findViewById(R.id.userNameText);
        EditText passwordText = findViewById(R.id.passwordText);

        Log.i("Credential Entered: ", "User Name: " + userNameText.getText().toString() + ", Password: " + passwordText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
