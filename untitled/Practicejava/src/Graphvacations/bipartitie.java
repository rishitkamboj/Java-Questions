package Graphvacations;

import java.util.ArrayList;

public class bipartitie {


    boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int color[]=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(dfs(i,0,colour,adj)==false){
                    return false;
                }
            }
        }
        return true;
    }

    boolean dfs(int node,int colour,int col[],ArrayList<ArrayList<Integer>> adj){
        col[node]=colour;
        for(int i:adj.get(node)){
            if(col[i]==-1){
               if( dfs(i,1-colour,col,adj)==false){
                   return false;
               }
            }
            else if(col[i]==col[node]){
                return false;
            }
        }
        return true;
    }
}
