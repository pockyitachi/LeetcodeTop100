package C8ValidParentheses;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ValidParentheses {
    private static final char[] brackets = new char[]{'(', ')', '[', ']', '{', '}'};
    public List<String> validParentheses(int l, int m, int n){
        List<String> res = new ArrayList<>();
        int num = (l + m + n) * 2;
        int[] remain = {l, l, m, m, n, n};
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        helper(remain, stack, sb, num, res);
        return res;
    }
    private void helper(int[] remain, Deque<Character> stack, StringBuilder sb, int num, List<String> res){
        if(sb.length() == num){
            res.add(sb.toString());
            return;
        }
        for(int i = 0; i < remain.length; i++){
            if(i % 2 == 0){
                if(remain[i] > 0){
                    sb.append(brackets[i]);
                    remain[i]--;
                    stack.offerFirst(brackets[i]);
                    helper(remain, stack, sb, num, res);
                    sb.deleteCharAt(sb.length() - 1);
                    remain[i]++;
                    stack.pollFirst();
                }
            }else{
                if(!stack.isEmpty() && (stack.peekFirst() == brackets[i - 1])){
                    sb.append(brackets[i]);
                    stack.pollFirst();
                    remain[i]--;
                    helper(remain, stack, sb, num, res);
                    sb.deleteCharAt(sb.length() - 1);
                    remain[i]++;
                    stack.offerFirst(brackets[i - 1]);
                }
            }
        }
    }
}
/*
                                                 ' '
                                        /                   \
                                      (                      [
                                     /  \                  /   \
                                   ()   ([               [(     []
                                  /       \             /  \    / \
                                ()[       ([]         [()      [](
                               /            \         /        /
                             ()[]          ([])     [()]      []()

 */