/**
 * @Author: mmliu
 * @Description:
 * @Date: Created in 20:57 2020/1/14
 * @Modified by:
 */
public class FizzBuzz {
    public String printVal(int val){
        String res = "";
        if(val%3 == 0) res += "Fizz";
        if(val%5 == 0) res += "Buzz";
        return res.equals("")?String.valueOf(val):res;
    }
}
