package dynamicprogramming;
import java.util.*;

public class minimumfallingsum {
    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int dp[][] = new int[m][m];


        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int min = (int)1e8;

        for (int j = 0; j < m; j++) {
            min = Math.min(min, recurdp(m-1, j, matrix, m, dp));
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        System.out.println(minFallingPathSum(matrix));
    }



    public int recur(int i,int j,int[][]matrix,int m){
        if(j<0 || j>=m){
            return Integer.MAX_VALUE;
        }
        if(i==0){
            return matrix[0][j];
        }
        int up=matrix[i][j]+recur(i-1,j,matrix,m);
        int upleft=matrix[i][j]+recur(i-1,j-1,matrix,m);
        int upright=matrix[i][j]+recur(i-1,j+1,matrix,m);


        return Math.min(up,Math.min(upleft,upright));
    }


    public static int recurdp(int i, int j, int[][] matrix, int m, int dp[][]) {

        if (j < 0 || j >= m) {
            return (int)(1e8);
        }


        if (i == 0) {
            return matrix[0][j];
        }


        if (dp[i][j] != -1) {
            return dp[i][j];
        }


        int up = matrix[i][j] + recurdp(i-1, j, matrix, m, dp);
        int upleft = matrix[i][j] + recurdp(i-1, j-1, matrix, m, dp);
        int upright = matrix[i][j] + recurdp(i-1, j+1, matrix, m, dp);


        dp[i][j] = Math.min(up, Math.min(upleft, upright));

        return dp[i][j];
    }


    public static int tabulation(int [][]matrix){
        int n =matrix.length;
        int dp[][]=new int[n][n];

        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j];
                int upleft=(int)(1e8);
               if(j>0){  upleft=matrix[i][j]+dp[i-1][j-1];}
               int upright=(int)(1e8);
               if(j+1<n){
                   upright=matrix[i][j]+dp[i-1][j+1];
               }
               dp[i][j] = Math.min(up,Math.min(upleft,upright));
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }




}
