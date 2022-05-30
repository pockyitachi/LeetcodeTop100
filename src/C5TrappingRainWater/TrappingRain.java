package C5TrappingRainWater;

public class TrappingRain {
    public int trapWater(int[] A) {
        // Two pointer   TC O(n), SC O(1)
        if(A == null || A.length == 0){
            return 0;
        }
        // Two pointers
        int left = 0;
        int right = A.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        while(left < right){
            if(A[left] < A[right]){
                if(A[left] > leftMax){
                    leftMax = A[left];
                }else{
                    res = res + (leftMax - A[left]);
                }
                left++;
            }else{
                if(A[right] > rightMax){
                    rightMax = A[right];
                }else{
                    res = res +(rightMax - A[right]);
                }
                right--;
            }
        }
        return res;
    }

}
