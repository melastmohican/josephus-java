package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Make sure your tests cover the following scenarios
 * Invalid parameters
 * What happens if n = k?
 * What happens if n = 3 and k = 2?
 * What happens if n is very large, but k =2?
 * Created by mordor on 10/16/17.
 */
public class JosephusProblemTest {
    @Test(expected = IllegalArgumentException.class)
    public void testWrongN() throws Exception {
        JosephusProblem.josephus(0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongK() throws Exception {
        JosephusProblem.josephus(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKGreaterThanN() throws Exception {
        JosephusProblem.josephus(2, 3);
    }

    @Test
    public void testKEqualN() throws Exception {
        assertEquals(JosephusProblem.josephus(4, 4), 1);
    }

    @Test
    public void testN3K2() throws Exception {
        assertEquals(JosephusProblem.josephus(3, 2), 2);
    }

    @Test
    public void testLargeN() throws Exception {
        assertEquals(JosephusProblem.josephus(100000, 2), 68928);
    }

    @Test
    public void testN14K2() throws Exception {
        assertEquals(JosephusProblem.josephus(14, 2), 12);
    }

    @Test
    public void testN41K3() throws Exception {
        assertEquals(JosephusProblem.josephus(41, 3), 30);
    }

}