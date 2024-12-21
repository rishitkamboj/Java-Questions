package December.DP.LCS;

public class LongestRepeatingSubse {


    public int LongestRepeatingSubsequence(String s) {
        int n=s.length();
        //   int dp[][]=new int[n+1][n+1];
        //   for(int i=0;i<n+1;i++){
        //       for(int j=0;j<n+1;j++){
        //           dp[i][j]=-1;
        //       }
        //   }
        //    return recur(s,n,s,n,dp);
        return tabulation(s,n,s,n);
    }

    public int recur(String s1,int n,String s2,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];

        }
        if(s1.charAt(n-1)==s2.charAt(m-1) && n!=m){
            return dp[n][m]=1+recur(s1,n-1,s2,m-1,dp);
        }
        return dp[n][m]=Math.max(recur(s1,n-1,s2,m,dp),recur(s1,n,s2,m-1,dp));
    }





    public int tabulation(String s1,int n,String s2,int m){
        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }





















}
