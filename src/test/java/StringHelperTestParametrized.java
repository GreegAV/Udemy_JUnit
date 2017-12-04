import javafx.print.Collation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


/**
 * Created by avg-m on 04/12/2017.
 */

@RunWith(Parameterized.class)
public class StringHelperTestParametrized {
    StringHelper stringHelper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperTestParametrized(String input, String expectedOutput) {
        super();
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters

    public static Collection<String[]> testCondition(){
        String expectedOutputs[][]={{"AACD", "CD"},{"AAD", "CD"},{"BCAXX","BCAXX"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void truncateAInFirst2PositionsTest0() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
        // expected, actual
    }

}