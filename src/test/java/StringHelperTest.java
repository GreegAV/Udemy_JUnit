import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by avg-m on 04/12/2017.
 */
public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();
    @Test
    public void truncateAInFirst2PositionsTest0() {
        assertEquals("BAXX", stringHelper.truncateAInFirst2Positions("ABAXX"));
        // expected, actual
    }

    @Test
    public void truncateAInFirst2PositionsTest2() {
        assertEquals("AXX", stringHelper.truncateAInFirst2Positions("AAAXX"));
        // expected, actual
    }

    @Test
    public void truncateAInFirst2PositionsTest3() {
        assertEquals("BCAXX", stringHelper.truncateAInFirst2Positions("BCAXX"));
        // expected, actual
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_ABCD() {
        assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_ABAB() {
        assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_AB() {
        assertEquals(true, stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_A() {
        assertEquals(false, stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_false() {
        assertFalse( stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void areFirstAndLastTwoCharactersTheSameTest_true() {
        assertTrue( stringHelper.areFirstAndLastTwoCharactersTheSame("AAA"));
    }


}