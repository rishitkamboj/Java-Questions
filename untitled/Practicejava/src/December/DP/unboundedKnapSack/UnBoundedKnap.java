package December.DP.unboundedKnapSack;
import java.util.*;

public class UnBoundedKnap {

    static int knapSack(int val[], int wt[], int capacity) {
        int n=val.length;
        int dp[][]=new int[n+1][capacity+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }

        return recur(n,val,wt,capacity,dp);
    }

    static int recur(int n,int val[],int wt[],int W){
        if(W==0 || n<=0){
            return 0;
        }
        int notpick=0+recur(n-1,val,wt,W);
        int pick=Integer.MIN_VALUE;
        if(W>=wt[n-1]){
            pick=val[n-1]+recur(n,val,wt,W-wt[n-1]);
        }
        return Math.max(notpick,pick);
    }

    static int recur(int n,int val[],int wt[],int W,int dp[][]){
        if(W==0 || n<=0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        int notpick=0+recur(n-1,val,wt,W,dp);
        int pick=Integer.MIN_VALUE;
        if(W>=wt[n-1]){
            pick=val[n-1]+recur(n,val,wt,W-wt[n-1],dp);
        }
        return dp[n][W]=Math.max(notpick,pick);
    }

    static int tabul(int n,int val[],int wt[],int W){
        int dp[][]=new int[n+1][W+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=W;i++){
            dp[0][i]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int notpick=dp[i-1][j];
                int pick=0;
                if(j>=wt[i-1]){
                    pick=val[i-1]+dp[i][j-wt[i-1]];
                }
                dp[i][j]=Math.max(pick,notpick);
            }
        }
        return dp[n][W];

    }
}





