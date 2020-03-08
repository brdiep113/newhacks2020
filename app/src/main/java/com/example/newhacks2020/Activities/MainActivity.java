package com.example.newhacks2020.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.newhacks2020.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void settings(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void createStory(View view){
        Intent intent = new Intent(this, CreateStoryActivity.class);
        startActivity(intent);
    }

    public void pickStory(View view){
        Intent intent = new Intent(this, PickStoryActivity.class);
        startActivity(intent);
    }
}
