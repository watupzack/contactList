package com.company;

public class View implements ContactOperations{

    static void menuAppear() {
        System.out.println("-----------------------------------------------");
        System.out.println("What will be your actions? (choose from 0 to 4)");
        System.out.println("[1] Create contact");
        System.out.println("[2] Contact list");
        System.out.println("[3] Update contact");
        System.out.println("[4] Delete contact");
        System.out.println("[0] Exit");
    }
    public static void askForAnswer() {
        do {
            App.userInput = App.scanner.nextInt();
            if (App.userInput < 0 || App.userInput > 4)
                System.out.println("Invalid operation, try again!");
        } while(App.userInput < 0 || App.userInput > 4);
    }

    public static void answerHandle() {
        if (App.userInput == 1) {
            ContactOperations.createContact();
        } else if (App.userInput == 2) {
            ContactOperations.listAppear();
        } else if (App.userInput == 3) {
            ContactOperations.updateContact();
        } else if (App.userInput == 4) {
            ContactOperations.deleteContact();
        } else {
            App.exitChosen = true;
        }
    }
}
