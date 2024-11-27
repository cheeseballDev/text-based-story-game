public class Data implements DataFunctions {

    private String[] instructionsDialogues = new String[10];
    private String[] gusteauDialogues = new String[8];
    private String[] tateDialogues = new String[10];
    private String[] deathDialogues = new String[3];
    private String[] recipes = new String[5];

    public String getInstructionDialogue(int number) {
        return instructionsDialogues[number];
    }

    public String getGusteauDialogue(int number) {
        return gusteauDialogues[number];
    }

    public String getTateDialogue(int number) {
        return tateDialogues[number];
    }

    public String getDeathDialogue(int number) {
        return deathDialogues [number];
    }

    public Data() {
        instructionsDialogues[0] = "\nPRESS ENTER TO CONTINUE.";
        instructionsDialogues[1] = "Welcome to RATS IN PARIS\nCreated by: Villar, Matthew from BSIT 307";
        instructionsDialogues[2] = "RATS IN PARIS\n1 - Start Game\n2 - Cookbook\n3 - Exit\n> ";
        instructionsDialogues[3] = "In a world where rats are welcomed to become functional members of society.\nYmer, the marshal of town rat, was (un)fortunately selected to become an assistant for a sous-chef in a 5 star restaurant.";
        instructionsDialogues[4] = "(HOW TO PLAY)\nTo progress in each level, you will need to select the corresponding steps in order to assist the sous chef in cooking the specified dish!";
        instructionsDialogues[5] = "\n1 - Continue\n2 - Open Cookbook\n> ";
        instructionsDialogues[6] = "Your dish to cook is: ";
        instructionsDialogues[7] = "\n1 - Restart\n2 - Cookbook\n3 - Back to Menu\n4 - Exit\n> ";
        gusteauDialogues[0] = "Gusteau: Okay rat, It's your first day.\nGusteau: I'm sure you got the memo earlier, but in just case, you're going to be starting with the easy ones.";
        gusteauDialogues[1] = "Gusteau: Hmm... Not bad for a rat, you're lucky the first step was easy.";
        gusteauDialogues[2] = "Gusteau: Again, don't think too much of your success. We have barely even started.";
        gusteauDialogues[3] = "Gusteau: This is unbelievable! A rat who can cook?!?!";
        gusteauDialogues[4] = "Gusteau: Not going to lie rat, you impressed me with the first dish.\nGusteau: Let's see if you can handle the second one";
        gusteauDialogues[5] = "Gusteau: Well done, rat.\nGusteau: Proceed with post-haste! The customer is waiting!";
        gusteauDialogues[6] = "Gusteau: You know, I'm starting to like you, rat. \nGusteau: You're not bad at all. Let's get going.";
        gusteauDialogues[7] = "Gusteau: Rat, you have gained my respect. And for that---";
        tateDialogues[0] = "";
        deathDialogues[0] = "YOU FAILED!\nYou chose the incorrect step!\nYmer will be turned into rat skin for a human's dessert as payment..";
        deathDialogues[1] = "YOU FAILED!\nYou chose the incorrect step!\nYmer got fired, thus losing his ability to provide for his family.";
        deathDialogues[2] = "YOU FAILED!\nYou chose the incorrect step!\nYmer will forever be imprisoned, never to be seen again.";
        recipes[0] = "French Crepes:\n> Step 1: Batter Preparation - Whisk flour, eggs, milk, sugar, salt.\n> Step 2: Cooking the Crepe - Cook in a medium-heat skillet.\n> Step 3: Filling the Crepe - Fill with any combination of sweet or savory ingredients.";
        recipes[1] = "Coq au Vin:\n> Step 1: Browning the Chicken - Brown in butter.\n> Step 2: Simmering - Simmer with red wine, mushrooms, and carrots.\n> Step 3: Finishing - Finish with a sprinkle of parsley.";
        recipes[2] = "Bouillabaisse:\n> Step 1: Base Preparation - Sauté onions, garlic, fennel.\n> Step 2: Adding Seafood - Add mussels, clams, and crab.\n> Step 3: Serving - Serve with crusty bread and rouille.";
        recipes[3] = "Creme brulee:\n> Step 1: Making the Custard - Whisk together eggs, sugar, and heavy cream.\n> Step 2: Baking - Bake in a preheated oven at 350°F.\n> Step 3: Torching - Torch with a kitchen torch.";
        recipes[4] = "Ratatouille:\n> Step 1: Vegetable Preparation - Cut vegetables into cubes.\n> Step 2: Simmering - Simmer for 30 minutes.\n> Step 3: Baking - Bake uncovered."; 
    }
}