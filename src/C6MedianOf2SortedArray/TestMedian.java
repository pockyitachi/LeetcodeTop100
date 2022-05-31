package C6MedianOf2SortedArray;

public class TestMedian {
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {2,3,4};
        MedianOf2SortedArr test = new MedianOf2SortedArr();
        double res = test.median(a, b);
        System.out.println(res);
    }
}
