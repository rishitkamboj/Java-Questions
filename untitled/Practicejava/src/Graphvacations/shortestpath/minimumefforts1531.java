package Graphvacations.shortestpath;

import java.util.PriorityQueue;

class tuple{
    int distance;
    int row;
    int col;
    tuple(int d, int r, int c){
        this.distance = d;
        this.row = r;
        this.col = c;

    }
}




public class minimumefforts1531 {
    public int minimumEffortPath(int[][] heights) {
      int n = heights.length;
      int m = heights[0].length;
      int [][] dis=new int[n][m];
      PriorityQueue<tuple> pq=new PriorityQueue<>((a,b)->a.distance-b.distance);
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              dis[i][j]=(int)(1e9);
          }
      }
      pq.add(new tuple(0,0,0));
      dis[0][0]=0;
      int drow[]={-1,0,1,0};
      int dcol[]={0,-1,0,1};

      while(!pq.isEmpty()){
          int row=pq.peek().row;
          int col=pq.peek().col;
          int dist=pq.peek().distance;
          pq.poll();
          if(row==n-1 && col==m-1){
              return dist;
          }

          for(int i=0;i<4;i++){
              int nrow=row+drow[i];
              int ncol=col+dcol[i];

              if(nrow>=0 && nrow<n && ncol>=0 && ncol<m ){
                  int minEffort=Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),dist);
                  if(minEffort<dis[nrow][ncol]){
                      dis[nrow][ncol]=minEffort;
                      pq.add(new tuple(minEffort,nrow,ncol));
                  }
              }
          }
      }
      return 0;
    }

}
