package org.csystem.util.recursion;

import com.karandev.util.console.Console;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilWriteNumberTest {
    private final InputInfo m_inputInfo;

    private static class InputInfo {
        int n;
        int radix;

        public InputInfo(int n, int radix)
        {
            this.n = n;
            this.radix = radix;
        }
    }

    public UtilWriteNumberTest(InputInfo resultInfo)
    {
        m_inputInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<InputInfo> createResultInfo()
    {
        return Arrays.asList(new InputInfo(0, 10),
                new InputInfo(10, 10),
                new InputInfo(8128, 16),
                new InputInfo(10, 8),
                new InputInfo(16, 2),
                new InputInfo(-8, 2),
                new InputInfo(2_000_000_000, 2),
                new InputInfo(Integer.MAX_VALUE, 2)
        );
    }

    @Test
    public void givenValueAndRadix_thenWriteNumber()
    {
        Util.writeNumber(m_inputInfo.n, m_inputInfo.radix);
        Console.writeLine();
    }
}
