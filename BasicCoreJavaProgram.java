package com.assigenement.day_5.basic_core_java;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic java Program :");
     //   Scanner sc = new Scanner(System.in);

        BasicCoreJavaProgram basicCoreJavaProgram = new BasicCoreJavaProgram();
        basicCoreJavaProgram.findPowerOfTwo();

    }
     void findPowerOfTwo() {
        int Total = 0;
        System.out.println("Enter the Power of 2:");
        Scanner sc = new Scanner(System.in);
        int Power = sc.nextInt();
        for (int i = 0; i <= Power; i++) {
            Total = (int) Math.pow(2, i);
            System.out.print(" power is : " + Total);
        }
    }
}
