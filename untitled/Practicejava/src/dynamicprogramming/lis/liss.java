package dynamicprogramming.lis;
import java.util.*;

public class liss {
    public int helper(int ind,int prev,int[]nums){

        if(ind==nums.length){
            return 0;
        }

        int not=0+helper(ind+1,prev,nums);
        int take=0;

        if(prev==-1 || nums[ind]>nums[prev]){
            take=1+helper(ind+1,ind,nums);
        }
        return Math.max(not,take);
    }
    public int memo(int ind,int prev,int[]nums,int[][]dp){
        if(ind==nums.length){
            return 0;
        }
        if(dp[ind][prev+1]!=-1){
            return dp[ind][prev+1];
        }
        int not=0+memo(ind+1,prev,nums,dp);
        int take=0;
        if(prev==-1 || nums[ind]>nums[prev]){
            take=1+memo(ind+1,ind,nums,dp);
        }
        return dp[ind][prev+1]=Math.max(not,take);
    }
    public int tabultion(int arr[],int n){
        int dp[][]=new int[n][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=-1;j--){
                int not=0+dp[i+1][j+1];
                int take=0;
                if(j==-1 || arr[i]>arr[j]){
                    take=1+dp[i+1][i+1];
                }
                dp[i][j]=Math.max(not,take);
            }
        }
        return dp[0][0];
    }

    public int tabulation2(int arr[],int n){
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            max=Math.max(max,dp[i]);
        }

        return max;
    }
}
