public class Story implements StoryFunctions {

    private String[] instructionsDialogues = new String[10];
    private String[] gusteauDialogues = new String[10];
    private String[] tateDialogues = new String[10];
    private String[][] recipes = new String[5][5];

    public String getInstructionDialogue(int number) {
        return instructionsDialogues[number];
    }

    public String getGusteauDialogue(int number) {
        return gusteauDialogues[number];
    }

    public String getTateDialogue(int number) {
        return tateDialogues[number];
    }

    public Story() {
        instructionsDialogues[0] = "\nPRESS ENTER TO CONTINUE.";
        instructionsDialogues[1] = "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307";
        instructionsDialogues[2] = "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n> ";
        instructionsDialogues[3] = "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.";
        instructionsDialogues[4] = "(HOW TO PLAY)\nTo progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!";
        instructionsDialogues[5] = "\n1 - Continue\n2 - Open Cookbook\n> ";
        instructionsDialogues[6] = "Your dish to cook is: ";
        gusteauDialogues[0] = "Gusteau: Okay rat, It's your first day.\nGusteau: I'm sure you got the memo earlier, but in just case, you're going to be starting with the easy ones.";
        gusteauDialogues[1] = "Gusteau: Hmm... Not bad for a rat, you're lucky the first step was easy.";
        gusteauDialogues[2] = "Gusteau: Again, don't think too much of your success. We have barely even started.";
        gusteauDialogues[3] = "Gusteau: This is unbelievable! A rat who can cook?!?!";
        gusteauDialogues[4] = "Gusteau: Not going to lie rat, you impressed me with the first dish.\nGusteau: Let's see if you can handle the second one";
        gusteauDialogues[5] = "";
        gusteauDialogues[6] = "";
        tateDialogues[0] = "";
    }

}