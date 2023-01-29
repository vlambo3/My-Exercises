package com.exercises.my.exercises;

import java.util.stream.IntStream;

public class FizzBuzz {

    /*
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
     */

    public static void main(String[] args) {
        fizzBuzzBeforeJava8(100);
        int[] numbers = {1,2,3,5,7,35,40};
        fizzBuzzInJava8(numbers);
    }

    private static void fizzBuzzInJava8(int [] numbers) {
        IntStream.of(numbers).mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

    private static void fizzBuzzBeforeJava8(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0)) System.out.println("fizzbuzz");
            else if ((i % 5) == 0) System.out.println("fizz");
            else if ((i % 7) == 0) System.out.println("buzz");
            else System.out.println(i);
        }
    }
}
