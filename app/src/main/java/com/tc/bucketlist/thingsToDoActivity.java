package com.tc.bucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class thingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);

        RecyclerView list = findViewById(R.id.recycler_view_things);

        //Item list using the ListItem class
        ListItem[] items = {

                new ListItem("Create a Meaningful App", "I want to create an app that would help people to be more environmentally friendly", R.drawable.environment),
                new ListItem("Create a Fun App", "I want to create a fun app, that could entertain someone and lift their spirits", R.drawable.funapp),
                new ListItem("Pet Cats", "I want to befriend at least 20 cats", R.drawable.cat),
                new ListItem("Pet Dogs", "Dogs are great, so target is to befriend at least 30 dogs", R.drawable.dog),
                new ListItem("Perform Aerobatics Routine", "Need to get pilots licence and do aerobatics course, then I can create and perform a nice routine", R.drawable.aerobatics),
                new ListItem("Learn to surf", "Surfing seems fun but challenging too, one day!", R.drawable.surf),
        };

        //Custom adapter in use
        ItemsAdapter adapter = new ItemsAdapter(items);
        list.setAdapter(adapter);
    }
}
