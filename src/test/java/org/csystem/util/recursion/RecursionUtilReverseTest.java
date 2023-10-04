package org.csystem.util.recursion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RecursionUtilReverseTest {
    private final ResultInfo m_resultInfo;

    private static class ResultInfo {
        String str;
        String expected;

        public ResultInfo(String str, String expected)
        {
            this.str = str;
            this.expected = expected;
        }
    }

    public RecursionUtilReverseTest(ResultInfo resultInfo)
    {
        m_resultInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<ResultInfo> createResultInfo()
    {
        return Arrays.asList(new ResultInfo("Ahmet", "temhA"),
                new ResultInfo("Istanbul", "lubnatsI"),
                new ResultInfo("Miraç", "çariM"),
                new ResultInfo("buse", "esub"),
                new ResultInfo("alipapila", "alipapila")
        );
    }

    @Test
    public void givenStr_thenReturnsReverse()
    {
        assertEquals(m_resultInfo.expected, RecursionUtil.reverse(m_resultInfo.str));
    }
}

