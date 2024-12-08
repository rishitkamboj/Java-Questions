package December.DP.LCSandLIS;


import java.util.Arrays;

public class distinctSubs {


    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return recursion(s,t,n,m,dp);
    }
    public int recursion(String s1,String s2,int n,int m){
        if(m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return recursion(s1,s2,n-1,m-1)+recursion(s1,s2,n-1,m);
        }
        return recursion(s1,s2,n-1,m);
    }


    public int recursion(String s1,String s2,int n,int m,int dp[][]){
        if(m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]= recursion(s1,s2,n-1,m-1,dp)+recursion(s1,s2,n-1,m,dp);
        }
        return dp[n][m]=recursion(s1,s2,n-1,m,dp);
    }









}
