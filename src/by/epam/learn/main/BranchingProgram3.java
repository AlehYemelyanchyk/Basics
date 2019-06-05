package by.epam.learn.main;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class BranchingProgram3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter coordinate X of a point A:");
        int x1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter coordinate Y of a point A:");
        int y1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter coordinate X of a point B:");
        int x2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter coordinate Y of a point B:");
        int y2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter coordinate X of a point C:");
        int x3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter coordinate Y of a point C:");
        int y3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("3. ");
        double a3 = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b3 = sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c3 = sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double p = (a3 + b3 + c3) / 2;
        double square = sqrt(p * (p - a3) * (p - b3) * (p - c3));
        if (square == 0) {
            System.out.println("The points are on the same straight line.");
        } else {
            System.out.println("The points are not on the same straight line.");
        }

    }

}
