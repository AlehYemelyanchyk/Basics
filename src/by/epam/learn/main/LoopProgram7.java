package by.epam.learn.main;

import java.util.Scanner;

public class LoopProgram7 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int m = 0;
        int n = 0;
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter m:");
            m = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter n:");
            n = scanner.nextInt();
            scanner.nextLine();
            if (m > 0 && n > 0) {
                quit = true;
            } else {
                System.out.println("'m' and 'n' should be > 0.");
            }
        }

        for (int i = m; i <= n; i++) {
            System.out.print("\n" + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + ",");
                }
            }
        }
    }

}
