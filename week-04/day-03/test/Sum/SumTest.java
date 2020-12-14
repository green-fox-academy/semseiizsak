package Sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Sum.Sum.sum;
import static org.junit.Assert.*;

public class SumTest {

    ArrayList<Integer> list;

    @Before
    public void before() {
        list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,null));
    }

    @Test
    public void listIsEmpty(){
        list = new ArrayList<Integer>(Arrays.asList());
        assertEquals(0, sum(list));
    }

    @Test (expected =  NullPointerException.class)
    public void nullValueInList() {
        sum(list);
    }

    @Test
    public void noNullValues (){
        list = new ArrayList<Integer>(Arrays.asList(2,3,5));
        assertEquals(10, sum(list));

    }

}