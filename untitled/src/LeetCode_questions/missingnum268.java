package LeetCode_questions;
import java.util.Arrays;

public class missingnum268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3}));
    }


    public static int missingNumber1(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length+1;i++){
            xor^=i;
        }
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }

    public static int missingNumber2(int nums[]){
        int n=nums.length;
        int sum=n*(n+1)/2;
        int total=0;
        for(int i:nums){
            total=i;
        }
        return sum-total;
    }




    public static int cyclicsort(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

}
