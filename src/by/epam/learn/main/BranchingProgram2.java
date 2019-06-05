package by.epam.learn.main;

import java.util.Scanner;

public class BranchingProgram2 {

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
        System.out.println("Enter the number of d:");
        int d = scanner.nextInt();
        scanner.nextLine();

        int minAB;
        int minCD;
        int maxFromMin;

        minAB = a <= b ? a : b;
        minCD = c <= d ? c : d;

        maxFromMin = minAB > minCD ? minAB : minCD;

        System.out.println("Max from min = " + maxFromMin);

    }

}
