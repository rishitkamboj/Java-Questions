package Graphvacations.disjoinset;

import java.util.ArrayList;
import java.util.List;

public class numberofislandsII {
    List<Integer> numberofislands(int n,int m,int[][] operators){
            DisjointSet ds = new DisjointSet(n*m);
            int[][]vis=new int[n][m];
            int count=0;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<operators.length;i++){
                int row=operators[i][0];
                int col=operators[i][1];
                if(vis[row][col]==1){
                    list.add(count);
                    continue;
                }
                vis[row][col]=1;
                count++;

               int drow[]={-1,0,1,0};
               int dcol[]={0,1,0,-1};
               for(int j=0;j<4;j++){
                   int nrow=row+drow[j];
                   int ncol=col+dcol[j];
                   if(isValid(nrow,ncol,n,m)){
                       if(vis[nrow][ncol]==1){
                           int node=row*m+col;
                           int adj=nrow*m+ncol;
                           if(ds.findParent(node)!=ds.findParent(adj)){
                               count--;
                               ds.unionBySize(node,adj);
                           }
                       }
                   }
               }
               list.add(count);
            }

            return list;
    }

    private boolean isValid(int nrow, int ncol, int n, int m) {
        return nrow>=0 && nrow<n && ncol>=0 && ncol<m ;
    }
}
