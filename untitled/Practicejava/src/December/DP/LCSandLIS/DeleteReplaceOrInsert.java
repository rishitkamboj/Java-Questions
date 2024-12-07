package December.DP.LCSandLIS;

public class DeleteReplaceOrInsert {

    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        return tabulation(word1,n,word2,m);
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
