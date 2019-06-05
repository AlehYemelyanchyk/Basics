package by.epam.learn.main;

import java.util.Scanner;

public class LinearProgram4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of R:");
        double r = scanner.nextDouble();
        scanner.nextLine();
        int rWholeInt = (int) r;
        double rDecimals = Math.round(r % rWholeInt * 1000);
        double rInverted = rDecimals + ((double) rWholeInt / 1000);
        System.out.println("Inverted R = " + rInverted);

    }

}
