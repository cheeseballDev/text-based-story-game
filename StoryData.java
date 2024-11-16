package StoryGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoryData {
    private String textWelcome = "Welcome to RATS IN PARIS";

    private int checkpointNumber = 0;
    private ArrayList<String> recipes;
    private ArrayList<String> questions;
    private Map<String,String> AnswerAndChoice;

    public StoryData() {
        AnswerAndChoice = new HashMap<String,String>();
        AnswerAndChoice.put("A", "");
        AnswerAndChoice.put("B","");
        AnswerAndChoice.put("C","");
        AnswerAndChoice.put("D","");
    }
    
    /*
     *  public String getRecipes() {

    }

    public String getQuestion() {

    }

    public String getChoiceSet() {
        
        return 
    }


    public String getAnswerKey() {
        
    }

    public void setCheckpointNumber(int newCheckpointNumber) {
        this.checkpointNumber = newCheckpointNumber;
    }

    public int getCheckpointNumber() {
        return this.checkpointNumber;
    }
     */
}

