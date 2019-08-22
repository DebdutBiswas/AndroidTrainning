package com.example.appnumbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
//import java.util.*;

class numCheck {
    int num;

    //for checking square number
    boolean sqrtCheck() {
        double sqrtNum = Math.sqrt(num);
        if (sqrtNum == Math.floor(sqrtNum)) {
            //if (sqrtNum == (int)sqrtNum) {
            return true;
        }
        else {
            return false;
        }

    }

    //for checking Triangular number
    boolean triCheck() {
        int triNum=0;
        for(int i=1;i<=num;i++){
            triNum+=i;

            if (num == triNum) {
                return true;
            }
        }
        return false;
    }
}

public class MainActivity extends AppCompatActivity {

    public void makeToast(String toastMsg) {
        Toast.makeText(this,toastMsg,Toast.LENGTH_SHORT).show();
    }

    public void userSubmitFunction(View userSubmitView) {
        EditText userNumEditText = findViewById(R.id.userNumEditText);

        if(!userNumEditText.getText().toString().isEmpty()){
            boolean finalSqrtCheck = false;
            boolean finalTriCheck = false;

            numCheck userNumObj = new numCheck();
            userNumObj.num = Integer.parseInt(userNumEditText.getText().toString());

            finalSqrtCheck = userNumObj.sqrtCheck();
            finalTriCheck = userNumObj.triCheck();

            if (finalSqrtCheck && finalTriCheck){
                makeToast(userNumObj.num + " is a sqrt and tri number!");
            }
            else if (finalSqrtCheck) {
                makeToast(userNumObj.num + " is a sqrt number!");
            }
            else if (finalTriCheck) {
                makeToast(userNumObj.num + " is a tri number!");
            }
            else {
                makeToast(userNumObj.num + " neither sqrt or tri number!");
            }
        }
        else {
            makeToast("Invalid input!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
