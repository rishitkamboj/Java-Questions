package December.DP.LCS;

public class SuperSequence {

    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();

        return tabulation(str1,str2,n,m);
    }
    String tabulation(String s1,String s2,int n,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder s =new StringBuilder();
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                s.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                s.append(s1.charAt(i-1));
                i--;
            }
            else{
                s.append(s2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            s.append(s1.charAt(i-1));
            i--;
        }
        while(j>0){
            s.append(s2.charAt(j-1));
            j--;
        }
        return s.reverse().toString();
    }
}
