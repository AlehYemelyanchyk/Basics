package by.epam.learn.main;

import java.util.Scanner;

public class BranchingProgram4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Side A of a hole:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Side B of a hole:");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Side X of a brick:");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Side Y of a brick:");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Side Z of a brick:");
        int z = scanner.nextInt();
        scanner.nextLine();

        int minBrickSide1;
        int minBrickSide2;
        if (x >= y && x >= z) {
            minBrickSide1 = y;
            minBrickSide2 = z;
        } else if (y >= x && y >= z) {
            minBrickSide1 = x;
            minBrickSide2 = z;
        } else {
            minBrickSide1 = y;
            minBrickSide2 = x;
        }
        if (minBrickSide1 <= a && minBrickSide2 <= b) {
            System.out.println("The brick can pass.");
        } else if (minBrickSide1 <= b && minBrickSide2 <= a) {
            System.out.println("The brick can pass.");
        } else {
            System.out.println("The brick can not pass.");
        }

    }

}
