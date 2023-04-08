package com.shohruh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class AppTest {
    private int[] input;
    private int[] expectedOutput;

    public AppTest(int[] input, int[] expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { new int[] {}, new int[] {} },{ new int[] {1}, new int[] {1} },
                { new int[] { 1, 1, 1 }, new int[] { 1, 1, 1 } },{ new int[] { 5, 1, 1, 3 }, new int[] { 1, 1, 3, 5 } }, { new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 } },
                { new int[] { 5, 1, 4 }, new int[] { 1, 4, 5 } }, { new int[] { 9, 8, 7 },
                new int[] { 7, 8, 9 } }, { new int[] { 10, 5, 7 }, new int[] { 5, 7, 10 } } });
    }

    @Test
    public void testSortingApp() {
        int[] actualOutput = App.sortAndPrint(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}