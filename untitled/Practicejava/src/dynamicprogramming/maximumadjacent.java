package dynamicprogramming;

import java.util.Arrays;

public class maximumadjacent {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return rob2(nums,nums.length-1,dp);
    }

    int rob2(int[]nums,int index,int[]dp){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index]+rob2(nums,index-2,dp);
        int not=0+rob2(nums,index-1,dp);
        return dp[index]=Math.max(pick,not);
    }
    int rob3(int[]nums){
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>2){
                take+=dp[i-2];
            }
            int not=0+dp[i-1];
            dp[i]=Math.max(take,not);
        }
        return dp[nums.length-1];
    }


    int rob4(int[]nums){

        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int not=0+prev;
            int cur=Math.max(not,take);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }


}
