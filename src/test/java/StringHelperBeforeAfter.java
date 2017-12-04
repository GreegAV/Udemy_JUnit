import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by avg-m on 04/12/2017.
 */
public class StringHelperBeforeAfter {

    StringHelper helper;
    @Before
    public void StringHelper_Test(){
        System.out.println("Beforetest!");
        helper=new StringHelper();
    }

    @After
    public void test2(){
        System.out.println("Aftertest!");
    }

    @Test
    public void test1(){
        System.out.println("Test!");
    }

    @AfterClass
    public static void test4(){
        System.out.println("AfterClass!");
    }

    @BeforeClass
    public static void test3(){
        System.out.println("BeforeClass!");
    }


}