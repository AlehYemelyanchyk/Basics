package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of T (seconds):");
        long t = scanner.nextLong();
        scanner.nextLine();

        long hour = (t / 3600);
        int min = (int) ((t % 3600) / 60);
        int sec = (int) ((t % 3600) % 60);
        System.out.println(hour + "h " + min + "m " + sec + "s");

    }

}
