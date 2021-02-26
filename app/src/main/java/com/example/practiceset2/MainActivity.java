package com.example.cricketScoreCalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cricketScoreCalculator.R;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int wicketA = 0;
    int wicketB = 0;
    String printmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixA (View view){
        scoreA = scoreA + 6;
        display_scoreA(scoreA);
    }

    public void fourA (View view){
        scoreA = scoreA + 4;
        display_scoreA(scoreA);
    }

    public void singleA (View view){
        scoreA = scoreA + 1;
        display_scoreA(scoreA);
    }

    public void wicketA (View view){
        if (wicketA<10) {
            wicketA = wicketA + 1;
            display_wicketA(wicketA);
        }
    }

    private void display_scoreA(int number){
        TextView scoreTextView = (TextView) findViewById(R.id.scoreA);
        scoreTextView.setText("" + number + " /");
    }

    private void display_wicketA(int number){
        TextView wicketTextView = (TextView) findViewById(R.id.wicketA);
        wicketTextView.setText("" + number);
    }

    public void sixB (View view){
        scoreB = scoreB + 6;
        display_scoreB(scoreB);
    }

    public void fourB (View view){
        scoreB = scoreB + 4;
        display_scoreB(scoreB);
    }

    public void singleB (View view){
        scoreB = scoreB + 1;
        display_scoreB(scoreB);
    }

    public void wicketB (View view){
        if (wicketB<10) {
            wicketB = wicketB + 1;
            display_wicketB(wicketB);
        }
    }

    private void display_scoreB(int number){
        TextView scoreBTextView = (TextView) findViewById(R.id.scoreB);
        scoreBTextView.setText("" + number + " /");
    }

    private void display_wicketB(int number){
        TextView wicketTextView = (TextView) findViewById(R.id.wicketB);
        wicketTextView.setText("" + number);
    }

    public void comparision (View view){
        if(scoreB > scoreA){
           printmessage = "Team B leads the game by " + (scoreB - scoreA) + " runs";
           if (wicketB > wicketA){
               printmessage = printmessage + " with " + (wicketB - wicketA) + " extra wickets";
           }
           else if (wicketB < wicketA){
               printmessage = printmessage + " with " + (wicketA - wicketB) + " less wickets";
           }
           else if (wicketA == 0 && wicketB == 0){
               printmessage = printmessage + " with no wicket loss";
           }
       }
        else if(scoreA > scoreB){
            printmessage = "Team A leads the game by " + (scoreA - scoreB) + " runs";
            if (wicketB > wicketA){
                printmessage = printmessage + " with " + (wicketB - wicketA) + " less wickets";
            }
            else if (wicketB < wicketA){
                printmessage = printmessage + " with " + (wicketA - wicketB) + " more wickets";
            }
            else if (wicketA == 0 && wicketB == 0){
                printmessage = printmessage + " with no wicket loss";
            }
        }
        else{
            printmessage = "Score levels";
            if (wicketB > wicketA){
                printmessage = printmessage + " with Team A having " + (wicketB - wicketA) + " less wickets";
            }
            else if (wicketB < wicketA){
                printmessage = printmessage + " with Team B having " + (wicketA - wicketB) + " less wickets";
            }
            else if (wicketA == 0 && wicketB == 0){
                printmessage = printmessage + " with no wicket loss";
            }
        }
        displayMessage(printmessage);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.comparision);
        priceTextView.setText(message);
    }

    public void reset (View view){
        scoreA = 0;
        scoreB = 0;
        wicketA = 0;
        wicketB = 0;
        printmessage = "";
        display_scoreA(scoreA);
        display_wicketA(wicketA);
        display_scoreB(scoreB);
        display_wicketB(wicketB);
        displayMessage(printmessage);
    }

}