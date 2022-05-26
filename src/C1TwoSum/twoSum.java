package C1TwoSum;

import java.util.HashMap;

public class twoSum {
    public int[] twoSumIndex(int[] nums, int target){
        //corner case
        if(nums == null || nums.length == 0){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer targetLeft = (Integer)(target - nums[i]);
            if(map.containsKey(targetLeft)){
                int[] res = {map.get(targetLeft), i};
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
