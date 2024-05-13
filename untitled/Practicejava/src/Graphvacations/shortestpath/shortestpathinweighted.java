package Graphvacations.shortestpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


class P{
    int first;
    int second;
    P(int f,int s){
        first = f;
        second = s;
    }
}

public class shortestpathinweighted {
    public static List<Integer> shortestPath(int n,int m,int[][]edges){
        ArrayList<ArrayList<P>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(new P(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new P(edges[i][0],edges[i][0]));
        }
        int dist[]=new int[n+1];
        int parent[]=new int[n+1];
        for(int i=1;i<=n;i++){
            dist[i]=(int)(1e9);
            parent[i]=i;
        }
        dist[1]=0;
        PriorityQueue<P> pq=new PriorityQueue<>((a,b)->a.second-b.second);
        pq.add(new P(0,1));

        while(!pq.isEmpty()){
            int dis=pq.poll().first;
            int node=pq.poll().second;

            for(P pair:adj.get(node)){
                int adjnode=pair.first;
                int weight=pair.second;
                if(dis+weight<dist[adjnode]){
                    dist[adjnode]=dis+weight;
                    pq.add(new P(weight,dis+weight));
                    parent[adjnode]=node;
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        int node=n;
        while(parent[node]!=node){
            res.add(node);
            node=parent[node];
        }
        res.add(1);
        Collections.reverse(res);
return res;
    }
}
