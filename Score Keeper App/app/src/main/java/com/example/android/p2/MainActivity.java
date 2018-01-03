package com.example.android.p2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.p2.R;

public class MainActivity extends AppCompatActivity {

    int scoreHugo = 0;
    int scoreHector = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*** Increase the score for Hugo by 1 point.     */
    public void winHugo(View v) {
        scoreHugo = scoreHugo ++ ;
        displayForHugo(scoreHugo);
    }

    /*** Decrease the score for Hugo by 1 point.     */
    public void cheatHugo(View v) {
        scoreHugo = scoreHugo - 1;
        displayForHugo(scoreHugo);
    }

    /*** Displays the given score for Hugo.     */
    public void displayForHugo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hugo_score);
        scoreView.setText(String.valueOf(score));
    }


    /*** Increase the score for Hector by 1 point.     */
    public void winHector(View v) {
        scoreHector = scoreHector ++ ;
        displayForHector(scoreHector);
    }

    /*** Decrease the score for Hector by 1 point.     */
    public void cheatHector(View v) {
        scoreHector = scoreHector - 1;
        displayForHector(scoreHector);
    }

    /*** Displays the given score for Hector.     */
    public void displayForHector(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hector_score);
        scoreView.setText(String.valueOf(score));
    }


    /*** Reset the scores for Hugo and Hector.     */
    public void resetScores(View v) {
        scoreHugo = 0;
        scoreHector = 0;
        displayForHugo(scoreHugo);
        displayForHector(scoreHector);
    }

    /*** Displays Hugo and Hector reset.     */
    public void displayReset(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hector_score + R.id.hugo_score);
        scoreView.setText(String.valueOf(score));
    }
}

