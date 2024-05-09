package Graphvacations.topological;

import java.util.*;

public class eventualsafestates802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
         List<Integer> result = new ArrayList<>();
         int visited[]=new int[graph.length];
         int path[]=new int[graph.length];
         int check[]=new int[graph.length];
         for (int i = 0; i < graph.length; i++) {
             if(visited[i]==0){
                 eventual(i,visited,path,check,graph);
             }
         }
         for(int i=0;i<graph.length;i++){
             if(check[i]==1){
                 result.add(i);
             }
         }
         return result;
    }



    public List<Integer> eventualSafeNodes2(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
     int indegree[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int it:graph[i]){
                adj.get(it).add(i);
                indegree[i]++;
            }
        }
      Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int node=q.poll();
            result.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public boolean eventual(int node,int vis[],int path[],int check[],int[][]graph){
        vis[node]=1;
        path[node]=1;
        check[node]=0;
        for(int i:graph[node]){
            if(vis[i]==0){
                      if(eventual(i,vis,path,check,graph)){
                          return true;
                      }
            }
            else if(path[i]==1){
                return true;
            }
        }
        path[node]=0;
        check[node]=1;
        return false;

    }
}
