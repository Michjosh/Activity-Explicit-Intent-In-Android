package com.mikul.activityandintents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(view -> {
            String name = editTextName.getText().toString();
            Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
            intent.putExtra("user_name", name);
            startActivity(intent);
        });
    }
}
