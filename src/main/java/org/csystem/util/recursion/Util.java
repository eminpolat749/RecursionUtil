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

    public static void printCollatz(int n)
    {
        for (;;) {
            Console.writeLine(n);

            if (n == 1)
                break;

            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
    }
}
