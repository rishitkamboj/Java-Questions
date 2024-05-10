package Graphvacations.shortestpath;

import java.util.*;

public class shortestpathwithunit {
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;++i){
            adj.add(new ArrayList<>());}

        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int dist[]=new int[n];
        Arrays.fill(dist, -1);
        dist[src]=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int i:adj.get(cur)){
                if(dist[i]==-1){
                    dist[i]=dist[cur]+1;
                    q.add(i);
                }
            }
        }
        return dist;
    }
}
