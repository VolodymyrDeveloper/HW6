package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task1
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        numbers.add(18);
        numbers.add(20);
        numbers.add(22);

        System.out.println(numbers);

        numbers.removeIf(integer -> integer % 3 == 0);

        System.out.println(numbers);

        //Task2
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Orange");
        fruits.add("Peach");

        System.out.println(fruits);

        if (fruits.contains("Orange")) {
            for (int i = 0; i < fruits.size(); i++) {
                if (fruits.get(i).equals("Orange")) {
                    fruits.set(i, "Grapefruit");
                }
            }
        } else {
            System.out.println("Orange is not exists");
        }

        System.out.println(fruits);

        //Task2

        List<String> numbers1 = new ArrayList<>();
        numbers1.add("January");
        numbers1.add("February");
        numbers1.add("March");
        numbers1.add("April");

        List<String> numbers2 = new ArrayList<>();

        numbers2.add("May");
        numbers2.add("March");
        numbers2.add("February");

        numbers1.retainAll(numbers2);

        System.out.println(numbers1);
    }

}




