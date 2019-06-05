package by.epam.learn.main;

public class LoopProgram3 {

    public static void main(String[] args) {

        int number = 100;
        int sum = 1;

        for (int i = 2; i <= number; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("Sum of the squares = " + sum);

    }

}
