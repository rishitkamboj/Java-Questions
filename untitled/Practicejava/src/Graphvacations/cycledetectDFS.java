package Graphvacations;

import java.util.ArrayList;

public class cycledetectDFS {
    private boolean DFS(ArrayList<ArrayList<Integer>> adj,int node,int parent,boolean visited[]){
        visited[node] = true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                if(DFS(adj,i,node,visited)){
                    return true;
                }
            }
            else if(i != parent){
                return true;
            }
        }
        return false;
    }


    public boolean isCycle(ArrayList<ArrayList<Integer>> adj,int V){
        boolean visited[]=new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                if(DFS(adj,i,-1,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
