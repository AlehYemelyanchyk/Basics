package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of a:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of b:");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of c:");
        int c = scanner.nextInt();
        scanner.nextLine();

        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("Value of z = " + z);

    }

}
