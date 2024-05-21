package dynamicprogramming;

public class climbingstrairs {
    public int climbStairs(int n) {
             if(n<=1){
                 return 1;
             }
             int left=climbStairs(n-1);
             int right=climbStairs(n-2);
             return left+right;
    }
    public int climbStairs2(int n,int dp[]) {
        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n-1]=climbStairs2(n-1,dp);
        dp[n-2]=climbStairs2(n-2,dp);
        return dp[n]=dp[n-1]+dp[n-2];
    }
    public int climbStairs3(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
    public int climbStairs4(int n) {
        int prev=1;
        int cur=1;
        for(int i=2;i<=n;i++){
            int temp=prev+cur;
            prev=cur;
            cur=temp;
        }
        return cur;
    }
}
