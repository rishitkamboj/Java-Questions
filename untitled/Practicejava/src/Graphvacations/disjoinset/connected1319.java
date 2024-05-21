package Graphvacations.disjoinset;

public class connected1319 {
    public int makeConnected(int n, int[][] connections) {
           DisjointSet ds = new DisjointSet(n);
           int countExtra=0;
           for(int i=0; i<connections.length; i++) {
               int u=connections[i][0];
               int v=connections[i][1];
               if(ds.findParent(u)==ds.findParent(v)) {
                   countExtra++;
               }
               else{
                   ds.unionBySize(u,v);
               }
           }
           int count=0;
           for(int i=0; i<n; i++) {
               if(ds.findParent(i)==i) {
                   count++;
               }
           }
           int ans=count-1;
           if(countExtra>=ans) {
               return ans;
           }
           return -1;
    }
}
