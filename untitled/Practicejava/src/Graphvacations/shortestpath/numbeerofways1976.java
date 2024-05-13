package Graphvacations.shortestpath;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Stop{
    long dest;
    long time;
    Stop(long dest, long time){
        this.dest = dest;
        this.time = time;
    }
}


public class numbeerofways1976 {
    public int countPaths(int n, int[][] roads) {
         ArrayList<ArrayList<Stop>> adj = new ArrayList<>();
         for(int i = 0; i < n; i++){
             adj.add(new ArrayList<Stop>());
         }
         for(int i = 0; i < roads.length; i++){
             adj.get(roads[i][0]).add(new Stop(roads[i][1], roads[i][2]));
             adj.get(roads[i][1]).add(new Stop(roads[i][0], roads[i][2]));
         }
         long[] dist = new long[n];
         long[] ways=new long[n];
         for(int i = 0; i < n; i++){
             dist[i]=Long.MAX_VALUE;
             ways[i]=0;
         }
         dist[0]=0;
         ways[0]=1;
         int mod=(int)(1e9+7);
        PriorityQueue<Stop> q=new PriorityQueue<>((a,b)->Long.compare(a.time,b.time));
        q.add(new Stop(0, 0));

        while(!q.isEmpty()){
            Stop curr=q.poll();
            long des=curr.dest;
            long time=curr.time;

            for(Stop s:adj.get((int)des)){
                long adjP=s.dest;
                long t=s.time;

                if(t+time<dist[(int)adjP]){
                    dist[(int)adjP]=t+time;
                    ways[(int)adjP]=ways[(int)des];
                    q.add(new Stop(adjP, t+time));
                }
                else if(t+time==dist[(int)adjP]){
                    ways[(int)adjP]=(ways[(int)des]+ways[(int)adjP])%mod;
                }
            }
        }
        return (int) ways[n-1]%mod;
    }
}
