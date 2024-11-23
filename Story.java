package StoryGame;

import java.util.Scanner;

public class Story implements Checkpoints {

    public Story() {
        clearScreen();
    }

    void startGame() {
        Scanner userInput = new Scanner(System.in);
        showDialogue("Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307".toCharArray());
        System.out.println("\nPRESS ENTER TO CONTINUE");
        userInput.nextLine();
        clearScreen();
        while (true) {
            System.out.print("RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n: ");
            String choice = userInput.nextLine();
            checkChoice(choice);
        }
    }

    void checkChoice(String choice) {
        switch (choice) {
            case "1":
                startIntro();
                break;
            case "2":
                showCookbook();
                break;
            case "3":
                System.exit(0);
                break;
            default:
            printErrorMessage("Invalid choice! Please try again");
        }
    }

    void startIntro() {
        Scanner userInput = new Scanner(System.in);
        clearScreen();
        showDialogue("In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.".toCharArray());
        System.out.println("PRESS ENTER TO CONTINUE.");
        userInput.nextLine();
        if (firstTime) {
            showDialogue("(HOW TO PLAY) To progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!".toCharArray());
            System.out.println("\nPRESS ENTER TO CONTINUE");
            userInput.nextLine();
        }
    }

    void startLevel() {
        
    }

    void showCookbook() {

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
            run(50);
        }
    }

    private void printErrorMessage(String errorMessage) {
        clearScreen();
        System.out.print(errorMessage);
        char[] characters = {'.', ' ', '.', ' ', '.', ' ', '.'};

        for(int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
            run(350);
        }
        clearScreen();
    }

    public void run(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
