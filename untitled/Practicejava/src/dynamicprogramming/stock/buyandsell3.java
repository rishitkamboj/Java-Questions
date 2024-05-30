package dynamicprogramming.stock;

public class buyandsell3 {
    public int maxProfit(int[] prices) {
return 1;
    }
    public int recursion(int ind,int buy,int cap,int arr[]){
if(ind==arr.length || cap==0){
    return 0;
}
        int profit=0;
        if(buy==1){
            profit=Math.max(-arr[ind]+recursion(ind+1,0,cap,arr),0+recursion(ind+1,1,cap,arr));
        }
        else{
            profit=Math.max(arr[ind]+recursion(ind+1,1,cap-1,arr),0+recursion(ind+1,0,cap,arr));
        }
        return profit;
    }


    public int recursiondp(int ind,int buy,int cap,int arr[],int dp[][][]){
        if(ind==arr.length || cap==0){
            return 0;
        }
        if(dp[ind][buy][cap]!=-1){
            return dp[ind][buy][cap];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-arr[ind]+recursiondp(ind+1,0,cap,arr,dp),0+recursiondp(ind+1,1,cap,arr,dp));
        }
        else{
            profit=Math.max(arr[ind]+recursiondp(ind+1,1,cap-1,arr,dp),0+recursiondp(ind+1,0,cap,arr,dp));
        }
        return dp[ind][buy][cap]=profit;
    }

    public int tabulation(int prices[]){
        int n=prices.length;
        int dp[][][]=new int[n+1][2][3];
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (buy == 0) {
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][0][cap],
                                -prices[ind] + dp[ind + 1][1][cap]);
                    }

                    if (buy == 1) {
                        dp[ind][buy][cap] = Math.max(0 + dp[ind + 1][1][cap],
                                prices[ind] + dp[ind + 1][0][cap - 1]);
                    }
                }
            }
        }
return dp[0][0][2];
    }

}
