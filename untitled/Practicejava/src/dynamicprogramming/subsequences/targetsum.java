package dynamicprogramming.subsequences;

import java.util.Arrays;

public class targetsum {
    public int findTargetSumWays(int[] nums, int target) {
            int sum=0;
            for(int i:nums){
                sum+=i;
            }
            int dp[][]=new int[nums.length][sum*2+1];
            for(int i[]:dp){
            Arrays.fill(i,-1);
        }
            return RECURDP(nums.length-1,target,nums,dp);
    }


    public int RECUR(int ind,int tar,int []arr){
        if(ind==0){
            if((tar-arr[0]==0) &&(tar+arr[0])==0){
                return 2;
            }
            if((tar-arr[0]==0) || (tar+arr[0])==0){
    return 1;
            }
            else{
                return 0;
            }
        }
        int add=RECUR(ind-1,tar+arr[ind],arr);
        int sub=RECUR(ind-1,tar-arr[ind],arr);

return add+sub;    }




    public int RECURDP(int ind,int tar,int []arr,int [][]dp){
        if(ind==0){
            if((tar-arr[0]==0) &&(tar+arr[0])==0){
                return 2;
            }
            if((tar-arr[0]==0) || (tar+arr[0])==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        int add=RECURDP(ind-1,tar+arr[ind],arr,dp);
        int sub=RECURDP(ind-1,tar-arr[ind],arr,dp);

        return dp[ind][tar]=add+sub;    }
}
