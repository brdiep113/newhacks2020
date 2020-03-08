package com.example.newhacks2020;

import java.util.ArrayList;

public class StoryBoard {

    private String mp3File; // the mp3 file's name
    private String scene_text; //the story text for the current scene
    private StoryBoard previous_scene = null; //the previous scene
    private ArrayList<StoryBoard> boards; //the possible story paths that this board can go down

    public StoryBoard(String scene, String soundfile) {
        mp3File = soundfile;


    }
    public void addStoryBoard(StoryBoard board) //adds a substory board to boards
    {
        this.boards.add(board);
    }

    public String getScene_text() { // scene text
        return scene_text;
    }

    public String getMp3File() { // returns mp3 filename
        return mp3File;
    }

    public StoryBoard getPrevious_scene() {
        return previous_scene;
    }

    public ArrayList<StoryBoard> getBoards() {
        return this.boards;
    }

    public void setScene_text(String text) {
        this.scene_text = text;
    }

    public void setPrevious_scene(StoryBoard previous_scene){
        this.previous_scene = previous_scene;
    }

}
