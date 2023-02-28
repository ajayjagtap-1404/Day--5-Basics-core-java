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
        System.out.println("---------------------------------");
        System.out.println("Program for Even odd check :");
        int number = 15;
        basicCoreJavaProgram.CheckEvenOdd(number);
        System.out.println("---------------------------------");
        System.out.println("Check Whether an Alphabet is Vowel or Consonant :");
        char ch = 'a';
        basicCoreJavaProgram.checkVowelOrConsonant(ch);
        System.out.println("---------------------------------");
        System.out.println("find LargestAmong Three numbers :");
        int num1 = 3, num2 = 2, num3 = 1;
        basicCoreJavaProgram.findLargestAmongThree(num1,num2,num3);
        System.out.println("---------------------------------");
    }
    void findLargestAmongThree(int num1,int num2,int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+ " number is greater");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+ " number is greater");

        } else {
            System.out.println(num3+ " number is greater");
        }
    }
    void checkVowelOrConsonant(char ch) {

        if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u') {

            System.out.println(ch +" is vowel");

        } else {
            System.out.println(ch +" is consonant");
        }
    }
    void CheckEvenOdd(int number) {
        if (number > 1) {
            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }
        } else {
            System.out.println("enter greater than one number");
        }
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
