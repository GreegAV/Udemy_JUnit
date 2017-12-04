import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by avg-m on 04/12/2017.
 */
public class ArrayEquals {

    @Test
    public void testArrayEquals() {
        int[] arr = {1, 2, 3, 56, 3};
        int[] expected = {1, 2, 3, 3, 56};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayEquals_False() {
        int[] arr = {1, 2, 3, 56, 3};
        int[] expected = {1, 2, 3, 3, 56};
        Arrays.sort(arr);
        assertEquals(expected, arr);
    }

    @Test
    public void testArrayEquals_False2() {
        int[] arr = {1, 2, 3, 56, 3};
        int[] expected = {1, 2, 3, 4, 56};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayEquals_NPE() {
        int[] arr = null;
        int[] expected = {1, 2, 3, 4, 56};
        try {
            Arrays.sort(arr);
        } catch (NullPointerException e) {
            System.out.println("NPE!");
        }
//        assertArrayEquals(expected, arr);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayEquals_NPE2() {
        int[] arr = null;
        int[] expected = {1, 2, 3, 4, 56};
            Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test(expected = NullPointerException.class)
    // Unexpected exception, expected<java.lang.NullPointerException> but was<java.lang.AssertionError>
    public void testArrayEquals_NPE3() {
        int[] arr = {};
        int[] expected = {1, 2, 3, 4, 56};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }

}
