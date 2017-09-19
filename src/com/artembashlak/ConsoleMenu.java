package com.artembashlak;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleMenu {



    public static int index = -1;

    public static int productId = 1;

    private boolean isRemeberPassword = false;

    private boolean conditionalExit = true;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void doAction() {
        System.out.println("Hello");
        try {
            startMenu();
        } catch (IOException e) {
            System.err.println("PROGRAM CRASHED ! ");
        }

    }

    private void startMenu() throws IOException {
        do {
            chooseRole();

        } while (conditionalExit);
    }

    private void chooseRole() throws IOException {
        System.out.println("Select role :: " + "\t" + "1-Administrator   2-Manager  3-Guest");
        int number = 0;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Incorrect input expected integers.");
            System.out.println("No selected role. Choose your access :");
            chooseRole();
        }
        switch (number) {
            case 1:
                System.out.println("\t\tMENU\t" + Role.ADMINISTRATOR);
                getAccessAdmin();
                break;
            case 2:
                System.out.println("\t\tMENU\t" + Role.MANAGER);
                createNewRecord();
                backToMainMenu();
                break;
            case 3:
                System.out.println("\t\tMENU\t" + Role.GUEST);
                chooseRole();
                break;
            default:
                System.out.println("No selected role. Choose your access :");
                chooseRole();
        }
    }

    private void getAccessAdmin() {
    }

    private void createNewRecord() throws IOException {

    }

    private void backToMainMenu() throws IOException {

    }
}

