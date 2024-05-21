package dynamicprogramming;

public class uniquepath {
    public int uniquePaths(int m, int n) {
return 1;
    }


    int recur(int i,int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int up=recur(i-1,j);
        int left=recur(i,j-1);
        return up+left;
    }
    int recur(int i,int j,int dp[][]){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up=recur(i-1,j,dp);
        int left=recur(i,j-1,dp);
        return dp[i][j]=up+left;
    }
    int tabulation(int i,int j){
        int dp[][]=new int[i][j];




        for(int m=0;m<i;m++){
            for(int n=0;n<j;n++){
                if(m==0 && n==0){
                    dp[m][m]=1;
                }
                else{
                 int up=0;
                 int left=0;
                 if(m>0){
                     up=dp[m-1][n];
                 }
                 if(n>0){
                     left=dp[m][n-1];
                 }
                 dp[m][n]=up+left;
            }}
        }
        return dp[i-1][j-1];
    }


}
