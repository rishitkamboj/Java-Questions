package dynamicprogramming;

import java.util.Arrays;

public class cherrypickup3ddp {
    public int cherryPickup(int[][] grid) {
int n=grid.length;
int m=grid[0].length;
int[][][] dp =new int[n][m][m];
for(int[][] i :dp){
    for(int[] j :i){
        Arrays.fill(j,-1);
    }
}
return recurdp(0,0,m-1,n,m,grid,dp);
    }


    public int recurdp(int i,int j1,int j2,int n,int m,int [][]grid,int [][][]dp){
        if(j1<0 || j1>=m || j2<0 || j2>=m){
            return (int)(Math.pow(-10, 9));
        }
        if(i==n-1){
            if(j1==j2){
                return grid[i][j1];
            }
            else {
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int max=(int)(-1e8);
        for(int k=-1;k<=1;k++){
            for(int l=-1;l<=1;l++){
                int value=0;
                if(j1==j2){
                   value=grid[i][j1];
                }
                else{
                    value=grid[i][j1]+grid[i][j2];
                }
                value+=recurdp(i+1,j1+k,j2+l,n,m,grid,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }


    public int tabulation(int [][] grid){
         int n=grid.length;
         int m=grid[0].length;
         int[][][] dp=new int[n][m][m];

         for(int j1=0;j1<m;j1++){
             for(int j2=0;j2<m;j2++){
                 if(j1==j2){
                     dp[n-1][j1][j2]=grid[n-1][j1];
                 }
                 else{
                     dp[n-1][j1][j2]=grid[n-1][j1]+grid[n-1][j2];
                 }
             }
         }

         for(int i=n-2;i>=0;i--){
             for(int j1=0;j1<m;j1++){
                 for(int j2=0;j2<m;j2++){
                     int max=Integer.MIN_VALUE;
                     for(int k=-1;k<=1;k++){
                         for(int l=-1;l<=1;l++){
                             int value;
                             if(j1==j2){
                                 value=grid[i][j1];
                             }
                             else{
                                 value=grid[i][j1]+grid[i][j2];
                             }
                             if ((j1 + k < 0 || j1 + k >= m) || (j2 + l < 0 || j2 + l >= m))
                                 value += (int) Math.pow(-10, 9);
                             else
                                 value += dp[i + 1][j1 + k][j2 + l];

                             max=Math.max(max,value);
                         }
                     }
                     dp[i][j1][j2]=max;
                 }
             }
         }






 return dp[0][0][m-1];
    }
}
