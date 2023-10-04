package org.csystem.util.recursion;


import com.karandev.util.console.Console;

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

    public static void printCollatz(int n)
    {
        Console.writeLine(n);

        if (n == 1)
            return;

        printCollatz(n % 2 == 0 ? n / 2 : 3 * n + 1);
    }

}
