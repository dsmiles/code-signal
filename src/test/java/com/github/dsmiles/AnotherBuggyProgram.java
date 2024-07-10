package com.github.dsmiles;

public class AnotherBuggyProgram {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
            return -1;
        } finally {
            System.out.println("Division operation completed.");
        }
        /**
         * 1. The finally block is executed after the try or catch blocks, regardless of whether an exception was
         * thrown or not.
         *
         * 2. The finally block is intended for cleanup operations, not for modifying the control flow or returning
         * values.
         *
         * 3. In this code, the finally block does not modify the return value but will always print "Division operation
         * completed." which might be misleading because the division operation didn't actually complete successfully.
         *
         * To improve clarity, you might want to ensure that the finally block only contains cleanup code and does not
         * imply that the operation was successful.
         */
    }
}

