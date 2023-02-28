package com.assigenement.day_5.basic_core_java;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic java Program :");

        System.out.println("Enter the number of time to flip coin ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        double head = 0;
        double tail = 0;

        for (int i = 0; i < input; i++) {

            double num = Math.floor(Math.random() * 10)%2;
            System.out.println("Random  number is " +num);
            System.out.println();
            if (num < 0.5) {
                tail++;
            } else {
                head++;
            }
            System.out.println("heads:" + head);
            System.out.println("tail: " + tail);

            // percentage
        }
        double headsPercentage = (head / input) * 100;
        double tailsPercentage = (tail / input) * 100;

        System.out.println("Percentage of head :" + headsPercentage);
        System.out.println("Percentage of tails :" + tailsPercentage);


    }
}
