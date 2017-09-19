package com.artembashlak;

public class Main {
    public static void main(String[] args) {

        try {
            new ConsoleMenu().doAction();
        } catch (Exception e) {
            System.err.println("PROGRAM CRASHED !");
            System.out.println(e);
            e.printStackTrace();
        }

    }
}

