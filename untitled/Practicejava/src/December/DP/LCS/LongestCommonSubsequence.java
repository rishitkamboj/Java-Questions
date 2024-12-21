package December.DP.LCS;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        // int dp[][]=new int[n+1][m+1];
        // for(int i=0;i<=n;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return recur(text1,n,text2,m,dp);
        return  tabulation(text1,n,text2,m);
    }
    public int recur(String s1,int n,String s2,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return 1+recur(s1,n-1,s2,m-1);
        }
        int l1=recur(s1,n,s2,m-1);
        int l2=recur(s1,n-1,s2,m);

        return Math.max(l1,l2);
    }

    public int recur(String s1,int n,String s2,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+recur(s1,n-1,s2,m-1,dp);
        }
        int l1=recur(s1,n,s2,m-1,dp);
        int l2=recur(s1,n-1,s2,m,dp);

        return dp[n][m]=Math.max(l1,l2);
    }
    public int tabulation(String s1,int n,String s2,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    continue;
                }
                int l1=dp[i-1][j];
                int l2=dp[i][j-1];
                dp[i][j]=Math.max(l1,l2);
            }
        }
        return dp[n][m];
    }
}
