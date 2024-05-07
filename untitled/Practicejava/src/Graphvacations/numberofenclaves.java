package Graphvacations;

import java.util.LinkedList;
import java.util.Queue;


class Paires{
    int r;
    int c;
    Paires(int r,int c){
        this.r=r;
        this.c=c;
    }
}

public class numberofenclaves {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int visited[][]=new int[n][m];
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        for(int j=0;j<m;j++){
            if(grid[0][j]==1 && visited[0][j]==0){
                dfs(0,j,grid,visited,drow,dcol);
            }
            if(grid[n-1][j]==1 && visited[n-1][j]==0){
                dfs(n-1,j,grid,visited,drow,dcol);
            }

        }

        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && visited[i][0]==0){
                dfs(i,0,grid,visited,drow,dcol);
            }
            if(grid[i][m-1]==1 && visited[i][m-1]==0){
                dfs(i,m-1,grid,visited,drow,dcol);
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }



    void dfs(int r,int c,int[][] mat,int[][]vis,int[]drow,int[]dcol){
        int n=mat.length;
        int m=mat[0].length;
        vis[r][c]=1;
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]==1){
                dfs(nrow,ncol,mat,vis,drow,dcol);
            }
        }
    }

    void bfs(int r,int c,int[][]mat,int[][]visited){
        int n=mat.length;
        int m=mat[0].length;
        visited[r][c]=1;
        Queue<Paires> q=new LinkedList<>();
        q.add(new Paires(r,c));

        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};

        while(!q.isEmpty()){
            Paires p=q.poll();
            int row=p.r;
            int col=p.c;
            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && mat[nrow][ncol]==1 && visited[nrow][ncol]==0){
                    visited[nrow][ncol]=1;
                    q.add(new Paires(nrow,ncol));
                }
            }
        }

    }
}
