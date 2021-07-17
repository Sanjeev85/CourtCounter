package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Displays Score of team A
     * */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    public void onePointer_A(View view) {
        displayForTeamA(++teamAScore);
    }

    public void twoPointer_A(View view) {
        displayForTeamA(teamAScore += 2);
    }

    public void threePointer_A(View view) {
        displayForTeamA(teamAScore += 3);
    }

    public void onePointer_B(View view) {
        displayForTeamB(++teamBScore);
    }

    public void twoPointer_B(View view) {
        displayForTeamB(teamBScore += 2);
    }

    public void threePointer_B(View view) {
        displayForTeamB(teamBScore += 3);
    }

}