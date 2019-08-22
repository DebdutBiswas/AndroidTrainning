package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    int globalRandVar,minVar=0,maxVar=20;

    public int randomNumGen(int begNum, int endNum){
        Random randObj = new Random();
        return randObj.nextInt(endNum+1)+begNum;
    }

    public void makeToast(String toastMsg){
        Toast.makeText(this,toastMsg,Toast.LENGTH_SHORT).show();
    }

    public void guessSubmitFunction(View guessSubmitView){
        EditText guessEditText = findViewById(R.id.guessEditText);

        if(!guessEditText.getText().toString().isEmpty()){
            int guessVar=Integer.parseInt(guessEditText.getText().toString());

            if (guessVar < globalRandVar){
                makeToast("Higher!");
            }
            else if (guessVar > globalRandVar){
                makeToast("Lower!");
            }
            else {
                makeToast("Yey, matched!");
                globalRandVar=randomNumGen(minVar,maxVar);
            }
        }
        else{
            makeToast("Empty Input!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Random var generation on app load
        globalRandVar=randomNumGen(minVar,maxVar);
    }
}
