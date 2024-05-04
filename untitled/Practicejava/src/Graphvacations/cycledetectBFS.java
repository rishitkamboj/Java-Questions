package Graphvacations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

public class cycledetectBFS {
    boolean detect(ArrayList<ArrayList<Integer>> grid,int src,boolean visited[]){
            visited[src]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(src,-1));

        while(!q.isEmpty()){
            Pair p=q.poll();
            int node=p.first;
            int next=p.second;
        for(int adjacent:grid.get(node)){
            if(!visited[adjacent]){
                visited[adjacent]=true;
                q.add(new Pair(adjacent,node));
            }
            else if(next!=adjacent){
                return true;
            }
        }
        }
return false;
    }

    boolean detectCycle(ArrayList<ArrayList<Integer>> grid,int V){
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(detect(grid,i,visited)){
                    return true;
                }
            }
        }
return false;
    }




}
