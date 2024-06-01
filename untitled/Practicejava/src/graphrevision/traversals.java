package graphrevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class traversals {

    static List<Integer> bfss(int V,List<List<Integer>> graph){
        int visited[]=new int[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=1;
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int u=q.poll();
            ans.add(u);
            for(int v:graph.get(u)){
                if(visited[v]==0){
                    visited[v]=1;
                    q.add(v);
                }
            }

        }
        return ans;
    }
    static List<Integer> dfss(int visited[],int src,List<List<Integer>> graph,List<Integer> ans){
           visited[src]=1;
           ans.add(src);
           for(int v:graph.get(src)){
               if(visited[v]==0){
                   dfss(visited,v,graph,ans);
               }
           }
           return ans;
    }
}
