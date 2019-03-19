package coin;


import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import coin.calculate;
@RunWith(Parameterized.class)
public class calculateTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 {50, 1}, {20, 1}, {10, 1}, {2,1}, {4,0}  
           });
    }
 
    private int fInput;
 
    private int fExpected;
 
    public calculateTest(int input, int expected) {
        fInput= input;
        fExpected= expected;
    }
 
    @Test
    public void test() {
        assertEquals(fExpected, calculate.panduan(fInput));
    }
	     
}
