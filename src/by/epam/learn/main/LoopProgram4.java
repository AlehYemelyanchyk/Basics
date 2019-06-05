package by.epam.learn.main;

import java.math.BigInteger;

public class LoopProgram4 {

    public static void main(String[] args) {

        int number = 20;

        BigInteger mult = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            int iPow2 = (int) Math.pow(i, 2);
            mult = mult.multiply(BigInteger.valueOf(iPow2));
        }

        System.out.println("Multiplication of the squares = " + mult);

    }

}
