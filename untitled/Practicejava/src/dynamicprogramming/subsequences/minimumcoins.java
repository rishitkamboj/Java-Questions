package dynamicprogramming.subsequences;

public class minimumcoins {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int num=recursion(n-1,amount,coins);

        if(num>=(int)(1e9)){
            return -1;
        }
        return num;

    }

        public int recursion(int ind,int T,int[]coins){
            if(ind==0){
                if(T%coins[0]==0){
                    return T/coins[0];
                }
                else{
                    return (int)(1e9);
                }
            }
            int notPick=0+recursion(ind-1,T,coins);
            int pick=Integer.MAX_VALUE;
            if(coins[ind]<=T){
                pick=1+recursion(ind,T-coins[ind],coins);
            }
            return Math.min(notPick,pick);
        }


        public int RecurDP(int ind,int T,int[]coins,int[][]dp){
            if(ind==0){
                if(T%coins[0]==0){
                    return T/coins[0];
                }
                else{
                    return (int)(1e9);
                }
            }
            if(dp[ind][T]!=-1){
                return dp[ind][T];
            }
            int notPick=0+RecurDP(ind-1,T,coins,dp);
            int pick=Integer.MAX_VALUE;
            if(coins[ind]<=T){
                pick=1+RecurDP(ind,T-coins[ind],coins,dp);
            }
            return dp[ind][T]=Math.min(notPick,pick);
        }

        public int TABUL(int n,int arr[],int target){
        int dp[][]=new int[n][target+1];

        for(int i=0;i<=target;i++){
            if(i%arr[0]==0){
             dp[0][i]=i/arr[0];
            }
            else{
                dp[0][i]=(int)(1e9);
            }
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=0;tar<=target;tar++){
                int notpick=0+dp[ind-1][tar];
                int pick=Integer.MAX_VALUE;
                if(arr[ind]<=tar){
                    pick=1+dp[ind][tar-arr[ind]];
                }
                dp[ind][tar]=Math.min(notpick,pick);
            }
        }
        return dp[n-1][target];
        }


}
