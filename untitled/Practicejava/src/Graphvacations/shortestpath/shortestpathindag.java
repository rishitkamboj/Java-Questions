package Graphvacations.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Pair{
    int first;
    int second;
    Pair(int first, int second){
            this.first = first;
            this.second = second;
    }
}
public class shortestpathindag {

   public void topo(int node,int vis[], ArrayList<ArrayList<Pair>> path, Stack<Integer> stack){
             vis[node]=1;
             for(int i=0;i<path.get(node).size();i++){
                 int temp=path.get(node).get(i).first;
                 if(vis[temp]==0){
                     topo(temp,vis,path,stack);
                 }
             }
             stack.add(node);
   }

    public int[] shortestPath(int N,int M, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for (int i=0;i<N;i++){
            ArrayList < Pair > temp = new ArrayList < Pair > ();
            adj.add(temp);
        }
        for(int i=0;i<M;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }
        int []vis=new int[N];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<N;i++){
            if(vis[i]==0){
                topo(i,vis,adj,stack);
            }
        }
        int dist[] = new int[N];
        Arrays.fill(dist, (int) (1e9));

        dist[0]=0;
        while(!stack.isEmpty()){
            int node = stack.peek();
            stack.pop();
            for(int i=0;i<adj.get(node).size();i++){
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if(dist[node] + wt < dist[v]){
                    dist[v]=dist[node]+wt;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (dist[i] == 1e9) dist[i] = -1;
        }
return dist;
   }
}
