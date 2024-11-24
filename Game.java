    
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Game extends Story implements Checkpoints, Runnable {
    private boolean firstTime;
    private List<Quiz> frenchCrepes = new ArrayList<>();
    private List<Quiz> coqAuVin = new ArrayList<>();
    private List<Quiz> bouillabasse = new ArrayList<>();
    private List<Quiz> cremeBrulee = new ArrayList<>();
    private List<Quiz> ratatouille = new ArrayList<>();
    private int levelNumber;
    private Map<Integer, List<Quiz>> levels = new HashMap<>();

    public Game() {
        frenchCrepes.add(new Quiz("French crepes","\nStep 1 - Batter preparation:", List.of(
            "\nA. Whisk flour, eggs, milk, sugar, salt.", 
            "\nB. Mix flour, eggs, water, salt.", 
            "\nC. Combine flour, sugar, butter, milk.", 
            "\nD. Blend flour, eggs, oil, salt."), 
            "A"));
        frenchCrepes.add(new Quiz("French crepes","\nStep 2 - Cooking the crepe:", List.of(
            "\nA. Cook in a high-heat skillet.", 
            "\nB. Cook in a low-heat skillet.", 
            "\nC. Cook in a medium-heat skillet.", 
            "\nD. Cook in a microwave."), 
            "C"));
        frenchCrepes.add(new Quiz("French crepes","\nStep 3 - Filling the crepe:", List.of(
            "\nA. Fill with only sweet ingredients like sugar and fruit.", 
            "\nB. Fill with only savory ingredients like cheese and vegetables.", 
            "\nC. Fill with any combination of sweet or savory ingredients.", 
            "\nD. Fill with only meat."), 
            "C"));
        levels.put(1, frenchCrepes);
        
        coqAuVin.add(new Quiz("Coq au Vin","\nStep 1 - Browning the chicken:", List.of(
            "\nA. Steam chicken with herbs.", 
            "\nB. Bake chicken in cream.", 
            "\nC. Grill chicken with olive oil.", 
            "\nD. Sear chicken in butter."), 
            "D"));
        coqAuVin.add(new Quiz("Coq au Vin","\nStep 2 - Simmering:", List.of(
            "\nA. Simmer chicken in milk, thyme, and potatoes.", 
            "\nB. Simmer chicken with red wine, mushrooms, and carrots.", 
            "\nC. Simmer chicken with tomatoes, olives, and rice.", 
            "\nD. Simmer chicken with water, celery, and potatoes."), 
            "B"));
        coqAuVin.add(new Quiz("Coq au Vin","\nStep 3 - Finishing:", List.of(
            "\nA. Garnish with shredded cheese.", 
            "\nB. Top with toasted breadcrumbs.", 
            "\nC. Sprinkle parsley before serving.", 
            "\nD. Drizzle with lemon juice."), 
            "C"));
        levels.put(2, coqAuVin);

        bouillabasse.add(new Quiz("Bouillabasse","\nStep 1 - Base preparation:", List.of(
            "\nA. Sauté onions, garlic, carrots.", 
            "\nB. Sauté onions, garlic, fennel.", 
            "\nC. Sauté onions, peppers, zucchini.", 
            "\nD. Sauté onions, garlic, potatoes."), 
            "B"));
        bouillabasse.add(new Quiz("Bouillabasse", "\nStep 2 - Adding seafood:", List.of(
            "\nA. Add shrimp, salmon, and cod.", 
            "\nB. Add oysters, squid, and scallops..", 
            "\nC. Add tuna, mackerel, and sardines.", 
            "\nD. Add mussels, clams, and crab."), 
            "D"));
        bouillabasse.add(new Quiz("Bouillabasse","\nStep 3 - Serving:", List.of(
            "\nA. Serve with rice.", 
            "\nB. Serve with pasta.", 
            "\nC. Serve with crusty bread and rouille.", 
            "\nD. Serve with mashed potatoes."), 
            "C"));
        levels.put(3, bouillabasse);

        cremeBrulee.add(new Quiz("Creme brulee","\nStep 1 - Making the custard:", List.of(
            "\nA. Whisk eggs, sugar, and heavy cream.", 
            "\nB. Blend eggs, milk, and chocolate.", 
            "\nC. Mix sugar, eggs, and butter.", 
            "\nD. Combine eggs, flour, and yogurt."), 
            "A"));
        cremeBrulee.add(new Quiz("Creme brulee","\nStep 2 - Baking:", List.of(
            "\nA. Bake in a preheated oven at 400°F.", 
            "\nB. Bake in a preheated oven at 350°F.", 
            "\nC. Bake in a preheated oven at 250°F.", 
            "\nD. Bake in a preheated oven at 500°F."), 
            "B"));
        cremeBrulee.add(new Quiz("Creme brulee","\nStep 3 - Torching:", List.of(
            "\nA. Sprinkle with salt and torch using a hair dryer.", 
            "\nB. Sprinkle sugar and torch with a kitchen torch.", 
            "\nC. Spread butter and broil until brown.", 
            "\nD. Dust cocoa powder and use a lighter to caramelize."), 
            "B"));
        levels.put(4, cremeBrulee);

        ratatouille.add(new Quiz("Ratatouille","\nStep 1 - Vegetable preparation:", List.of(
            "\nA. Cut vegetables into cubes.", 
            "\nB. Cut vegetables into strips.", 
            "\nC. Cut vegetables into slices.", 
            "\nD. Cut vegetables into rounds."), 
            "A"));
        ratatouille.add(new Quiz("Ratatouille","\nStep 2 - Simmering:", List.of(
            "\nA. Simmer for 10 minutes.", 
            "\nB. Simmer for 30 minutes.", 
            "\nC. Simmer for 1 hour.", 
            "\nD. Simmer for 2 hours."), 
            "B"));
        ratatouille.add(new Quiz("Ratatouille","\nStep 3 - Baking:", List.of(
            "\nA. Bake uncovered.", 
            "\nB. Bake covered.", 
            "\nC. Bake in a slow cooker.", 
            "\nD. Bake in a microwave."), 
            "A"));
        levels.put(5, ratatouille);
        clearScreen();
    }

    void startGame() {
        Scanner userInput = new Scanner(System.in);
        showDialogue(getInstructionDialogue(1).toCharArray());
        System.out.println(getInstructionDialogue(0));
        userInput.nextLine();
        clearScreen();

        while (true) {
            System.out.print(getInstructionDialogue(2));
            String choice = userInput.nextLine();
            checkChoice(userInput, choice);
        }
    }

    void checkChoice(Scanner userInput, String choice) {
        switch (choice) {
            case "1":
                startIntro(userInput);
                break;
            case "2":
                showCookbook(userInput);
                break;
            case "3":
                System.exit(0);
                break;
            default:
            printErrorMessage("Invalid choice! Please try again");
        }
    }

    void startIntro(Scanner userInput) {
        clearScreen();
        showDialogue(getInstructionDialogue(3).toCharArray());
        System.out.println(getInstructionDialogue(0));
        userInput.nextLine();
        if (firstTime) {
            clearScreen();
            showDialogue(getInstructionDialogue(4).toCharArray());
            System.out.println(getInstructionDialogue(0));
            userInput.nextLine();
        }
        clearScreen();
        startLevel(userInput);
    }

    void startLevel(Scanner userInput) {
        setFirstTimeStatusToFalse();
        Random randomNumber = new Random();
        levelNumber = randomNumber.nextInt(1,4);

        showDialogue(getNPCDialogue(0).toCharArray());
        System.out.println(getInstructionDialogue(0));
        userInput.nextLine();
        clearScreen();
        
        for (Quiz quiz : levels.get(levelNumber)) {
            System.out.println(quiz.changeToString());
            userInput.nextLine();
        }
    }

    void fail() {

    }

    void showCookbook(Scanner userInput) {

    }

    public void setCheckpointNumber() {
        
    }

    public void setFirstTimeStatusToFalse() {
        this.firstTime = false;
    }
    /*
     * 
     * MISC
     * 
     */
    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private void showDialogue(char[] dialogue) {
        char[] characters = dialogue;
        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run();
        }
    }

    private void printErrorMessage(String errorMessage) {
        clearScreen();
        System.out.print(errorMessage);
        char[] characters = {'.', ' ', '.', ' ', '.', ' ', '.'};

        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run();
        }
        clearScreen();
    }
    public void run() {
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
