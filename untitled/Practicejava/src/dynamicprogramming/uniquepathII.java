package dynamicprogramming;

public class uniquepathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
return 1;
    }


    int recur(int i,int j,int[][]arr){
        if(i==0 && j==0 && arr[0][0]==0){
            return 1;
        }
        if(i<0 || j<0 || arr[i][j]==1){
            return 0;
        }
        int up=recur(i-1,j,arr);
        int left=recur(i,j-1,arr);
        return up+left;
    }

    int recur(int i,int j,int[][]arr,int dp[][]) {
        if(i<0 || j<0 || arr[i][j]==1){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up=recur(i-1,j,arr,dp);
        int left=recur(i,j-1,arr,dp);
        return dp[i][j]=up+left;
    }


    int tabulize(int m,int n,int[][]arr){
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0 && j>0 && arr[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
              if(i==0 && j==0){
                  dp[i][j]=1;
                  continue;
              }

                  int up=0;
                  int left=0;
                  if(i>0){
                      up=dp[i-1][j];
                  }
                  if(j>0){
                      left=dp[i][j-1];
                  }
                  dp[i][j]=up+left;

        }}
        return dp[m-1][n-1];
    }

}
