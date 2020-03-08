package com.example.newhacks2020;

import java.util.ArrayList;

public class Storyboard {

    private String scene_text;
    private Storyboard previous_scene = null;
    private ArrayList<Storyboard> paths;

    public Storyboard(String scene) {
    }

    public String getSceneText() {
        return scene_text;
    }

    public Storyboard getPrevious_scene() {
        return previous_scene;
    }

    public ArrayList<Storyboard> getPaths() {
        return paths;
    }

    public void addPath(Storyboard newPath) {
        this.paths.add(newPath);
    }

    public void setScene_text(String text) {
        this.scene_text = text;
    }

    public void setPrevious_scene(Storyboard previous_scene){
        this.previous_scene = previous_scene;
    }

}
