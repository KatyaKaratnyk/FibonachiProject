package com.butterfly;

import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    private static BigInteger fibonachi(BigInteger currentVal, BigInteger nextVal, int counter) {
        if (counter != 0) {
            return fibonachi(nextVal, currentVal.add(nextVal), --counter);
        }
        return currentVal;
    }

    private static BigInteger fibonachi (int numberFibonachi) {
        if (numberFibonachi==1) return new BigInteger("1");
        if (numberFibonachi==2) return new BigInteger("1");
        return (fibonachi(numberFibonachi-1)).add(fibonachi(numberFibonachi-2));
    }
    private static double even (int numberFibonachi) {
        if ((numberFibonachi==1)||(numberFibonachi==2)) {
            return 0;
        }
        int k = numberFibonachi/3;
        return (double)k/numberFibonachi*100;
    }
    private static double odd (int numberFibonachi) {
        if ((numberFibonachi==1)||(numberFibonachi==2)) {
            return 100;
        }
        int k = numberFibonachi/3;
        return (1-(double)k/numberFibonachi)*100;
    }
    public  static void  main (String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int count = sc.nextInt();
            if (count > 0) {
                for (int i = 1; i<=count; i++) {
                    System.out.printf("%d: %,d\n", i, fibonachi(BigInteger.ONE, BigInteger.ONE, i));
                }
                System.out.printf("The percent of even numbers %.2f%%\n", even(count));
                System.out.printf("The percent of odd numbers %.2f%%\n", odd(count));
            }
            else {
                System.out.println("You entered not a possitive integer number");
            }
        }
        else {
            System.out.println("You entered not an integer number");
        }

    }

}
