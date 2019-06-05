package by.epam.learn.main;

import java.util.Scanner;

public class BranchingProgram5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number x:");
        double x = scanner.nextInt();
        scanner.nextLine();
        double y;
        y = x <= 3 ? (Math.pow(x, 2) - 3 * x + 9) : (1 / (Math.pow(x, 3) + 6));
        System.out.println("y = " + y);


    }

}
