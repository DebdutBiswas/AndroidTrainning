package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String activePlayer = "H"; //H: Human, C: Computer
    String[] gameStates = {"E","E","E","E","E","E","E","E","E"}; //E: Empty, R: Red, Y: Yellow
    int[][] winningStates = {{0,1,2}, /* ### */
                             {3,4,5}, /* ### */
                             {6,7,8}, /* ### */

                            {0,4,8}, /* #** */
                                     /* *#* */
                                     /* **# */

                            {2,4,6}, /* **# */
                                     /* *#* */
                                     /* #** */

                            {0,      /* #** */
                             3,      /* #** */
                             6},     /* #** */
                            {1,      /* *#* */
                             4,      /* *#* */
                             7},     /* *#* */
                            {2,      /* **# */
                             5,      /* **# */
                             8}};    /* **# */

    public void dropIn(View capView){
        ImageView capImageView = (ImageView) capView;
        int currentTappedCap = Integer.parseInt(capImageView.getTag().toString());

        if(gameStates[currentTappedCap] == "E") {
            capImageView.setAlpha(0f);
            capImageView.setRotation(-3600);

            if (activePlayer == "H") {
                capImageView.setImageResource(R.drawable.yellow);
                activePlayer = "C";
                gameStates[currentTappedCap] = "Y";
            } else {
                capImageView.setImageResource(R.drawable.red);
                activePlayer = "H";
                gameStates[currentTappedCap] = "R";
            }

            capImageView.animate().alpha(1f).setDuration(300).rotation(3600).setDuration(600);

            for(int[] winningState : winningStates){
                if(gameStates[winningState[0]] == gameStates[winningState[1]] &&
                        gameStates[winningState[1]] == gameStates[winningState[2]] &&
                        gameStates[winningState[0]] != "E"){

                    Log.i("Info: ",gameStates[winningState[0]]);
                    for(int winningStateChunk : winningState) {
                        //animateCapView(findViewById(getResources().getIdentifier("capImageView" + winningStateChunk,"id",getPackageName())));
                        findViewById(getResources().getIdentifier("capImageView" + winningStateChunk,"id",getPackageName())).setAlpha(0f);
                        findViewById(getResources().getIdentifier("capImageView" + winningStateChunk,"id",getPackageName())).setScaleX(0.5f);
                        findViewById(getResources().getIdentifier("capImageView" + winningStateChunk,"id",getPackageName())).setScaleY(0.5f);
                        findViewById(getResources().getIdentifier("capImageView" + winningStateChunk,"id",getPackageName())).animate().alpha(1f).setDuration(300).scaleX(1f).scaleY(1f).setDuration(600);
                    }
                }
            }
        }
    }

    public void playAgain(View playAgainView){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
