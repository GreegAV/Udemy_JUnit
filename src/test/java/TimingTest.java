import org.junit.Test;

import java.util.Arrays;

/**
 * Created by avg-m on 04/12/2017.
 */
public class TimingTest {

    @Test(timeout = 100)
    // Test will failed if pass more 100ms
    public void testPerfomance(){
        int arr[]={12,23,4};
        for (int i = 0; i <=1000000 ; i++) {
            arr[0]=i;
            Arrays.sort(arr);
        }
    }
}
