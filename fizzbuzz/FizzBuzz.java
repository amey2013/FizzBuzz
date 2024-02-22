package org.amaap.fizzbuzz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public static List<String> fizzbuzz(int limit) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                result.add("" + i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = 0;

        while (true) {
            try {
                System.out.println("Enter the Limit :");
                limit = scanner.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
        }

        System.out.println(fizzbuzz(limit));
    }
}}
