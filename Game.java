    
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Game extends Data implements GameFunctions, Runnable, Miscellaneous {
    private boolean firstTime;
    private int levelNumber;
    private int gusteauDialogueNumber = 1;
    private boolean startLevel = true;
    private List<Quiz> frenchCrepes = new ArrayList<>();
    private List<Quiz> coqAuVin = new ArrayList<>();
    private List<Quiz> bouillabasse = new ArrayList<>();
    private List<Quiz> cremeBrulee = new ArrayList<>();
    private List<Quiz> ratatouille = new ArrayList<>();
    private Map<Integer, List<Quiz>> levels = new HashMap<>();

    public Game() {
        frenchCrepes.add(new Quiz("French crepes",": Step 1 - Batter preparation:", List.of(
            "\nA. Whisk flour, eggs, milk, sugar, salt.", 
            "\nB. Mix flour, eggs, water, salt.", 
            "\nC. Combine flour, sugar, butter, milk.", 
            "\nD. Blend flour, eggs, oil, salt.\n> "), 
            "A"));
        frenchCrepes.add(new Quiz("French crepes",": Step 2 - Cooking the crepe:", List.of(
            "\nA. Cook in a high-heat skillet.", 
            "\nB. Cook in a low-heat skillet.", 
            "\nC. Cook in a medium-heat skillet.", 
            "\nD. Cook in a microwave.\n> "), 
            "C"));
        frenchCrepes.add(new Quiz("French crepes",": Step 3 - Filling the crepe:", List.of(
            "\nA. Fill with only sweet ingredients like sugar and fruit.", 
            "\nB. Fill with only savory ingredients like cheese and vegetables.", 
            "\nC. Fill with any combination of sweet or savory ingredients.", 
            "\nD. Fill with only meat.\n> "), 
            "C"));
        levels.put(1, frenchCrepes);
        
        coqAuVin.add(new Quiz("Coq au Vin",": Step 1 - Browning the chicken:", List.of(
            "\nA. Steam chicken with herbs.", 
            "\nB. Bake chicken in cream.", 
            "\nC. Grill chicken with olive oil.", 
            "\nD. Sear chicken in butter.\n> "), 
            "D"));
        coqAuVin.add(new Quiz("Coq au Vin",": Step 2 - Simmering:", List.of(
            "\nA. Simmer chicken in milk, thyme, and potatoes.", 
            "\nB. Simmer chicken with red wine, mushrooms, and carrots.", 
            "\nC. Simmer chicken with tomatoes, olives, and rice.", 
            "\nD. Simmer chicken with water, celery, and potatoes.\n> "), 
            "B"));
        coqAuVin.add(new Quiz("Coq au Vin",": Step 3 - Finishing:", List.of(
            "\nA. Garnish with shredded cheese.", 
            "\nB. Top with toasted breadcrumbs.", 
            "\nC. Sprinkle parsley before serving.", 
            "\nD. Drizzle with lemon juice.\n> "), 
            "C"));
        levels.put(2, coqAuVin);

        bouillabasse.add(new Quiz("Bouillabasse",": Step 1 - Base preparation:", List.of(
            "\nA. Sauté onions, garlic, carrots.", 
            "\nB. Sauté onions, garlic, fennel.", 
            "\nC. Sauté onions, peppers, zucchini.", 
            "\nD. Sauté onions, garlic, potatoes.\n> "), 
            "B"));
        bouillabasse.add(new Quiz("Bouillabasse", ": Step 2 - Adding seafood:", List.of(
            "\nA. Add shrimp, salmon, and cod.", 
            "\nB. Add oysters, squid, and scallops..", 
            "\nC. Add tuna, mackerel, and sardines.", 
            "\nD. Add mussels, clams, and crab.\n> "), 
            "D"));
        bouillabasse.add(new Quiz("Bouillabasse",": Step 3 - Serving:", List.of(
            "\nA. Serve with rice.", 
            "\nB. Serve with pasta.", 
            "\nC. Serve with crusty bread and rouille.", 
            "\nD. Serve with mashed potatoes.\n> "), 
            "C"));
        levels.put(3, bouillabasse);

        cremeBrulee.add(new Quiz("Creme brulee",": Step 1 - Making the custard:", List.of(
            "\nA. Whisk eggs, sugar, and heavy cream.", 
            "\nB. Blend eggs, milk, and chocolate.", 
            "\nC. Mix sugar, eggs, and butter.", 
            "\nD. Combine eggs, flour, and yogurt.\n> "), 
            "A"));
        cremeBrulee.add(new Quiz("Creme brulee",": Step 2 - Baking:", List.of(
            "\nA. Bake in a preheated oven at 400°F.", 
            "\nB. Bake in a preheated oven at 350°F.", 
            "\nC. Bake in a preheated oven at 250°F.", 
            "\nD. Bake in a preheated oven at 500°F.\n> "), 
            "B"));
        cremeBrulee.add(new Quiz("Creme brulee",": Step 3 - Torching:", List.of(
            "\nA. Sprinkle with salt and torch using a hair dryer.", 
            "\nB. Sprinkle sugar and torch with a kitchen torch.", 
            "\nC. Spread butter and broil until brown.", 
            "\nD. Dust cocoa powder and use a lighter to caramelize.\n> "), 
            "B"));
        levels.put(4, cremeBrulee);

        ratatouille.add(new Quiz("Ratatouille",": Step 1 - Vegetable preparation:", List.of(
            "\nA. Cut vegetables into cubes.", 
            "\nB. Cut vegetables into strips.", 
            "\nC. Cut vegetables into slices.", 
            "\nD. Cut vegetables into rounds.\n> "), 
            "A"));
        ratatouille.add(new Quiz("Ratatouille",": Step 2 - Simmering:", List.of(
            "\nA. Simmer for 10 minutes.", 
            "\nB. Simmer for 30 minutes.", 
            "\nC. Simmer for 1 hour.", 
            "\nD. Simmer for 2 hours."), 
            "B"));
        ratatouille.add(new Quiz("Ratatouille",": Step 3 - Baking:", List.of(
            "\nA. Bake uncovered.", 
            "\nB. Bake covered.", 
            "\nC. Bake in a slow cooker.", 
            "\nD. Bake in a microwave.\n> "), 
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

    private void checkChoice(Scanner userInput, String choice) {
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

    private void startIntro(Scanner userInput) {
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

    private void startLevel(Scanner userInput) {
        setFirstTimeStatusToFalse();
        Random randomNumber = new Random();
        this.levelNumber = randomNumber.nextInt(1,5);

        showDialogue(getGusteauDialogue(0).toCharArray());
        System.out.println(getInstructionDialogue(0));
        userInput.nextLine();
        clearScreen();
        while (true) {
            for (Quiz quiz : levels.get(levelNumber)) {
                while (startLevel) {
                    showDialogue((getInstructionDialogue(6) + quiz.getCuisine()).toCharArray());
                    System.out.print(getInstructionDialogue(5));
                    String choice = userInput.nextLine();
                    if (choice.equals("2")) {
                        showCookbook(userInput);
                        continue;
                    } else if (!choice.equals("1")) {
                        printErrorMessage("Invalid choice! Please try again");
                    }
                    clearScreen();
                    break;
                }

                    while(gusteauDialogueNumber < 8) {
                        System.out.print(quiz.changeToString());
                        String multipleChoiceAnswer = userInput.nextLine().toUpperCase().trim();
    
                        if (!multipleChoiceAnswer.equals("A") && !multipleChoiceAnswer.equals("B") && !multipleChoiceAnswer.equals("C") && !multipleChoiceAnswer.equals("D")) {
                            printErrorMessage("Invalid entry! Please try again");
                            gusteauDialogueNumber--;
                            continue;
                        } else if (!multipleChoiceAnswer.equals(quiz.getCorrectAnswer())) {
                            fail(userInput);
                        }
    
                        clearScreen();
                        showDialogue(getGusteauDialogue(gusteauDialogueNumber).toCharArray());
                        System.out.println(getInstructionDialogue(0));
                        userInput.nextLine();
                        clearScreen();
                        break;
                    }
    
                    startLevel = false;
                    gusteauDialogueNumber++;
                    if (gusteauDialogueNumber == 4) {
                        startLevel = true;
                        showDialogue(getGusteauDialogue(gusteauDialogueNumber).toCharArray());
                        System.out.println(getInstructionDialogue(0));
                        userInput.nextLine();
                        clearScreen();
                        while (true) {
                            int tempNumber = randomNumber.nextInt(1,4);
                            if (tempNumber == this.levelNumber) {
                                continue;
                            }
                            this.levelNumber = tempNumber;
                            break;
                        }
                    gusteauDialogueNumber++;
                }
                if (gusteauDialogueNumber == 8) {
                    break;
                }
            }
            if (gusteauDialogueNumber == 8) {
                break;
            }
        }
        bossLevel(userInput);
    }

    private void bossLevel(Scanner userInput) {
        System.out.println("Start boss level (to be implemented)");
        System.exit(0);
    }

    
    private void fail(Scanner userInput) {
        clearScreen();
        gusteauDialogueNumber = 1;
        Random randomNumber = new Random();
        showDialogue(getDeathDialogue(randomNumber.nextInt(0,2)).toCharArray());
        while (true) {
            System.out.print(getInstructionDialogue(7));
            String choice = userInput.nextLine();
            switch (choice) {
                case "1":
                    clearScreen();
                    startLevel(userInput);
                    break;
                case "2":
                    showCookbook(userInput);
                    continue;
                case "3":
                    startGame();
                    break;
                case "4":
                    System.exit(0);
                default:
                    printErrorMessage("Invalid choice! Please try again");
            }
        }
    }  

    private void showCookbook(Scanner userInput) {
        clearScreen();
        while (true) {
            System.out.println("FIRST PAGE");
            
        }
    }

    public void setFirstTimeStatusToFalse() {
        this.firstTime = false;
    }


    /*
     * 
     * MISC
     * 
     */
    public void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public void showDialogue(char[] dialogue) {
        char[] characters = dialogue;
        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run();
        }
    }

    public void printErrorMessage(String errorMessage) {
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
            Thread.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
