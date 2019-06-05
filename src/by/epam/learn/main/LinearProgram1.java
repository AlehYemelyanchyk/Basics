package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram1 {

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

        int z = ((a - 3) * b / 2) + c;
        System.out.println("Function value is z = " + z);
    }

}
