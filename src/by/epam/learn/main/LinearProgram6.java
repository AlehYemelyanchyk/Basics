package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of x:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of y:");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.println((x >= -4 && x <= 4) && (y >= -3 && y <= 4));

    }

}
