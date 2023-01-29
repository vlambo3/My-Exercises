package com.exercises.my.exercises;

import java.util.Arrays;

public class NumbersClosesToZero {
    /*
    Given an integer array nums of size n, return the number with the value closest to 0 in nums.
    If there are multiple answers, return the number with the largest value.
     */
    public static void main(String[] args) {

        int[] testingArray = {4,7,9,2,-2,-1};
        System.out.println("The Closest Number To Zero in this Array is : " + computeClosesToZero(testingArray));
    }

    static int computeClosesToZero(int[] ts) {
        int currentValue = 0;
        int closestVal = ts[0];
        Arrays.sort(ts);
        if (ts.length == 0)
            return 0;
        for (int i = 0; i < ts.length; i++) {
            currentValue = ts[i] * ts[i];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = ts[i];
            }
        }
        return closestVal;
    }
}
