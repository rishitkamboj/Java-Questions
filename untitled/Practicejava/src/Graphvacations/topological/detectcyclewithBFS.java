package Graphvacations.topological;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class detectcyclewithBFS {

    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int indeg[]=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int count=0;

        while(!q.isEmpty()){
            int node=q.peek();
             q.remove();
             count++;

            for(int it:adj.get(node)){
                indeg[it]--;
                if(indeg[it]==0){
                    q.add(it);
                }
            }
        }
        if(count==V){
            return false;
        }
        return true;
    }
}
