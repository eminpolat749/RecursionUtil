package org.csystem.util.recursion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RecursionUtilGcdTest {
    private final ResultInfo m_resultInfo;

    private static class ResultInfo {
        int val1;
        int val2;
        int expected;

        public ResultInfo(int val1, int val2, int expected)
        {
            this.val1 = val1;
            this.val2 = val2;
            this.expected = expected;
        }
    }

    public RecursionUtilGcdTest(ResultInfo resultInfo)
    {
        m_resultInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<ResultInfo> createResultInfo()
    {
        return Arrays.asList(new ResultInfo(3, 4, 1),
                new ResultInfo(10, 20, 10),
                new ResultInfo(50, 5, 5),
                new ResultInfo(2, 20, 2),
                new ResultInfo(7, 3, 1)

        );
    }

    @Test
    public void givenValues_thenReturnsGcd()
    {
        assertEquals(m_resultInfo.expected, RecursionUtil.gcd(m_resultInfo.val1, m_resultInfo.val2));
    }
}

