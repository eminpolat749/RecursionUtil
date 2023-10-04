package org.csystem.util.recursion;

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

}
