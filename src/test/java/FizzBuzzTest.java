import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @Author: mmliu
 * @Description:
 * @Date: Created in 20:27 2020/1/14
 * @Modified by:
 */
public class FizzBuzzTest {
    @Test
    public void TestFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.printVal(1),is("1"));
        assertThat(fizzBuzz.printVal(3),is("Fizz"));
        assertThat(fizzBuzz.printVal(5),is("Buzz"));
        assertThat(fizzBuzz.printVal(15),is("FizzBuzz"));
    }

}
