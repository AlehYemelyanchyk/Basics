package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of x:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of y:");
        int y = scanner.nextInt();
        scanner.nextLine();
        double z = (Math.sin(Math.toRadians(x)) + Math.cos(Math.toRadians(y))) /
                (Math.cos(Math.toRadians(x)) - Math.sin(Math.toRadians(y))) *
                Math.tan(Math.toRadians(x * y));
        System.out.println("Value of z = " + z);
    }

}
