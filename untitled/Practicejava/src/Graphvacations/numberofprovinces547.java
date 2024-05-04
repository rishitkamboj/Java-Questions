package Graphvacations;

import java.util.ArrayList;

public class numberofprovinces547 {
    public int findCircleNum2(int[][] isConnected) {
           boolean[] visited = new boolean[isConnected.length];
           int count = 0;

           for (int i = 0; i < isConnected.length; i++) {
               if (visited[i] == false) {
                   count++;
                   dfs(i,isConnected,visited);
               }
           }
           return count;








    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }


        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j){
adj.get(i).add(j);
adj.get(j).add(i);
                }
            }
        }



        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == false) {
                count++;
                dfs2(i,adj,visited);
            }
        }
        return count;








    }

   private void dfs(int node,int[][] adj,boolean visited[]) {

        visited[node] = true;

        for(int i=0;i<adj[node].length;i++) {
            if(!visited[i] && adj[node][i] == 1) {
                dfs(i,adj,visited);
            }
        }
   }

   private void dfs2(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[]){
        visited[node] = true;
        for(int i:adj.get(node)) {
            if(!visited[i]) {
                dfs2(i,adj,visited);
            }
        }
   }

}
