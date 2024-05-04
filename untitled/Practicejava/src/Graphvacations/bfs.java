package Graphvacations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    ArrayList<Integer> bfsofGraph(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int n=q.poll();
            bfs.add(n);

            for(int v:adj.get(n)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        return bfs;
    }
}
