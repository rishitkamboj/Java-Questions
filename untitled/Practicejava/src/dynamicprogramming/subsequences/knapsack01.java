package dynamicprogramming.subsequences;

public class knapsack01 {



    class Solution
    {
        //Function to return max value that can be put in knapsack of capacity W.
        static int knapSack(int W, int wt[], int val[], int n)
        {
            // your code here
        }


        static int recur(int ind,int W,int wt[],int val[]){
            if(ind==0){
                if(wt[0]<=W){
                    return val[0];
                }
                else {
                    return 0;
                }
            }
            int notPick=0+recur(ind-1,W,wt,val);
            int pick=Integer.MIN_VALUE;
            if(wt[ind]<=W){
                pick=val[ind]+recur(ind-1,W-wt[ind],wt,val);
            }
            return Math.max(notPick,pick);
        }
        static int recurdp(int ind,int W,int wt[],int val[],int [][]dp){
            if(ind==0){
                if(wt[0]<=W){
                    return val[0];
                }
                else {
                    return 0;
                }
            }
            if(dp[ind][W]!=-1){
                return dp[ind][W];
            }
            int notPick=0+recur(ind-1,W,wt,val);
            int pick=Integer.MIN_VALUE;
            if(wt[ind]<=W){
                pick=val[ind]+recur(ind-1,W-wt[ind],wt,val);
            }
            return dp[ind][W]=Math.max(notPick,pick);
        }


        static int tabul(int n,int wt[],int val[],int W){
            int dp[][]=new int[n][W+1];
            for(int i=wt[0];i<=W;i++){
                dp[0][i]=val[0];
            }
            for(int i=1;i<n;i++){
                for(int j=0;j<=W;j++){
                    int not=dp[i-1][j];
                    int pick=Integer.MIN_VALUE;
                    if(wt[i]<=j){
                        pick=val[i]+dp[i-1][j-wt[i]];
                    }
                    dp[i][j]=Math.max(not,pick);
                }
            }
            return dp[n-1][W];
        }








    }
}
