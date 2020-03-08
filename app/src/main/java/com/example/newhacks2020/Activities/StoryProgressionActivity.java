package com.example.newhacks2020.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.newhackstextrecognition.R;

public class StoryProgressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
    }




    public void loadStrings(StoryProgressionActivity nextLine, String prompt, String[] answers, boolean hasNext){
        nextLine.prompt = prompt;
        nextLine.hasNext = hasNext;
        nextLine.answers = answers;
    }
}
