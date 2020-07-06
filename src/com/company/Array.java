package com.company;

import java.util.*;

/*
 1.	имеется массив чисел, получить список вида {число, количество вхождений числа в массив},
 список должен быть отсортирован по количеству вхождений,
 внутри по возрастания числа. Использовать можно любой алгоритмический язык.
 */

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of elements in the array: ");
        int num = in.nextInt();

        System.out.println("Enter array elements: ");
        List<Integer> setNumbers = new ArrayList<>();
        Set<Integer> uniqueNumber = new HashSet<>();
        Map<Integer, Integer> response = new HashMap<>();

        for (int i = 0; i < num; i++) {
            int elementForArray = in.nextInt();
            uniqueNumber.add(elementForArray);
            setNumbers.add(elementForArray);
        }

        for (Integer elementHasSet : uniqueNumber) {
            int amount = 0;
            for (Integer setNumber : setNumbers) {
                if (elementHasSet.equals(setNumber)) {
                    amount = amount + 1;
                }
                response.put(elementHasSet, amount);
            }
        }

        response.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
