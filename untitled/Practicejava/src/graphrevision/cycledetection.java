package graphrevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int f;
    int s;
    Pair(int f, int s){
        this.f=f;
        this.s=s;
    }
}

public class cycledetection {
    boolean detectbfs(ArrayList<ArrayList<Integer>> graph,int src,int visited[]) {
        visited[src] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node= p.f;
            int parent= p.s;
            for(int adj:graph.get(node)){
                if(visited[adj]==0){
                    visited[adj]=1;
                    q.add(new Pair(adj,parent));
                }
                else if(adj!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    boolean detectdfs(ArrayList<ArrayList<Integer>> graph,int src,int parent,int visited[]){
        visited[src] = 1;
        for(int adj:graph.get(src)){
            if(visited[adj]==0){
                if(detectdfs(graph,adj,src,visited)){
                    return true;
                }
            }
            else if(adj!=parent){
                return true;
            }
        }
        return false;
    }
}
