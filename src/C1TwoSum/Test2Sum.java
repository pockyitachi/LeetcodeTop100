package C1TwoSum;

import java.util.Arrays;

public class Test2Sum {
    public static void main(String[] args) {
        int[] array = {1,3,7,8};
        int target = 10;
        twoSum test = new twoSum();
        int[] res = test.twoSumIndex(array, target);
        System.out.println(Arrays.toString(res));
    }
}
