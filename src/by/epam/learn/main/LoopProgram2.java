package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter A:");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter B:");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter h:");
        double h = scanner.nextDouble();
        scanner.nextLine();

        while (a < b) {
            double x = a;
            double y = x > 2 ? x : -x;
            a += h;
            System.out.println("y" + "(" + x + ")" + " = " + y);
        }

    }


}
