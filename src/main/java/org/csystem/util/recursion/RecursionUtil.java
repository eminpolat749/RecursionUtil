package org.csystem.util.recursion;

public class RecursionUtil {
    private static int fibonacciNumberRecur(int n)
    {
        if (n <= 2)
            return n - 1;

        return fibonacciNumberRecur(n - 1) + fibonacciNumberRecur(n - 2);
    }
    public static int fibonacciNumber(int val)
    {
        if (val <= 0)
            return -1;

        return fibonacciNumberRecur(val);
    }

}
