package December.DP.unboundedKnapSack;

public class coinchangeII {

int recur(int n,int W,int arr[]){
    if(n<=0){
        return 0;
    }
    if(n==1){
        if(W%arr[0]==0){
            return 1;
        }
        return 0;
    }
    int notpick=recur(n-1,W,arr);
    int pick=0;
    if(W>=arr[n-1]){
        pick=recur(n-1,W,arr);
    }
    return pick+notpick;
}


    int recur(int n,int W,int []arr,int dp[][]){
        if(n<=0){
            return 0;
        }
        if(n==1){
            if(W%arr[0]==0){
                return 1;
            }
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        int notpick=0+recur(n-1,W,arr,dp);
        int pick=0;
        if(W>=arr[n-1]) {
            pick=recur(n,W-arr[n-1],arr,dp);
        }
        return dp[n][W]=notpick+pick;
    }



    public int tabulation(int n,int W,int arr[]){
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int notpick=0+dp[i-1][j];
                int pick=0;
                if(j>=arr[i-1]){
                    pick=dp[i][j-arr[i-1]];
                }
                dp[i][j]=pick+notpick;
            }
        }
        return dp[n][W];

    }



}
