package Graphvacations.topological;

import java.util.ArrayList;
import java.util.Stack;

public class topo {
    void DFS(int node, int vis[], Stack<Integer> s, ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        for(int i:adj.get(node)){
              if(vis[i]==0){
                  DFS(i,vis,s,adj);
              }
        }
          s.push(node);
    }

    int[] topologicalSort(ArrayList<ArrayList<Integer>> adj,int V){
        int vis[]=new int[V];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                DFS(i,vis,s,adj);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!s.isEmpty()){
            ans[i++]=s.peek();
            s.pop();
        }
        return ans;
    }
}
