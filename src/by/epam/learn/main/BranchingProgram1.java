package by.epam.learn.main;

import java.util.Scanner;

public class BranchingProgram1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the angle of the corner 1:");
        int corner1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the angle of the corner 2:");
        int corner2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the angle of the corner 3:");
        int corner3 = scanner.nextInt();
        scanner.nextLine();
        if (corner1 > 0 && corner2 > 0 && corner3 > 0 && corner1 + corner2 + corner3 == 180) {
            System.out.println("Such triangle exists.");
            if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
                System.out.println("The triangle is right-angled.");
            } else {
                System.out.println("The triangle is not right-angled");
            }
        } else {
            System.out.println("Such triangle does not exist.");
        }

    }

}
