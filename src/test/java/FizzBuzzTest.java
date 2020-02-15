import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @Author: mmliu
 * @Description:
 * @Date: Created in 20:27 2020/2/14
 * @Modified by:
 */
public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,Fizz",
            "5,Buzz",
            "15,FizzBuzz"
    })
    void testFizz(int val,String out){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getVal(val),is(out));
    }
}
