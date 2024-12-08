package December.DP.LCSandLIS;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        //    return tabulation(word1,n,word2,m);
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return recursion(word1,n,word2,m,dp);
    }







    int recursion(String s1,int n,String s2,int m,int dp[][]){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=recursion(s1,n-1,s2,m-1,dp);
        }

        return dp[n][m]=1 + Math.min(
                recursion(s1, n, s2, m - 1,dp),
                Math.min(
                        recursion(s1, n - 1, s2, m,dp),
                        recursion(s1, n - 1, s2, m - 1,dp)
                )
        );

    }










    int recursion(String s1,int n,String s2,int m){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return recursion(s1,n-1,s2,m-1);
        }

        return 1 + Math.min(
                recursion(s1, n, s2, m - 1),
                Math.min(
                        recursion(s1, n - 1, s2, m),
                        recursion(s1, n - 1, s2, m - 1)
                )
        );

    }
    int tabulation(String s1,int n,String s2,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=0+dp[i-1][j-1];
                    continue;
                }
                dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
            }
        }
        int len=dp[n][m];

        return len;
    }
}

