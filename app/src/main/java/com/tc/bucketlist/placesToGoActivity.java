package com.tc.bucketlist;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class placesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        RecyclerView list = findViewById(R.id.recycler_view_places);

        //Item list using the ListItem class
        ListItem[] items = {

                new ListItem("Buenos Aires", "Capital city of Argentina and amazing city", R.drawable.buenosaires),
                new ListItem("Saint Petersburg", "Moscow done many times but this one still left to go to", R.drawable.stp),
                new ListItem("Thailand", "From what my travelling friends say, it is a must", R.drawable.thailand),
                new ListItem("Pyramiden", "Ex-USSR town in Norway, for the history and the views", R.drawable.pyramiden),
                new ListItem("New York", "Need to go see what's all the fuss about", R.drawable.newyork),
                new ListItem("Seoul", "For the culture and k-pop. And food!", R.drawable.seoul),

        };

        //Custom adapter in use
        ItemsAdapter adapter = new ItemsAdapter(items);
        list.setAdapter(adapter);
    }
}
