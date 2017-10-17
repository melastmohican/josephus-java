package org.example;

import org.junit.Test;
import static org.example.Josephus.josephus;

import static org.junit.Assert.*;

/**
 * Make sure your tests cover the following scenarios
 * Invalid parameters
 * What happens if n = k?
 * What happens if n = 3 and k = 2?
 * What happens if n is very large, but k =2?
 * Choose a couple of other cases to test

 * Created by mordor on 10/15/17.
 */
public class JosephusTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWrongN() throws Exception {
        josephus(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongK() throws Exception {
        josephus(10,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKGreaterThanN() throws Exception {
        josephus(2,3);
    }

    @Test
    public void testKEqualN() throws Exception {
       assertEquals(josephus(4,4), 1);
    }

    @Test
    public void testN3K2() throws Exception {
        assertEquals(josephus(3,2),2);
    }

    @Test(expected = StackOverflowError.class)
    public void testLargeN() throws Exception {
        int result = josephus( 1000000,2);
        System.out.println(result);
    }

}