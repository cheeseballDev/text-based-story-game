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
    private List<StoryData> bouillabasse = new HashMap<>();
    private List<StoryData> cremeBrulee = new HashMap<>();
    private List<StoryData> ratatouille = new HashMap<>();
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

        frenchCrepes.add(new StoryData("Step 1 - Batter preparation:", List.of(
            "\nA. Whisk flour, eggs, milk, sugar, salt.", 
            "\nB. Mix flour, eggs, water, salt.", 
            "\nC. Combine flour, sugar, butter, milk.", 
            "\nD. Blend flour, eggs, oil, salt."), 
            "A"));
        frenchCrepes.add(new StoryData("Step 2 - Cooking the crepe:", List.of(
            "\nA. Cook in a high-heat skillet.", 
            "\nB. Cook in a low-heat skillet.", 
            "\nC. Cook in a medium-heat skillet.", 
            "\nD. Cook in a microwave."), 
            "C"));
        frenchCrepes.add(new StoryData("Step 3 - Filling the crepe:", List.of(
            "\nA. Fill with only sweet ingredients like sugar and fruit.", 
            "\nB. Fill with only savory ingredients like cheese and vegetables.", 
            "\nC. Fill with any combination of sweet or savory ingredients.", 
            "\nD. Fill with only meat."), 
            "C"));
        levels.put(1, frenchCrepes);
        
        coqAuVin.add(new StoryData("Step 1 - Browning the chicken:", List.of(
            "\nA. Steam chicken with herbs.", 
            "\nB. Bake chicken in cream.", 
            "\nC. Grill chicken with olive oil.", 
            "\nD. Sear chicken in butter."), 
            "D"));
        coqAuVin.add(new StoryData("Step 2 - Simmering:", List.of(
            "\nA. Simmer chicken in milk, thyme, and potatoes.", 
            "\nB. Simmer chicken with red wine, mushrooms, and carrots.", 
            "\nC. Simmer chicken with tomatoes, olives, and rice.", 
            "\nD. Simmer chicken with water, celery, and potatoes."), 
            "B"));
        coqAuVin.add(new StoryData("Step 3 - Finishing:", List.of(
            "\nA. Garnish with shredded cheese.", 
            "\nB. Top with toasted breadcrumbs.", 
            "\nC. Sprinkle parsley before serving.", 
            "\nD. Drizzle with lemon juice."), 
            "C"));
        levels.put(2, coqAuVin);

        bouillabasse.add(new StoryData("Step 1 - Base preparation:", List.of(
            "\nA. Sauté onions, garlic, carrots.", 
            "\nB. Sauté onions, garlic, fennel.", 
            "\nC. Sauté onions, peppers, zucchini.", 
            "\nD. Sauté onions, garlic, potatoes."), 
            "B"));
        bouillabasse.add(new StoryData("Step 2 - Adding seafood:", List.of(
            "\nA. Add shrimp, salmon, and cod.", 
            "\nB. Add oysters, squid, and scallops..", 
            "\nC. Add tuna, mackerel, and sardines.", 
            "\nD. Add mussels, clams, and crab."), 
            "D"));
        bouillabasse.add(new StoryData("Step 3 - Serving:", List.of(
            "\nA. Serve with rice.", 
            "\nB. Serve with pasta.", 
            "\nC. Serve with crusty bread and rouille.", 
            "\nD. Serve with mashed potatoes."), 
            "C"));
        levels.put(3, bouillabasse);

        cremeBrulee.add(new StoryData("Step 1 - Making the custard:", List.of(
            "\nA. Whisk eggs, sugar, and heavy cream.", 
            "\nB. Blend eggs, milk, and chocolate.", 
            "\nC. Mix sugar, eggs, and butter.", 
            "\nD. Combine eggs, flour, and yogurt."), 
            "A"));
        cremeBrulee.add(new StoryData("Step 2 - Baking:", List.of(
            "\nA. Bake in a preheated oven at 400°F.", 
            "\nB. Bake in a preheated oven at 350°F.", 
            "\nC. Bake in a preheated oven at 250°F.", 
            "\nD. Bake in a preheated oven at 500°F."), 
            "B"));
        cremeBrulee.add(new StoryData("Step 3 - Torching:", List.of(
            "\nA. Sprinkle with salt and torch using a hair dryer.", 
            "\nB. Sprinkle sugar and torch with a kitchen torch.", 
            "\nC. Spread butter and broil until brown.", 
            "\nD. Dust cocoa powder and use a lighter to caramelize."), 
            "B"));
        levels.put(4, cremeBrulee);

        ratatouille.add(new StoryData("Step 1 - Vegetable preparation:", List.of(
            "\nA. Cut vegetables into cubes.", 
            "\nB. Cut vegetables into strips.", 
            "\nC. Cut vegetables into slices.", 
            "\nD. Cut vegetables into rounds."), 
            "A"));
        ratatouille.add(new StoryData("Step 2 - Simmering:", List.of(
            "\nA. Simmer for 10 minutes.", 
            "\nB. Simmer for 30 minutes.", 
            "\nC. Simmer for 1 hour.", 
            "\nD. Simmer for 2 hours."), 
            "B"));
        ratatouille.add(new StoryData("Step 3 - Baking:", List.of(
            "\nA. Bake uncovered.", 
            "\nB. Bake covered.", 
            "\nC. Bake in a slow cooker.", 
            "\nD. Bake in a microwave."), 
            "A"));
        levels.put(5, ratatouille);
    }
}

