package com.lingevan.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        displayText=findViewById(R.id.textLabel);
        submitButton.setOnClickListener(new View.OnClickListener() {
            int i =0;
            @Override
            public void onClick(View view) {
                Log.i("testButton", "Amazing message!");
                displayText.setText(""+i++);
            }
        });
    }

    public void smile(View view) {
        //different way to make
    }
}
