import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class SampleTest {

    @Test
    public void test() {

        //Replace "test" with other string to make test fail
        String result = "test2";
		
		Main myUnit = new Main();
        result = myUnit.printing2();		
        assertEquals("test", result);

    }
}
