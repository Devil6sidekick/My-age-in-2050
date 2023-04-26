package com.example.myagein2050;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    EditText yearInput;
    Button submitButton;
    Switch switchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yearInput = findViewById(R.id.year_input);
        submitButton = findViewById(R.id.submit_button);
        switchMode = findViewById(R.id.switch_mode);

        // Set the OnCheckedChangeListener for the switch
        switchMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Enable dark mode
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    // Disable dark mode
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = yearInput.getText().toString();
                int age = 2050 - Integer.parseInt(year);
                Intent intent = new Intent(MainActivity.this, SecondInterfaceActivity.class);
                intent.putExtra("age", age);
                startActivity(intent);
            }
        });
    }
}

