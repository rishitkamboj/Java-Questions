package dynamicprogramming.subsequences;
import java.util.*;

public class partitionequal {
}
class Solution {
    public boolean canPartition(int[] nums) {
        int tar=0;
        for(int i:nums){
            tar+=i;
        }
        if(tar%2==1){
            return false;
        }
        else{
            int k=tar/2;
            int dp[][]=new int[nums.length][k+1];
            for(int i[]:dp){
                Arrays.fill(i,-1);
            }
            return subset(nums.length-1,k,nums,dp);
        }

    }


    static boolean subset(int index,int target,int[]arr,int[][]dp){
        if(target==0){
            return true;
        }
        if(index==0){
            return arr[0]==target;
        }
        if(dp[index][target]!=-1){
            return dp[index][target]==1;
        }
        boolean notTaken=subset(index-1,target,arr,dp);
        boolean taken=false;
        if(arr[index]<=target){
            taken=subset(index-1,target-arr[index],arr,dp);
        }
        dp[index][target]=notTaken||taken?1:0;
        return notTaken||taken;
    }
}
