package dynamicprogramming;

public class minimumpath {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        // for(int i[]:dp){
        //     Arrays.fill(i,-1);
        // }
        return mindp(n-1,m-1,grid,dp);
    }
    int mini(int m,int n,int[][]grid){
        if(m==0 && n==0){
            return grid[0][0];
        }
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }
        return grid[m][n]+Math.min(mini(m-1,n,grid),mini(m,n-1,grid));
    }

    int mindp(int m,int n,int [][]grid,int[][]dp){
        if(m==0 && n==0){
            return grid[0][0];
        }
        if(m<0 || n<0){
            return Integer.MAX_VALUE;
        }

        if(dp[m][n]!=0){
            return dp[m][n];
        }

        return dp[m][n]=grid[m][n]+Math.min(mindp(m-1,n,grid,dp),mindp(m,n-1,grid,dp));
    }

    int tabul(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int up=grid[i][j];
                    int left=grid[i][j];
                    if(i>0){
                        up+=dp[i-1][j];
                    }
                    else{
                        up=Integer.MAX_VALUE;
                    }
                    if(j>0){
                        left+=dp[i][j-1];
                    }
                    else{
                        left=Integer.MAX_VALUE;
                    }
                    dp[i][j]=Math.min(left,up);
                }
            }
        }
        return dp[m-1][n-1];
    }


}
