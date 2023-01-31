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
        String s = "())))";
        System.out.println(minInsertions(s));
    }
    private static int minInsertions(String s) {
        int close = 0;
        int open = 0;

        for (char c: s.toCharArray()) {

            if (c == '(') {
                close += 2;
                if (close%2 == 1) {
                    close --;
                    open ++;
                }
            }

            if (c == ')') { close --;
                if (close == -1) {
                    open += 1;
                    close = 1;

                } }
        }
        return close + open;
    }
}
