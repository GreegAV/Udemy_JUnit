import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by avg-m on 04/12/2017.
 */
public class ArrayEquals {

    @Test
    public void testArrayEquals(){
        int[] arr = {1,2,3,56,3};
        int[] expected = {1,2,3,3,56};
        Arrays.sort(arr);
        assertArrayEquals(expected,arr);
    }

    @Test
    public void testArrayEquals_False(){
        int[] arr = {1,2,3,56,3};
        int[] expected = {1,2,3,3,56};
        Arrays.sort(arr);
        assertEquals(expected,arr);
    }
}
