package dynamicprogramming.strings;

public class editdistance {
    public int minDistance(String word1, String word2) {
return 1;
    }

    public int RECUR(String s1,String s2,int i,int j){
        if(i==0){
            return j;
        }
        if(j==0){
            return i;
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return 0+RECUR(s1,s2,i-1,j-1);
        }
        else {
            return 1+Math.min(RECUR(s1,s2,i,j-1),Math.min(RECUR(s1,s2,i-1,j),RECUR(s1,s2,i-1,j-1)));
        }

    }



    public int RECURDP(String s1,String s2,int i,int j,int[][]dp){
        if(i==0){
            return j;
        }
        if(j==0){
            return i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=0+RECURDP(s1,s2,i-1,j-1,dp);
        }
        else {
            return dp[i][j]=1+Math.min(RECURDP(s1,s2,i,j-1,dp),Math.min(RECURDP(s1,s2,i-1,j,dp),RECURDP(s1,s2,i-1,j-1,dp)));
        }
    }
    public int tabulation(int n,int m,String s1,String s2){
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
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}
