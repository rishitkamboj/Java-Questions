package dynamicprogramming.strings;

public class lcs {
    public int longestCommonSubsequence(String text1, String text2) {
return 1;
    }

    public int subsequences(int ind1,int ind2,String str1,String str2){
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(str1.charAt(ind1)==str2.charAt(ind2)){
            return 1+subsequences(ind1-1,ind2-1,str1,str2);
        }
        return Math.max(subsequences(ind1-1,ind2,str1,str2),subsequences(ind1,ind2-1,str1,str2));
    }


    public int subsequencesdp(int ind1,int ind2,String str1,String str2,int dp[][]){
        if(ind1==0 || ind2==0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(str1.charAt(ind1-1)==str2.charAt(ind2-1)){
            return 1+subsequencesdp(ind1-1,ind2-1,str1,str2,dp);
        }
        return dp[ind1][ind2]=Math.max(subsequencesdp(ind1-1,ind2,str1,str2,dp),subsequencesdp(ind1,ind2-1,str1,str2,dp));
    }


    public int tabulation(String str1,String str2){
        int n=str1.length();
        int m=str2.length();

        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }}
        }
return dp[n][m];
    }
}
