package December.DP.unboundedKnapSack;

public class coinchange {

    int recur(int n,int W,int []arr){
        if(n<=0){
            return (int)(1e9);
        }

        if(n==1){
            if(W%arr[0]==0){
                return W/arr[0];
            }
            return (int)(1e9);
        }
        int notpick=0+recur(n-1,W,arr);
        int pick=(int)(1e9);
        if(W>=arr[n-1]) {
            pick=1+recur(n,W-arr[n-1],arr);
        }
        return Math.min(notpick,pick);
    }


    int recur(int n,int W,int []arr,int dp[][]){
        if(n<=0){
            return (int)(1e9);
        }
        if(n==1){
            if(W%arr[0]==0){
                return W/arr[0];
            }
            return (int)(1e9);
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        int notpick=0+recur(n-1,W,arr,dp);
        int pick=(int)(1e9);
        if(W>=arr[n-1]) {
            pick=1+recur(n,W-arr[n-1],arr,dp);
        }
        return dp[n][W]=Math.min(notpick,pick);
    }

    public int tabulation(int n,int W,int arr[]){
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=(int)1e9;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int notpick=0+dp[i-1][j];
                int pick=(int)(1e9);
                if(j>=arr[i-1]){
                    pick=1+dp[i][j-arr[i-1]];
                }
                dp[i][j]=Math.min(pick,notpick);
            }
        }
        return dp[n][W];

    }

}
