package StoryGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoryData {
    private ArrayList<String> recipes;
    private ArrayList<String> questions;
    private Map<String,String> AnswerAndChoice;
    private Map<Integer, String> dialogues = new HashMap<Integer, String>(); 
    
    public String getDialogue(int number) {
        return dialogues.get(number);
    }

    public StoryData() {
        dialogues.put(1, "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307");
        dialogues.put(2, "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n:");
        dialogues.put(3, "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.");
        dialogues.put(4, "(HOW TO PLAY) To progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!");
        AnswerAndChoice = new HashMap<String,String>();
        AnswerAndChoice.put("A", "");
        AnswerAndChoice.put("B","");
        AnswerAndChoice.put("C","");
        AnswerAndChoice.put("D","");
    }

}

