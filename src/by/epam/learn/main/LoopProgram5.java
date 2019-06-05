package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter e:");
        double e = scanner.nextDouble();
        scanner.nextLine();

        int n = 1;
        double sum = 0;
        while (n <= e) {
            double expr = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            sum += expr;
            n++;
        }
        System.out.println("Sum = " + sum);
    }

}

