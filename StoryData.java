package StoryGame;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
public class StoryData implements Functions {
    private String[] instructionsDialogues = new String[4];
    private String[] NPCDialogues = new String[10];
    private String[][] recipes = new String[5][5];
    private String step;
    private List<String> choices;
    private String correctAnswer;
    private List<StoryData> frenchCrepes = new HashMap<>();
    private List<StoryData> coqAuVin = new HashMap<>();
    private Map<Integer, List<Object>> levels = new HashMaps<>();

    public String getInstructionDialogue(int number) {
        return instructionsDialogues[number];
    }

    public String getNPCDialogue(int number) {
        return NPCDialogues[number];
    }

    public StoryData(String step, List<String> choices,  String correctAnswer) {
        instructionsDialogues[0] = "\nPRESS ENTER TO CONTINUE.";
        instructionsDialogues[1] = "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307";
        instructionsDialogues[2] = "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n:";
        instructionsDialogues[3] = "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.\n";
        instructionsDialogues[4] = "(HOW TO PLAY) To progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!";
        NPCDialogues[5] = "Gusteau: Okay rat, It's your first day.\nI'm sure you got the memo earlier, but in just case, you're going to be starting with the easy ones.";
        NPCDialogues[6] = "Gusteau: Hmm... Not bad for a rat, you’re lucky the first step was easy.";
        NPCDialogues[7] = "Gusteau: Again, don’t think too much of your success. We have barely even started.";
        NPCDialogues[8] = "Gusteau: This is unbelievable! A rat who can cook?!?!";

        frenchCrepes.add(new StoryData("Step 1", List.of(
            "\nA. Whisk flour, eggs, milk, sugar, salt.", 
            "\nB. Mix flour, eggs, water, salt.", 
            "\nC. Combine flour, sugar, butter, milk.", 
            "\nD. Blend flour, eggs, oil, salt."), 
            "A"));
        frenchCrepes.add(new StoryData("Step 2", List.of(
            "\nA. Cook in a high-heat skillet.", 
            "\nB. Cook in a low-heat skillet.", 
            "\nC. Cook in a medium-heat skillet.", 
            "\nD. Cook in a microwave."), 
            "C"));
        frenchCrepes.add(new StoryData("Step 3", List.of(
            "\nA. Fill with only sweet ingredients like sugar and fruit.", 
            "\nB. Fill with only savory ingredients like cheese and vegetables.", 
            "\nC. Fill with any combination of sweet or savory ingredients.", 
            "\nD. Fill with only meat."), 
            "C"));
        levels.put(1, frenchCrepes);
        
        coqAuVin.add(new StoryData("Step 1 - ", List.of(
            "\nA. Steam chicken with herbs.", 
            "\nB. Bake chicken in cream.", 
            "\nC. Grill chicken with olive oil.", 
            "\nD. Sear chicken in butter."), 
            "D"));
        coqAuVin.add(new StoryData("Step 2 - Simmering", List.of(
            "\nA. Simmer chicken in milk, thyme, and potatoes.", 
            "\nB. Simmer chicken with red wine, mushrooms, and carrots.", 
            "\nC. Simmer chicken with tomatoes, olives, and rice.", 
            "\nD. Simmer chicken with water, celery, and potatoes."), 
            "B"));
        coqAuVin.add(new StoryData("Step 3", List.of(
            "\nA. Garnish with shredded cheese.", 
            "\nB. Top with toasted breadcrumbs.", 
            "\nC. Sprinkle parsley before serving.", 
            "\nD. Drizzle with lemon juice."), 
            "C"));
        levels.put(2, coqAuVin);


    }
}

