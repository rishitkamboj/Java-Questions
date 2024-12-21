package December.DP.LIS;

public class MemoLIS {


    int solve(int ind,int prev,int arr[],int n){
        if(ind>n){
            return 0;
        }
        int notTake=0+solve(ind+1,prev,arr,n);
        int take=0;
        if(prev==0 || arr[ind-1]>arr[prev-1]){
            take=1+solve(ind+1,ind,arr,n);
        }
        return Math.max(notTake,take);
    }
    int solve(int ind,int prev,int arr[],int n,int dp[][]){
        if(ind>n){
            return 0;
        }
        if(dp[ind][prev]!=-1){
            return dp[ind][prev];
        }
        int notTake=0+solve(ind+1,prev,arr,n,dp);
        int take=0;
        if(prev==0 || arr[ind-1]>arr[prev-1]){
            take=1+solve(ind+1,ind,arr,n,dp);
        }
        return dp[ind][prev]=Math.max(notTake,take);
    }



}
