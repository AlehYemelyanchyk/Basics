package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram8 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        scanner.nextLine();

        int digit1;
        int digit2;
        String str = "";
        String quitStr = (new StringBuilder().append(Integer.MAX_VALUE).toString());


        int bInitial = b;
        while (a > quitStr.length()) {
            b = bInitial;
            digit1 = a % 10;
            a /= 10;
            while (b > quitStr.length()) {
                digit2 = b % 10;
                b /= 10;
                if (digit1 == digit2) {
                    String digitStr = String.valueOf(digit1);
                    if (!str.contains(digitStr)) {
                        str += digit1 + ",";
                    }

                }
            }
        }
        System.out.print("Common digits: " + str);
    }

}
