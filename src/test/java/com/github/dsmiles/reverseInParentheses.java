package com.github.dsmiles;

import java.util.Stack;

public class reverseInParentheses {

    public static String solution(String inputString) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (c == ')') {
                // Pop characters from stack until '(' is found
                StringBuilder reversedSubstring = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    reversedSubstring.append(stack.pop());
                }
                // Remove the '(' from stack
                stack.pop();

                // Push the reversed substring back to stack
                for (char ch : reversedSubstring.toString().toCharArray()) {
                    stack.push(ch);
                }
            } else if (c == '(') {
                // Push '(' directly onto stack to mark the start of reversing
                stack.push(c);
            } else {
                // Push regular characters onto stack
                stack.push(c);
            }
        }

        // Construct the result string from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Reverse the result string because characters were popped in reverse order
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String inputString1 = "(bar)";
        String inputString2 = "foo(bar)baz";
        String inputString3 = "foo(bar)baz(blim)";
        String inputString4 = "foo(bar(baz))blim";

        System.out.println(solution(inputString1)); // Expected: "rab"
        System.out.println(solution(inputString2)); // Expected: "foorabbaz"
        System.out.println(solution(inputString3)); // Expected: "foorabbazmilb"
        System.out.println(solution(inputString4)); // Expected: "foobazrabblim"
    }
}
