package com.example.newhacks2020;

import org.json.JSONObject;

public class StoryboardManager {

    private Storyboard current_scene;
    //private JSONObject scenarios = JSONObject(asset);

    public StoryboardManager(String scenario) {
        current_scene = new Storyboard(scenario);
    }

    public void progressStory(int choice) {
        this.current_scene = current_scene.getPaths().get(choice);
    }
}