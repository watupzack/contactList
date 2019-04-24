package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    static boolean exitChosen = false;
    public static int userInput;

    static ArrayList<String[]> dataBase = new ArrayList();

    static void run() {
        System.out.println("Welcome to your contact list!");
        while (true) {
            if (exitChosen == true)
                break;
            View.menuAppear();
            View.askForAnswer();
            View.answerHandle();
        }
    }
}
