package com.assigenement.day_5.basic_core_java;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic java Program :");


        BasicCoreJavaProgram basicCoreJavaProgram = new BasicCoreJavaProgram();
        int power = 3;
        basicCoreJavaProgram.findPowerOfTwo(power);
        System.out.println();
        System.out.println("---------------------------------");
        int harmonicNum = 5;
        basicCoreJavaProgram.harmonicNumber(harmonicNum);
        System.out.println("---------------------------------");
        int num = 18;
        basicCoreJavaProgram.findPrimeFactors(num);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Quotient and Remainder are :");
        int dividend = 11;
        int divisor = 2;
        basicCoreJavaProgram.findQuotientAndRemainder(dividend,divisor);
        System.out.println("---------------------------------");
        System.out.println("Swapping of numbers ");
        basicCoreJavaProgram.swappingOfTwoNumbers();

    }
    void swappingOfTwoNumbers() {
        int temp = 0 , number1 = 10, number2 = 20;
        System.out.println("number one before swapping "+number1);
        System.out.println("number two before swapping "+number2);
        System.out.println();

        // swapping
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Number one after swapping " +number1);
        System.out.println("Number two after swapping " +number2);

    }
    void findQuotientAndRemainder(int dividend, int divisor) {

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("quotient = "+quotient);
        System.out.println("remainder = "+remainder);
    }


    void findPrimeFactors(int num) {
        System.out.println("Prime factor of " + num+ " are :");

        int i = 1;

        while (i * i <= num) {
            i++;
            while (num % i == 0) {
                num = num / i;
                //  System.out.println(num);
                System.out.print(i + " ");

            }

        }
        if (num != 1) {
            System.out.println(num);
        }
    }
    void harmonicNumber(int harmonicNum) {
        System.out.println(" Nth harmonic number: ");
        double total = 0;
        for (int i = 1; i <= harmonicNum; i++) {
            total = total + (double) 1 / i;

        }

        System.out.println(harmonicNum + " th Harmonic no is: " + total);
    }
        void findPowerOfTwo(int power) {
            System.out.println("Power of 2 upto  " + power+ " time  is :");
        int Total = 0;
            for (int i = 0; i <= power; i++) {
            Total = (int) Math.pow(2, i);
            System.out.print( Total +" ");
        }

    }
}
