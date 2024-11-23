package StoryGame;

import java.util.Scanner;
import java.util.Random;

public class Story extends StoryData implements Checkpoints, Runnable {

    public Story() {
        clearScreen();
    }

    void startGame() {
        Scanner userInput = new Scanner(System.in);
        showDialogue(getDialogue(1).toCharArray());
        System.out.println("\nPRESS ENTER TO CONTINUE");
        userInput.nextLine();
        clearScreen();
        while (true) {
            System.out.print(getDialogue(2));
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
        showDialogue(getDialogue(3).toCharArray());
        System.out.println("PRESS ENTER TO CONTINUE.");
        userInput.nextLine();
        if (firstTime) {
            showDialogue(getDialogue(4).toCharArray());
            System.out.println("\nPRESS ENTER TO CONTINUE");
            userInput.nextLine();
        }
    }

    void startLevel() {
        Random randomNumber = new Random();
        while (true) {
            
        }
    }

    void showCookbook() {

    }

    public void setCheckpointNumber() {
        
    }

    public void setFirstTimeStatus() {
        
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
            runSlow();
        }
        clearScreen();
    }

    public void runSlow() {
        try {
            Thread.sleep(350);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
