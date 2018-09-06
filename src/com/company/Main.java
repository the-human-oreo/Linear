package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        Console con = System.console();

        if (con == null) {
            System.out.println("No console detected, shutting down.");
            System.exit(0);
        }

        System.out.println("Please enter your name");
        String name = con.readLine();

        System.out.println("Well then welcome " + name + ".");

        System.out.println();
        System.out.println();
        System.out.println("Initialising");
    }
}