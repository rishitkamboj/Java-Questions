package dynamicprogramming;

import java.util.List;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
return 1;
    }

    public int recur(int n,int i,int j,List<List<Integer>> triangle){
        if(i==n-1){
            return triangle.get(i).get(j);
        }
        int d=triangle.get(i).get(j)+recur(n,i+1,j,triangle);
        int dia=triangle.get(i).get(j)+recur(n,i+1,j+1,triangle);
        return Math.min(d,dia);
    }

    public int recur(int n,int i,int j,List<List<Integer>> triangle,int[][]dp){
        if(i==n-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int d=triangle.get(i).get(j)+recur(n,i+1,j,triangle);
        int dia=triangle.get(i).get(j)+recur(n,i+1,j+1,triangle);
        return dp[i][j]=Math.min(d,dia);
    }


    public int tabul(int n,List<List<Integer>> triangle){
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=triangle.get(i).get(j)+dp[i+1][j];
                int dia=triangle.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(d,dia);
            }
        }
        return dp[0][0];
    }
}
