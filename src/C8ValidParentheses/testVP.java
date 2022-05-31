package C8ValidParentheses;

import java.util.List;

public class testVP {
    public static void main(String[] args) {
        int l = 1;
        int m = 1;
        int n = 0;
        ValidParentheses test = new ValidParentheses();
        List<String> res = test.validParentheses(1,1,0);
        System.out.println(res);
    }
}
