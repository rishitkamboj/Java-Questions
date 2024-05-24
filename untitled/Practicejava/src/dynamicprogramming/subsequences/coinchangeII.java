package dynamicprogramming.subsequences;

public class coinchangeII {
    class Solution {
        public int change(int amount, int[] coins) {
            int n=coins.length;
            return RECUR(n-1,amount,coins);
        }

        public int RECUR(int ind,int amount,int[] coins){

            if(ind==0){
                if(amount%coins[0]==0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            int notTake=RECUR(ind-1,amount,coins);
            int Take=0;
            if(coins[ind]<=amount){
                Take=RECUR(ind,amount-coins[ind],coins);
            }
            return notTake+Take;
        }




        public int RECURDP(int ind,int amount,int[] coins,int[][]dp){

            if(ind==0){
                if(amount%coins[0]==0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            if(dp[ind][amount]!=-1){
                return dp[ind][amount];
            }
            int notTake=RECURDP(ind-1,amount,coins,dp);
            int Take=0;
            if(coins[ind]<=amount){
                Take=RECURDP(ind,amount-coins[ind],coins,dp);
            }
            return dp[ind][amount]=notTake+Take;
        }

        public int tabul(int n ,int nums[],int amount){
            int dp[][]=new int[n][amount+1];
            for(int i=0;i<=amount;i++){
                if(i%nums[0]==0){
                    dp[0][i]=1;
                }
                else{
                    dp[0][i]=0;
                }
            }

            for(int ind=1;ind<n;ind++){
                for(int am=0;am<=amount;am++){
                    int notpick=dp[ind-1][am];
                    int pick=0;
                    if(nums[ind]<=am){
                        pick=dp[ind][am-nums[ind]];
                    }
                    dp[ind][am]=notpick+pick;
                }
            }
            return dp[n-1][amount];
        }




    }
}
