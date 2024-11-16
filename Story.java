package StoryGame;

import java.util.Scanner;

public class Story {

    public Story() {
        clearScreen();
    }

    void startGame() {
        Scanner userInput = new Scanner(System.in);
        showDialogue("Welcome to RATS IN PARIS".toCharArray());
        showDialogue("Press ENTER to continue".toCharArray());
        userInput.nextLine();
        clearScreen();
        menuScreen(userInput);
    }

    void menuScreen(Scanner userInput) {
        while (true) {
            System.out.println("RATS IN PARIS");
            System.out.println("1 - Start Game");
            System.out.println("2 - Cookbook");
            System.out.println("3 - Exit");
            checkValidity(userInput);
        }
        
    }

    void checkValidity(Scanner userInput) {
        while (true) {
            String choice = userInput.nextLine();
            switch (choice) {
                case "1":

                case "2":

                case "3":

                default:

            }
        }
    }

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
