package StoryGame;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class StoryData {
    private String question;
    private List<String> choices;
    private String correctAnswer;
    private List<StoryData> questions = new ArrayList<>();

    private Map<String,String> AnswerAndChoice = new HashMap<String,String>();;
    String[] dialogues = new String[10];

    public String getDialogue(int number) {
        return dialogues[number];
    }

    public String getQuestion() {
        return this.question;
    }

    public List<String> getChoices() {
        return this.choices;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public StoryData(String question, List<String> choices, String correctAnswer) {
        dialogues[0] = "\nPRESS ENTER TO CONTINUE.";
        dialogues[1] = "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307";
        dialogues[2] = "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n:";
        dialogues[3] = "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.\n";
        dialogues[4] = "(HOW TO PLAY) To progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!";
        dialogues[5] = "Okay rat, It's your first day.\nI'm sure you got the memo earlier, but in just case, you're going to be starting with the easy ones.";
        
        
    }
}

