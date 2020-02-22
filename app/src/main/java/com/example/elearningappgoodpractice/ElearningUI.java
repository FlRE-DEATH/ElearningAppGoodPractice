package com.example.elearningappgoodpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElearningUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearning_ui);
    }
    //todo code for  these images to react to clicks and open new layouts of videos that can be played.
    //also todo add relevant images to each subject. https://www.youtube.com/watch?v=Nn4-Vn7qk9k
    //add a new activity for each button.
    //make each screen exit-able.

    public void math (View V)
    {
        Intent intentmath = new Intent(this, MathActivity.class);

        startActivity(intentmath);

        //math e primu'.
    }


    // to be continued.
}
