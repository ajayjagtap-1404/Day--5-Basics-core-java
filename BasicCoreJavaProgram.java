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
