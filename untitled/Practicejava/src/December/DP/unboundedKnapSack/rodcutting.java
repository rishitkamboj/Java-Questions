package December.DP.unboundedKnapSack;

public class rodcutting {


    int recur(int n,int W,int prices[]){
        if(n==0 || W==0){
            return 0;
        }
        int notpick=0+recur(n-1,W,prices);
        int pick=0;
        if(W>=n){
            pick=prices[n-1]+recur(n,W-n,prices);
        }
return Math.max(notpick,pick);
    }

    public int recur(int n,int W,int prices[],int dp[][]){
        if(n==0 || W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        int notpick=0+recur(n-1,W,prices,dp);
        int pick=0;
        if(W>=n){
            pick=prices[n-1]+recur(n,W-n,prices,dp);
        }
        return dp[n][W]=Math.max(pick,notpick);
    }

    public int tabulation(int n,int W,int prices[]){
        int dp[][]=new int[n+1][W+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int notpick=0+dp[i-1][j];
                int pick=0;
                if(j>=i){
                    pick=prices[i-1]+dp[i][j-i];
                }
                dp[i][j]=Math.max(notpick,pick);
            }

        }
        return dp[n][W];
    }













}

