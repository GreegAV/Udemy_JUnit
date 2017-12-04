import org.junit.*;

import static org.junit.Assert.assertEquals;


/**
 * Created by avg-m on 04/12/2017.
 */
public class StringHelperTest {

    @Test
    public void truncateAInFirst2PositionsTest0() {
        StringHelper stringHelper = new StringHelper();
        assertEquals("BAXX", stringHelper.truncateAInFirst2Positions("ABAXX"));

        // expected, actual
    }

    @Test
    public void truncateAInFirst2PositionsTest2() {
        StringHelper stringHelper2 = new StringHelper();
        assertEquals("AXX", stringHelper2.truncateAInFirst2Positions("AAAXX"));

        // expected, actual
    }

    @Test
    public void truncateAInFirst2PositionsTest3() {
        StringHelper stringHelper3 = new StringHelper();
        assertEquals("BCAXX", stringHelper3.truncateAInFirst2Positions("BCAXX"));

        // expected, actual
    }

//    @Test
//    public void areFirstAndLastTwoCharactersTheSameTest() {
//    }
}