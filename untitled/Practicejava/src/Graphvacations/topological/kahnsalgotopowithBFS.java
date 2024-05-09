package Graphvacations.topological;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahnsalgotopowithBFS {
    static int[] topo(int V, ArrayList<ArrayList<Integer>> adj){
        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int j:adj.get(i)) {
                indegree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int ans=0;
        int sort[]=new int[V];
        while(!q.isEmpty()){
            int node=q.peek();
            sort[ans++]=node;
            q.poll();

            for(int j:adj.get(node)) {
                indegree[j]--;
                if(indegree[j]==0){
                    q.add(j);
                }
            }
        }
            return sort;
    }
}
