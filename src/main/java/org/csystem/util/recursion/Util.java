package org.csystem.util.recursion;

import com.karandev.util.console.Console;

public class Util {

    public static long factorial(int n)
    {
        if (n <= 1)
            return 1;

        var val = 1L;

        for(; n > 1; --n)
            val *= n;

        return val;
    }

    public static int fibonacciNumber(int n)
    {
        if (n <= 0)
            return -1;

        if (n <= 2)
            return n - 1;

        int prev2 = 0, prev1 = 1, result = prev2 + prev1;

        for (int i = 3; i < n; ++i) {
            prev2 = prev1;
            prev1 = result;
            result = prev2 + prev1;
        }

        return result;
    }

    public static int gcd(int a, int b)
    {
        int min = Math.min(Math.abs(a), Math.abs(b));

        for (int i = min; i > 1; --i)
            if (a % i == 0 && b % i == 0)
                return i;

        return 1;
    }

    public static void printCollatz(int n)
    {
        for (;;) {
            Console.writeLine(n);

            if (n == 1)
                break;

            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
    }
    public static String reverse(String str)
    {
        char [] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return String.valueOf(chars);
    }

    public static void writeNumber(int val, int radix)
    {
        if (val == 0) {
            System.out.write('0');
            return;
        }

        char [] s = new char[33];
        boolean isNegative = false;
        int i;

        if (val < 0) {
            isNegative = true;
            val = -val;
        }

        for (i = 0; val != 0; ++i, val /= radix)
            s[i] = (char)((val % radix >= 10 ? 'A' - 10 : '0') + val % radix);

        if (isNegative)
            s[i++] = '-';

        for (--i; i >= 0; --i) {
            System.out.write(s[i]);
        }
    }

    public static void writeReverse(String str)
    {
        for (var i = str.length() - 1; i >= 0; --i)
            Console.write(str.charAt(i));
    }
}
