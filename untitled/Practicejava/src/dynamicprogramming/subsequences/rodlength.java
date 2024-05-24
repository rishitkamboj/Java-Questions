package dynamicprogramming.subsequences;

public class rodlength {
    public int cutRod(int price[], int n) {

    }


    public int recurs(int ind,int N,int price[]){
        if(ind==0){
          return N*price[0];
        }
        int notpick=0+recurs(ind-1,N,price);
        int pick=Integer.MIN_VALUE;
        if((ind+1)<=N){
            pick=price[ind]+recurs(ind,N-ind-1,price);
        }
        return Math.max(notpick,pick);
    }



    public int recurs(int ind,int N,int price[],int[][]dp){
        if(ind==0){
            return N*price[0];
        }
        if(dp[ind][N]!=-1){
            return dp[ind][N];
        }
        int notpick=0+recurs(ind-1,N,price);
        int pick=Integer.MIN_VALUE;
        if((ind+1)<=N){
            pick=price[ind]+recurs(ind,N-ind-1,price);
        }
        return dp[ind][N]=Math.max(notpick,pick);
    }


    public int RODTABLE(int[]price,int N){
        int dp[][]=new int[N][N+1];

        for(int i=0;i<=N;i++){
            dp[0][i]=i*price[0];
        }
        for(int index=1;index<N;index++){
            for(int j=0;j<=N;j++){
                int notpick=0+dp[index-1][j];
                int pick=Integer.MIN_VALUE;
                if((index+1)<=j){
                    pick=price[index]+dp[index][j-index-1];
                }
                dp[index][j]=Math.max(notpick,pick);
            }
        }
        return dp[N-1][N];
    }
}
