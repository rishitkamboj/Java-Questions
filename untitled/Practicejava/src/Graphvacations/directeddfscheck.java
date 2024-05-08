package Graphvacations;

import java.util.ArrayList;

public class directeddfscheck {
    boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        int vis[]=new int[v];
        int pathvis[]=new int[v];
        for(int i=0;i<v;i++){
            if(dfscheck(i,adj,vis,pathvis)){
                return true;
            }
        }
        return false;
    }

    private boolean dfscheck(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathvis) {
        vis[node]=1;
        pathvis[node]=1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                if(dfscheck(i,adj,vis,pathvis)){
                    return true;
                }
            }
            else if(pathvis[i]==1){
                return true;
            }
        }
        pathvis[node]=0;
        return false;
    }
}
