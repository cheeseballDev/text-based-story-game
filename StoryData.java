package StoryGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoryData {
    private ArrayList<String> recipes;
    private ArrayList<String> questions;
    private Map<String,String> AnswerAndChoice;

    /*
    String introDialogue = 

    public String getDialogue(int number) {

        return this.
    }
    */

    public StoryData() {
        AnswerAndChoice = new HashMap<String,String>();
        AnswerAndChoice.put("A", "");
        AnswerAndChoice.put("B","");
        AnswerAndChoice.put("C","");
        AnswerAndChoice.put("D","");
    }

}

