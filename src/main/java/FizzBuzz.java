/**
 * @Author: mmliu
 * @Description:
 * @Date: Created in 21:07 2020/2/14
 * @Modified by:
 */
public class FizzBuzz {


    public String getVal(int val) {
        String res = "";
        if (val % 3 == 0) {
            res += "Fizz";
        }
        if (val % 5 == 0) {
            res += "Buzz";
        }
        return "".equals(res) ? String.valueOf(val) : res;
    }
}
