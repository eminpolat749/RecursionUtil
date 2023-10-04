package org.csystem.util.recursion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilFibonacciNumberTest {
    private final ResultInfo m_resultInfo;

    private static class ResultInfo {
        int n;
        int expected;

        public ResultInfo(int n, int expected)
        {
            this.n = n;
            this.expected = expected;
        }
    }

    public UtilFibonacciNumberTest(ResultInfo resultInfo)
    {
        m_resultInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<ResultInfo> createResultInfo()
    {
        return Arrays.asList(new ResultInfo(0, -1),
                new ResultInfo(1, 0),
                new ResultInfo(2, 1),
                new ResultInfo(3, 1),
                new ResultInfo(4, 2),
                new ResultInfo(5, 3),
                new ResultInfo(6, 5));
    }

    @Test
    public void givenValue_thenReturnsFibonacci()
    {
        assertEquals(m_resultInfo.expected, Util.fibonacciNumber(m_resultInfo.n));
    }
}
