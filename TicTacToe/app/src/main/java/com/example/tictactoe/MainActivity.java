package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String activePlayer = "H"; //H: Human, C: Computer
    String[] gameState = {"E","E","E","E","E","E","E","E","E"}; //E: Empty, R: Red, Y: Yellow
    int[][] winningState = {{0,1,2}, /* ### */
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

        if(gameState[currentTappedCap] == "E") {
            capImageView.setAlpha(0f);
            capImageView.setRotation(-3600);

            if (activePlayer == "H") {
                capImageView.setImageResource(R.drawable.yellow);
                activePlayer = "C";
                gameState[currentTappedCap] = "Y";
            } else {
                capImageView.setImageResource(R.drawable.red);
                activePlayer = "H";
                gameState[currentTappedCap] = "R";
            }

            capImageView.animate().alpha(1f).setDuration(300).rotation(3600).setDuration(600);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
