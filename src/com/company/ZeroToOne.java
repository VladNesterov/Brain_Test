package com.company;

import java.util.Scanner;

/*
3.	написать алгоритм, как в целом числе самый правый ноль превратить в единицу не используя циклы и рекурсию.
 */

public class ZeroToOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println("Error");
            return;
        }
        if (num < 0) {
            System.out.println(num % 10);
            if (num % 10 == 0) {
                num = num - 1;
                System.out.println(num);

            }
        } else {
            if (num % 10 == 0) {
                num = num + 1;
                System.out.println(num);
            }
        }

    }


}
