import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TopKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

    public static  int[] topKFrequent(int[] nums, int k) {
        int[] topK = new int[k];
        for (int i = 0; i < nums.length; i++) {
            int[] num = new int[nums.length];
            for (int j = 1; j < nums.length-1; j++) {
                if (nums[j] == nums[i]) {
                    num[j] = nums[j];
                }
            }
            if (num.length >= k) {
                topK[i] = num[0];
            }
        }
        return topK;
    }
}
