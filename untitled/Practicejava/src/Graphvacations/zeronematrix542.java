package Graphvacations;

import java.util.LinkedList;
import java.util.Queue;

class Pairss{
    int row;
    int col;
    int distance;

    public Pairss(int col, int row, int distance) {
        this.col = col;
        this.row = row;
        this.distance = distance;
    }
}




public class zeronematrix542 {
public int[][] nearest(int grid[][]){
    int n=grid.length;
    int m=grid[0].length;

    int visited[][]=new int[n][m];
    int distance[][]=new int[n][m];
    Queue<Pairss> q=new LinkedList<>();

    for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
    if(grid[i][j]==0){
        q.add(new Pairss(i,j,0));
        visited[i][j]=1;
         }
    else{
        visited[i][j]=0;
    }
    }
    }

    int drow[]={-1,0,1,0};
    int dcol[]={0,-1,0,1};

    while(!q.isEmpty()){
        Pairss pairss=q.poll();
        int r=pairss.row;
        int c=pairss.col;
        int d=pairss.distance;
        distance[r][c]=d;
        for(int i=0;i<4;i++){
        int nrow=r+drow[i];
        int ncol=c+dcol[i];

        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 ){
            visited[nrow][ncol]=1;
            q.add(new Pairss(nrow,ncol,d+1));
        }
        }
    }
    return distance;
}

}
