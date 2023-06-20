package com.example.knowyouranimals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Know Your Animals Lab - Set up listeners for each of the Buttons on the screen.
                                   When a Button is clicked, the ImageView should display
                                   the image of the animal represented by the Button. */
        ImageView animalImage = findViewById(R.id.animal_image);

        Button horseButton = findViewById(R.id.horse_button);
        horseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animalImage.setImageDrawable(getDrawable(R.drawable.horse));
            }
        });

    }
}