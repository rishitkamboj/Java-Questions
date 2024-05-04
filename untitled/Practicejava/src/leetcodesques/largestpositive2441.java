package leetcodesques;
import java.util.*;

public class largestpositive2441 {
    public static int  findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int max=Integer.MIN_VALUE;

        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==0){
                max=Math.max(max,nums[right]);
                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
        }
        if(max!=Integer.MIN_VALUE){
                return max;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,-3,4,5,3}));
    }
}
