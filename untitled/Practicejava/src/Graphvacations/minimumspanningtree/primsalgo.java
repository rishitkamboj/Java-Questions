package Graphvacations.minimumspanningtree;

import java.util.List;
import java.util.PriorityQueue;

class Pair{
    int node;
    int distance;
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
}

public class primsalgo {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
      PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
      int vis[]=new int[V];
      pq.add(new Pair(0,0));
      int sum=0;
      while(!pq.isEmpty()){
          int wt=pq.peek().distance;
          int node=pq.peek().node;
          pq.remove();
          if(vis[node]==1){
              continue;
          }
          vis[node]=1;
          sum+=wt;
          for(int i=0;i<adj.get(node).size();i++){
              int edW=adj.get(node).get(i)[1];
              int adjN=adj.get(node).get(i)[0];
              if(vis[adjN]==0){
                  pq.add(new Pair(adjN,edW));
              }
          }

      }
return sum;

    }
}
