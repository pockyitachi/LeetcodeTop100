package C5TrappingRainWater;

public class RainTest {
    public static void main(String[] args) {
        int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRain test = new TrappingRain();
        System.out.println(test.trapWater(A));
    }
}
