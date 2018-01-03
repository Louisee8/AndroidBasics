package com.example.android.p3;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Question 1 radio buttons
    /*** Users chooses answer1a ***/
    public void q1aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer1a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer1b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer1c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer1b ***/
    public void q1bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer1a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer1c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer1d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer1c ***/
    public void q1cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer1a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer1b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer1d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer1d ***/
    public void q1dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer1a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer1b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer1c);
        ansThreeRadioButton.setChecked(false);
    }

    // Question 2 radio buttons
    /*** Users chooses answer2a ***/
    public void q2aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer2a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer2b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer2c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer2b ***/
    public void q2bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer2a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer2c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer2d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer2c ***/
    public void q2cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer2a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer2b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer2d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer2d ***/
    public void q2dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer2a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer2b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer2c);
        ansThreeRadioButton.setChecked(false);
    }

    // Question 6 radio buttons
    /*** Users chooses answer6a ***/
    public void q6aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer6a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer6b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer6c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer6b ***/
    public void q6bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer6a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer6c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer6d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer6c ***/
    public void q6cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer6a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer6b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer6d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer6d ***/
    public void q6dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer6a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer6b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer6c);
        ansThreeRadioButton.setChecked(false);
    }

    // Question 7 radio buttons
    /*** Users chooses answer7a ***/
    public void q7aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer7a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer7b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer7c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer7b ***/
    public void q7bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer7a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer7c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer7d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer7c ***/
    public void q7cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer7a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer7b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer7d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer7d ***/
    public void q7dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer7a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer7b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer7c);
        ansThreeRadioButton.setChecked(false);
    }

    // Question 8 radio buttons
    /*** Users chooses answer8a ***/
    public void q8aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer8a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer8b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer8c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer8b ***/
    public void q8bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer8a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer8c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer8d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer8c ***/
    public void q8cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer8a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer8b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer8d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer8d ***/
    public void q8dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer8a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer8b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer8c);
        ansThreeRadioButton.setChecked(false);
    }

    // Question 9 radio buttons
    /*** Users chooses answer9a ***/
    public void q9aRadioButtonPressed(View view) {
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer9a);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer9b);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer9c);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer9b ***/
    public void q9bRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer9a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer9c);
        ansThreeRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer9d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer9c ***/
    public void q9cRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer9a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer9b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansFourRadioButton = (RadioButton) findViewById(R.id.answer9d);
        ansFourRadioButton.setChecked(false);
    }
    /*** Users chooses answer9d ***/
    public void q9dRadioButtonPressed(View view) {
        RadioButton ansOneRadioButton = (RadioButton) findViewById(R.id.answer9a);
        ansOneRadioButton.setChecked(false);
        RadioButton ansTwoRadioButton = (RadioButton) findViewById(R.id.answer9b);
        ansTwoRadioButton.setChecked(false);
        RadioButton ansThreeRadioButton = (RadioButton) findViewById(R.id.answer9c);
        ansThreeRadioButton.setChecked(false);
    }


    /*** Submit button ***/
    public void submit(View view) {

        int score = 0;

        RadioButton q1answera = (RadioButton) findViewById(R.id.answer1a);
        RadioButton q2answerb = (RadioButton) findViewById(R.id.answer2b);
        EditText q3answer = (EditText) findViewById(R.id.answer3);
        CheckBox q4answera = (CheckBox) findViewById(R.id.answer4a);
        CheckBox q4answerb = (CheckBox) findViewById(R.id.answer4b);
        CheckBox q4answerc = (CheckBox) findViewById(R.id.answer4c);
        CheckBox q4answerd = (CheckBox) findViewById(R.id.answer4d);
        CheckBox q5answera = (CheckBox) findViewById(R.id.answer5a);
        CheckBox q5answerb = (CheckBox) findViewById(R.id.answer5b);
        CheckBox q5answerc = (CheckBox) findViewById(R.id.answer5c);
        CheckBox q5answerd = (CheckBox) findViewById(R.id.answer5d);
        RadioButton q6answerd = (RadioButton) findViewById(R.id.answer6d);
        RadioButton q7answerd = (RadioButton) findViewById(R.id.answer7d);
        RadioButton q8answerd = (RadioButton) findViewById(R.id.answer8d);
        RadioButton q9answerb = (RadioButton) findViewById(R.id.answer9b);
        EditText q10answer = (EditText) findViewById(R.id.answer10);

        if (q1answera.isChecked()) {
            score++;
        }
        if (q2answerb.isChecked()) {
            score++;
        }
        if (q3answer.getText().toString().equalsIgnoreCase("Wheek")) {
            score++;
        }
        if (q4answera.isChecked() && q4answerb.isChecked() && q4answerc.isChecked() && q4answerd.isChecked()) {
            score++;
        }
        if (q5answera.isChecked() && q5answerb.isChecked() && q5answerc.isChecked() && q5answerd.isChecked()) {
            score++;
        }
        if (q6answerd.isChecked()) {
            score++;
        }
        if (q7answerd.isChecked()) {
            score++;
        }
        if (q8answerd.isChecked()) {
            score++;
        }
        if (q9answerb.isChecked()) {
            score++;
        }
        if (q10answer.getText().toString().equalsIgnoreCase("Yes")) {
            score++;
        }

        Toast t = null;
        if (score >= 6) {
            t = Toast.makeText(this, "Your score: " + score + "/6! Guinea pig pro!", Toast.LENGTH_LONG);
        } else if (score >= 3) {
            t = Toast.makeText(this, "Your score: " + score + "/6! You need to improve!", Toast.LENGTH_LONG);
        } else if(score != 0) {
            t = Toast.makeText(this, "Your score: " + score + "/6! You really suck!", Toast.LENGTH_LONG);
        } else {
            t = Toast.makeText(this, "Your score: " + score + "/6! Loser!", Toast.LENGTH_LONG);
        }
        t.show();
    }
}