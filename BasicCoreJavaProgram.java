package com.assigenement.day_5.basic_core_java;

import java.util.Scanner;

public class BasicCoreJavaProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Basic java Program :");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year you want to check Leap year or not :");
        int year = sc .nextInt();
        if (year > 1000 && year < 9999) {

            if( (year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " Leap Year ");
            } else {
                System.out.println(year + " not  Leap Year ");

            }
        } else {
            System.out.println("please Enter four digit number");
        }

    }
}
