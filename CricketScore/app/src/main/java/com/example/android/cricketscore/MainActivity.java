package com.example.android.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       int runs=0;
    int balls=0;
    int overs=0;
    int wickets=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addone(View v){
        runs=runs+1;
        displayForRuns(runs);
    }
    public void addfour(View v){
        runs=runs+4;
        displayForRuns(runs);
    }
    public void addsix(View v){
        runs=runs+6;
        displayForRuns(runs);
    }
    public void addonetoballs(View v){
        balls=balls+1;
        displayForBalls(balls);
    }
    public void removeoneforballs(View v){
        balls=balls-1;
        displayForBalls(balls);
    }
    public void addonetoovers(View v){
        overs=overs+1;
        displayForOvers(overs);
    }
    public void removeonetoovers(View v){
        overs=overs-1;
        displayForOvers(overs);
    }
    public void addonetowikets(View v){
        wickets=wickets+1;
        displayForWikets(wickets);
    }
    public void removeonetowikets(View v){
        wickets=wickets+1;
        displayForWikets(wickets);
    }
    public void reset(View v){
        runs=0;
        balls=0;
        overs=0;
        wickets=0;
        displayForWikets(wickets);
        displayForOvers(overs);
        displayForRuns(runs);
        displayForBalls(balls);
    }
    public void displayForRuns(int score){
        TextView scoreView = (TextView) findViewById(R.id.runs_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBalls(int score){
        TextView scoreView = (TextView) findViewById(R.id.balls_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForOvers(int score){
        TextView scoreView = (TextView) findViewById(R.id.overs_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForWikets(int score){
        TextView scoreView = (TextView) findViewById(R.id.wikets_score);
        scoreView.setText(String.valueOf(score));
    }
}
