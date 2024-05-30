package dynamicprogramming.stock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class buyandsellwithcooldown {
    public int maxProfit(int[] prices) {
         return 1;
    }
    public int recursion(int ind,int buy,int[]prices){
        if(ind>=prices.length){
            return 0;
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+recursion(ind+1,0,prices),0+recursion(ind+1,1,prices));
        }
        else{
            profit=Math.max(prices[ind]+recursion(ind+2,1,prices),0+recursion(ind+1,0,prices));
        }
        return profit;
    }
    public int recursiondp(int ind,int buy,int[]prices,int[][]dp){
        if(ind>=prices.length){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+recursiondp(ind+1,0,prices,dp),0+recursiondp(ind+1,1,prices,dp));
        }
        else{
            profit=Math.max(prices[ind]+recursiondp(ind+2,1,prices,dp),0+recursiondp(ind+1,0,prices,dp));
        }
        return dp[ind][buy]=profit;
    }
    public int tabulation(int[] prices) {

        HashSet<Integer> a=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        list.addAll(a);
        int n=prices.length;
        int dp[][]=new int[n+2][2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                int profit=0;
                if(j==1){
                    profit=Math.max(-prices[i]+dp[i+1][0],0+dp[i+1][1]);
                }
                else{
                    profit=Math.max(prices[i]+dp[i+2][1],0+dp[i+1][0]);
                }
                dp[i][j]=profit;
            }
        }
        return dp[0][1];
    }
}
