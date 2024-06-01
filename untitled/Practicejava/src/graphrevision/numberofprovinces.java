package graphrevision;

import java.util.*;

public class numberofprovinces {
    public int findCircleNum(int[][] isConnected) {
            List<List<Integer>> adj=new ArrayList<>();
            for(int i=0;i<isConnected.length;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<isConnected.length;i++){
                for(int j=0;j<isConnected[i].length;j++){
                    if(isConnected[i][j]==1){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }
            int count=0;
            int visited[]=new int[isConnected.length];
            for(int i=0;i<isConnected.length;i++){
                if(visited[i]==0){
                    dfss(visited,i,adj);
                }
            }
            return count;

    }
    static void dfss(int visited[],int src,List<List<Integer>> graph){
        visited[src]=1;
        for(int v:graph.get(src)){
            if(visited[v]==0){
                dfss(visited,v,graph);
            }
        }
    }
}
