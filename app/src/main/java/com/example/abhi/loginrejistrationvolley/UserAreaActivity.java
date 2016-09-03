package com.example.abhi.loginrejistrationvolley;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {
     EditText etUsername,etAge;
     TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        etUsername=(EditText)findViewById(R.id.etUsername);
        etAge=(EditText)findViewById(R.id.etAge);
        welcomeMessage=(TextView)findViewById(R.id.tvWelcomeMsg);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String username=intent.getStringExtra("username");
        int age=intent.getIntExtra("age", -1);

        String message=name+" welcome to your user area";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age+"");

    }
}
