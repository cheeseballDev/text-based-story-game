package StoryGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StoryData implements Functions {
    private Map<Integer, Map<String, String>> quiz = new HashMap<>();
    private String[] dialogues = new String[10];
    private Map<String, String> frenchCrepes = new HashMap<>();
    private Map<String, String> coqAuVin = new HashMap<>();
    private Map<String, String> bouillabaisse = new HashMap<>();
    private Map<String, String> cremeBrulee = new HashMap<>();
    private Map<String, String> ratatouille = new HashMap<>();
    private String[][] recipes = new String[3][3];

    public String getDialogue(int number) {
        return dialogues[number];
    }

    public StoryData() {
        dialogues[0] = "\nPRESS ENTER TO CONTINUE.";
        dialogues[1] = "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307";
        dialogues[2] = "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n:";
        dialogues[3] = "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.\n";
        dialogues[4] = "(HOW TO PLAY) To progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!";
        dialogues[5] = "Okay rat, It's your first day.\nI'm sure you got the memo earlier, but in just case, you're going to be starting with the easy ones.";

        frenchCrepes.put("A","");
        frenchCrepes.put("B","");
        frenchCrepes.put("C","");
        frenchCrepes.put("D","");
        quiz.put(1, frenchCrepes);

        coqAuVin.put("A","");
        coqAuVin.put("B","");
        coqAuVin.put("C","");
        coqAuVin.put("D","");
        quiz.put(2, coqAuVin);

        bouillabaisse.put("A","");
        bouillabaisse.put("B","");
        bouillabaisse.put("C","");
        bouillabaisse.put("D","");
        quiz.put(3, bouillabaisse);

        cremeBrulee.put("A","");
        cremeBrulee.put("B","");
        cremeBrulee.put("C","");
        cremeBrulee.put("D","");
        quiz.put(4, cremeBrulee);

        ratatouille.put("A","");
        ratatouille.put("B","");
        ratatouille.put("C","");
        ratatouille.put("D","");
        quiz.put(4, ratatouille);

        recipes[0][0] = {
            "", ""
            
        }
    }
}

