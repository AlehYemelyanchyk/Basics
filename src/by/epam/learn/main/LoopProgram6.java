package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter symbol:");
        char ch = scanner.next().charAt(0);
        scanner.nextLine();
        int ascii = ch;

        System.out.println(ascii);

    }
}
