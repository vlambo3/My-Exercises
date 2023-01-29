package com.exercises.my.exercises;

public class MinInsertions {

    /*
    Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:

    Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
    Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
    In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.

    For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
    You can insert the characters '(' and ')' at any position of the string to balance it if needed.

    Return the minimum number of insertions needed to make s balanced.
     */
    public static void main(String[] args) {
        System.out.println("The min insertions are ");
        String s = "()))";
        System.out.println(minInsertions(s));
    }
    private static int minInsertions(String s) {
        int balance = 0;
        int insertion = 0;

        for (int i = 0; i < s.length(); ++i) {
            //bal += p.charAt(i) == '(' ? 1 : -1;
            if (s.charAt(i) == '(') balance = balance+ 2;
            else balance --;
            if (balance == -2) {
                insertion ++;
                balance =  balance +2;
            }
        }
        return balance + insertion;
    }
}
