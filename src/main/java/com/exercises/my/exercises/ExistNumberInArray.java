package com.exercises.my.exercises;

import java.util.Arrays;

public class ExistNumberInArray {
    /*
The aim of this exercise is to check the presence of a number in an array.
Specifications:
    The items are integers arranged in ascending order.
    The array can contain up to 1 million items
    The array is never null
Implement the method boolean A.exists(int[] ints, int k) so that it returns true if k belongs to ints, otherwise the method should return false.
Important note: Try to save CPU cycles if possible.
Example:
int[] ints = {-9, 14, 37, 102};
A.exists(ints, 102) returns true
A.exists(ints, 36) returns false
*/
    public static void main(String[] args) {
        int[] ints = {15,2,102,30, -3, -1};
        System.out.println(exists(ints, 102));
        System.out.println(exists(ints, 6));
    }


    static boolean exists(int[] ints, int k) {

        /*for (int i : ints)
            if (i == k) return true;
        return false;*/
        if (ints == null || (ints.length > 1000000))
            return false;
        else
            Arrays.sort(ints);
        return (Arrays.binarySearch(ints, k) > -1);
    }
}

