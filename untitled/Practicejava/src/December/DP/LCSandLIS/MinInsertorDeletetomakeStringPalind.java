package December.DP.LCSandLIS;

public class MinInsertorDeletetomakeStringPalind {


    public int minInsertions(String s) {
        int n=s.length();
        StringBuilder s1=new StringBuilder(s);
        return n-tabulation(s,n,s1.reverse().toString(),n);
    }

    int tabulation(String s1,int n,String s2,int m){
        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }

        }
        return dp[n][m];
    }
}
