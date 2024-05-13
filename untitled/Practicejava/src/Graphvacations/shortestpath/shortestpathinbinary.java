package Graphvacations.shortestpath;

import java.util.LinkedList;
import java.util.Queue;

class Tuple{
    int distance;
    int f;
    int s;
    Tuple(int d, int f, int s){ this.distance = d; this.f = f; s = this.s;
    }
}




public class shortestpathinbinary {
    public int shortestPathBinaryMatrix(int[][] grid) {
              int n=grid.length;
              int m=grid[0].length;
              Queue<Tuple> q=new LinkedList<Tuple>();
              q.add(new Tuple(0,0,0));

        int[][] dist = new int[n][m];
        for(int i = 0;i<n;i++) {
            for(int j =0;j<m;j++) {
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0]=0;
       int drow[]={1,-1,0,0};
       int dcol[]={0,0,1,-1};

       while(!q.isEmpty()) {
           Tuple t=q.poll();
           int dis=t.distance;
           int r=t.f;
           int c=t.s;
           for(int i = 0;i<4;i++) {
               int x=r+dcol[i];
               int y=c+drow[i];
               if(x>=0 && x<n && y>=0 && y<m && grid[x][y]==1 && dis+1<dist[x][y]) {
                   dist[x][y]=dis+1;

                   if(x==n-1 && y==m-1) {
                       return dis+1;
                   }

                   q.offer(new Tuple(dis+1,x,y));
               }

           }
       }

return -1;
    }
}
