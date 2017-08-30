package com.example.paulofelipeoliveirasouza.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


        public void display_3_teamA(View view){
            scoreTeamA= scoreTeamA+3;
            displayForTeamA(scoreTeamA);
        }

        public void display_2_teamA(View view){
            scoreTeamA = scoreTeamA+ 2;
            displayForTeamA(scoreTeamA);
        }

        public void display_1_teamA(View view){
            scoreTeamA = scoreTeamA+ 1;
            displayForTeamA(scoreTeamA);
        }

        public void displayForTeamA(int score){
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));

        }


        public void display_3_teamB(View view){
            scoreTeamB= scoreTeamB+3;
            displayForTeamB(scoreTeamB);
        }

        public void display_2_teamB(View view){
            scoreTeamB = scoreTeamB+2;
            displayForTeamB(scoreTeamB);
        }

        public void display_1_teamB(View view){
            scoreTeamB =scoreTeamB+1;
            displayForTeamB(scoreTeamB);
        }

        public void displayForTeamB(int score){
            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
            scoreView.setText(String.valueOf(score));

        }

        public void resetScore(View v){
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamA);
        }
}
