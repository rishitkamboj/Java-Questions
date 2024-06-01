package graphrevision;

import java.util.ArrayList;
import java.util.List;



public class maxareaofisland {
    public int maxAreaOfIsland(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        int count=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){

                  count=Math.max(count, dfs(n,m,i,j,grid,drow,dcol,visited));
                }
            }
        }

        return count;
    }
    int dfs(int n,int m,int r,int c,int grid[][],int drow[],int dcol[],int visited[][]){

        visited[r][c]=1;
        int area=1;
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                area+= dfs(n,m,nrow,ncol,grid,drow,dcol,visited);
            }
        }

        return area;
    }

    }





