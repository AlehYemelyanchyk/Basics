package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int number = 0;

        while (!quit) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();
            scanner.nextLine();
            if (number>0) {
                quit = true;
            }
        }
        int sum = 1;

        for (int i = 2; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);


    }

}
