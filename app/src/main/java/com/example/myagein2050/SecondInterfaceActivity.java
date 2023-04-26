package com.example.myagein2050;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;



public class SecondInterfaceActivity extends AppCompatActivity {

    private TextView ageIn2050TextView;
    private Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_interface);

        ageIn2050TextView = findViewById(R.id.age_in_2050_text_view);
        returnButton = findViewById(R.id.return_button);

        // Get the ageIn2050 value from the Intent
        int ageIn2050 = getIntent().getIntExtra("age", 0);

        // Display the ageIn2050 value in the TextView
        ageIn2050TextView.setText("You will be " + ageIn2050 + " years old in 2050.");

        // Set a click listener on the Return Button to return to the MainActivity
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageView imageView = findViewById(R.id.imageview);
        if (ageIn2050<0) {
            imageView.setImageResource(R.drawable.impossible);
            imageView.setVisibility(View.VISIBLE);
        } else {
            if (ageIn2050<20) {imageView.setImageResource(R.drawable.baabyshark);
            imageView.setVisibility(View.VISIBLE);
            }else {
                if (ageIn2050<60) {imageView.setImageResource(R.drawable.adulte);
                    imageView.setVisibility(View.VISIBLE);
            }else {
                    if (ageIn2050<80) {imageView.setImageResource(R.drawable.deathbed);
                        imageView.setVisibility(View.VISIBLE);
                }else {
                        imageView.setImageResource(R.drawable.rip);
                        imageView.setVisibility(View.VISIBLE);
                    }
        }

    }
}}}


