package com.example.mobileapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StoryAdapter storyAdapter;
    private List<Story> storyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        storyList = new ArrayList<>();
        storyList.add(new Story("Story 1", "Once upon a time...", "This is the full content of Story 1"));
        storyList.add(new Story("Story 2", "A long journey began...", "This is the full content of Story 2"));
        storyList.add(new Story("Story 3", "A hidden treasure was found...", "This is the full content of Story 3"));

        storyAdapter = new StoryAdapter(storyList, this);
        recyclerView.setAdapter(storyAdapter);
    }
}
