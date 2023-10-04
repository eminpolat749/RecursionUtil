package org.csystem.util.recursion;


import com.karandev.util.console.Console;

public class RecursionUtil {
    private static int fibonacciNumberRecur(int n)
    {
        if (n <= 2)
            return n - 1;

        return fibonacciNumberRecur(n - 1) + fibonacciNumberRecur(n - 2);
    }

    private static int gcdRecur(int a, int b)
    {
        return b == 0 ? a : gcdRecur(b, a % b);
    }
    private static void reverseRecur(char [] chars, int left, int right)
    {
        if (left >= right)
            return;

        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        reverseRecur(chars, left + 1, right - 1);
    }
    private static void writeReverseRecur(String str, int val)
    {
        if (val == str.length())
            return;

        writeReverseRecur(str, val + 1);
        Console.write(str.charAt(val));
    }
    public static long factorial(int n)
    {
        if (n <= 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int fibonacciNumber(int val)
    {
        if (val <= 0)
            return -1;

        return fibonacciNumberRecur(val);
    }

    public static int gcd(int a, int b)
    {
        return gcdRecur(Math.abs(a), Math.abs(b));
    }

    public static void printCollatz(int n)
    {
        Console.writeLine(n);

        if (n == 1)
            return;

        printCollatz(n % 2 == 0 ? n / 2 : 3 * n + 1);
    }

    public static String reverse(String str)
    {
        char [] chars = str.toCharArray();

        reverseRecur(chars, 0, str.length() - 1);

        return String.valueOf(chars);
    }
    public static void writeReverse(String str)
    {
        writeReverseRecur(str, 0);
    }
}
