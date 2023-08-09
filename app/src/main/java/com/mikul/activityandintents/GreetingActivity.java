package com.mikul.activityandintents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    private TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        textViewGreeting = findViewById(R.id.textViewGreeting);

        Intent intent = getIntent();
        if (intent.hasExtra("user_name")) {
            String name = intent.getStringExtra("user_name");
            textViewGreeting.setText("Hello, " + name + "!");
        }
    }
}
