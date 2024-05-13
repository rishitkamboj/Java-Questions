package Graphvacations.shortestpath;


import java.util.*;

class PairP{
    int first;
    int second;

    PairP(int f,int s){
        first=f;
        second=s;

    }
}





public class networkdelaytime743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<PairP>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<PairP>());
        }
        for(int i=0;i<times.length;i++){
            graph.get(times[i][0]).add(new PairP(times[i][1], times[i][2]));
        }
        int dist[]=new int[n+1];
        Arrays.fill(dist,(int)(1e9));
        dist[k]=0;
        PriorityQueue<PairP> q=new PriorityQueue<>((a,b)->a.second-b.second);
        q.add(new PairP(k,0));

        while(!q.isEmpty()){
            int size=q.size();

            PairP p=q.poll();
            int node=p.first;
            int time=p.second;

            for(PairP adj:graph.get(node)){
                int adjNode=adj.first;
                int t=adj.second;

                if(time+t<dist[adjNode]){
                    dist[adjNode]=time+t;
                    q.add(new PairP(adjNode,time+t));
                }
            }
        }
        int res=-1;
        for(int i=1;i<=n;i++){
            res=Math.max(res,dist[i]);
        }

        if(res==(int)(1e9)){
            return -1;
        }
        return res;
    }
}
