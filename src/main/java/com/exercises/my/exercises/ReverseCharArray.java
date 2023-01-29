package com.exercises.my.exercises;

public class ReverseCharArray {

    /*Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.  */

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }

    private static void reverseString(char[] s) {
        for(int i=0, j = s.length-1; i<=j; i++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        System.out.println(s);
    }
}
