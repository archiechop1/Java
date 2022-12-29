package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestNumbersTest {

    @Test
    public void sum() {
        TestNumbers object = new TestNumbers();
        int actual = object.sum(15);
        int expected = 55;
        assertEquals(actual, expected);
    }
}