package org.csystem.util.recursion;

import com.karandev.util.console.Console;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RecursionUtilPrintCollatzTest {
    private final Integer m_val;

    public RecursionUtilPrintCollatzTest(Integer value)
    {
        m_val = value;
    }

    @Parameterized.Parameters
    public static Collection<Integer> createResultInfo()
    {
        return Arrays.asList(72543, 100, 32, 16, 5, 2, 1, 29);
    }

    @Test
    public void givenValue_thenWriteCollatz()
    {
        RecursionUtil.printCollatz(m_val);
        Console.writeLine();
    }
}
