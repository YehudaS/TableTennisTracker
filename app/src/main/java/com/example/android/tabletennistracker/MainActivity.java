package com.example.android.tabletennistracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scorePlayer1 = 0;

    int scorePlayer2 = 0;

    int letScorePlayer1 = 0;

    int letScorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Player 1 by 1 point.
     */
    public void addOneForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);

    }


    /**
     * Increase the let for Player 1 by 1 strike.
     */
    public void addLetPlayer1(View v) {
        letScorePlayer1 = letScorePlayer1 + 1;
        displayLetScorePlayer1(letScorePlayer1);
        if (letScorePlayer1 >= 3) addOneForPlayer2(v);
        if (letScorePlayer1 >= 3) resetLetScore(v);

    }

    /**
     * Increase the score for Player 2 by 1 point.
     */
    public void addOneForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the let for Player 2 by 1 strike.
     */
    public void addLetPlayer2(View v) {
        letScorePlayer2 = letScorePlayer2 + 1;
        displayLetScorePlayer2(letScorePlayer2);
        if (letScorePlayer2 >= 3) addOneForPlayer1(v);
        if (letScorePlayer2 >= 3) resetLetScore(v);
    }


    /**
     * Resets the point score for both Teams
     */
    public void resetScore(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Resets the let score for both Teams
     */
    public void resetLetScore(View v) {
        letScorePlayer1 = 0;
        letScorePlayer2 = 0;
        displayLetScorePlayer1(letScorePlayer1);
        displayLetScorePlayer2(letScorePlayer2);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int scorePlayer1) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(scorePlayer1));
    }

    /**
     * Displays the given score for Player 2.
     */

    public void displayForPlayer2(int scorePlayer2) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(scorePlayer2));
    }

    /**
     * Displays the let score for Player 1
     */

    public void displayLetScorePlayer1(int letScorePlayer1) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_let_score);
        scoreView.setText(String.valueOf(letScorePlayer1));
    }

    /**
     * Displays the let score for Player 2
     */

    public void displayLetScorePlayer2(int letScorePlayer2) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_let_score);
        scoreView.setText(String.valueOf(letScorePlayer2));
    }
}
