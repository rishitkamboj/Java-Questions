package Graphvacations.shortestpath;

import java.util.ArrayList;
import java.util.PriorityQueue;

class pair{
    int distance;
    int node;
    pair(int d, int n){
        distance = d;
        node = n;
    }

}




public class dijsktraPRIORITY {
    static int[] dijskta(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj,int S){
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b)->a.distance-b.distance);
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)(1e9);
        }
        dist[S]=0;
        pq.add(new pair(0,S));
        while(!pq.isEmpty()){
            int dis=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            for (int i=0;i<adj.get(node).size();i++){
                int adjNode=adj.get(node).get(i).get(0);
                int adjWeight=adj.get(node).get(i).get(1);

                if(dis+adjWeight < dist[adjNode]){
                    dist[adjNode]=dis+adjWeight;
                    pq.add(new pair(dist[adjNode],adjNode));
                }
            }

        }
        return dist;
    }
}
