package com.tc.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView thingsToDoCard;
    CardView placesToGoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    //One method to include both buttons on the main activity screen
    private void setupClickListeners() {
        thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        placesToGoCard = findViewById(R.id.card_view_places_to_go);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsToDoActivityIntent = new Intent(MainActivity.this, thingsToDoActivity.class);
                startActivity(thingsToDoActivityIntent);
            }
        });

        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesToGoActivityIntent = new Intent(MainActivity.this, placesToGoActivity.class);
                startActivity(placesToGoActivityIntent);
            }
        });
    }
}