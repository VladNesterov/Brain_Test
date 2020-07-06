package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
   2.	написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
   т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно
*/

public class Check {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter line with '(' ,')' and '[' , ']' : ");
        String line = in.nextLine();
        PriorityQueue<Character> priorityQueueCircle = new PriorityQueue<>();
        PriorityQueue<Character> priorityQueueSqr = new PriorityQueue<>();
        char[] arrayRegularExpression = line.toCharArray();
        for (int i = 0; i < arrayRegularExpression.length; i++) {
            char c = arrayRegularExpression[i];

            if (c == '(') {
                priorityQueueCircle.add('(');
            }

            if (c == '[') {
                priorityQueueSqr.add('[');
            }

            if (c == ')') {
                if (priorityQueueCircle.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                priorityQueueCircle.poll();
            }

            if (c == ']') {
                if (priorityQueueSqr.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                priorityQueueSqr.poll();
            }

            if ((i == arrayRegularExpression.length - 1) && ((!priorityQueueCircle.isEmpty()) || (!priorityQueueSqr.isEmpty()))) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
