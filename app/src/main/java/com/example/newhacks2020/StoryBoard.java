package com.example.newhacks2020;

import java.util.ArrayList;

public class StoryBoard {

    private String mp3File; // the mp3 file's name
    private String scene_text; //the story text for the current scene
    private StoryBoard previous_scene = null; //the previous scene
    private String prompt1; // the first subprompt
    private String prompt2; // the second subprompt
    private StoryBoard board1 = null;
    private StoryBoard board2 = null;


    public StoryBoard(String soundfile, String scene_text) {
        this.mp3File = soundfile;
        this.scene_text = scene_text;

    }

    public void loadBoard1(StoryBoard board){
        this.board1 = board;
    }

    public void loadBoard2(StoryBoard board){
        this.board2 = board;
    }

    public StoryBoard getBoard1(){return this.board1;}
    public StoryBoard getBoard2(){return this.board2;}

    public StoryBoard checkPrompt(String prompt) //checks userinput against prompts & returns corresponding storyboard, if any
    {
        if (prompt == this.prompt1)
            {
                return this.board1;
            }
        else if (prompt == this.prompt2)
            {
                return this.board2;
            }
        return null;
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

    public void setScene_text(String text) {
        this.scene_text = text;
    }

    public void setPrevious_scene(StoryBoard previous_scene){
        this.previous_scene = previous_scene;
    }

}
