package com.example.elearningappgoodpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//gen login screen
    void showToast(String text)
{
    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //todo code for this login screen to be functional. DONE

    //todo make code more modular. maybe implement the more classes thingy like u did before with methods and variables.


    public void login(View view) {
        Intent intentElearningUI = new Intent(this, ElearningUI.class);

        EditText emailText = (EditText) findViewById(R.id.email_textInput);
        EditText passwordText = (EditText) findViewById(R.id.password_textInput);

        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();
        if(email.equals("a")&&password.equals("b"))
            {
                startActivity(intentElearningUI);
            }
        else    { showToast("Login failed. Please retry");

        }
    }

    //imi va mai trebui un al3lea layout pentru un video de la o anumita materie.
    //imi va mai trebui cate un layout scrollable la fiecare materiecu videourile in ordine probabil
    //imi va mai trebui sa fac main layout scrollable (maybe).
}
