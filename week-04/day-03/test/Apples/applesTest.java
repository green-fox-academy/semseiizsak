package Apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class applesTest {
    @Test
    public void getApple() throws Exception{
        apples apples = new apples();

        assertEquals("apple", apples.getApple());
    }
}