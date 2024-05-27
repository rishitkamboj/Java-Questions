package dynamicprogramming.strings;

public class wildcardmatching {
    public boolean isMatch(String s, String p) {
return true;
    }
    public boolean recursion(int i,int j,String s,String p){
        if(i==0 && j==0){
            return true;
        }
        if(i==0){
            for(int m=0;m<j;m++){
                if(p.charAt(m)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(i==0 || j==0){
            return false;
        }

        if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
           return recursion(i-1,j-1,s,p);
        }
        else {
            if(p.charAt(j-1)=='*'){
                return recursion(i-1,j,s,p) ||recursion(i,j-1,s,p);
            }
            return false;
        }
    }
    public int recursiondp(int i,int j,String s,String p,int dp[][]){
        if(i==0 && j==0){
            return 1;
        }
        if(i==0){
            for(int m=0;m<j;m++){
                if(p.charAt(m)!='*'){
                    return 0;
                }
            }
            return 1;
        }
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] ;
        }

        if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){

            return dp[i][j]=recursiondp(i-1,j-1,s,p,dp);
        }
        else {
            if(p.charAt(j-1)=='*'){
                return dp[i][j]=(recursiondp(i-1,j,s,p,dp)==1 ||recursiondp(i,j-1,s,p,dp)==1)?1:0;
            }
            return 0;
        }
    }

    public int isMatch2(String s, String p) {
        int m = s.length();
        int n = p.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the DP table
        dp[0][0] = 1;  // Both strings are empty

        // If s is empty and p is not empty, check if p can match an empty string (only '*' can do this)
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            } else {
                dp[0][j] = 0;
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] | dp[i][j - 1];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m][n];
    }

}
