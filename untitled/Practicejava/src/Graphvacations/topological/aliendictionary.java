package Graphvacations.topological;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class aliendictionary    {
    public String findOrder(String [] dict, int N, int K)
    {
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for (int i=0;i<K;i++){
                        adj.add(new ArrayList<>());
            }
            for(int i=0;i<N-1;i++){
                String s1=dict[i];
                String s2=dict[i+1];
                int length=Math.min(s1.length(),s2.length());
                for(int j=0;j<length;j++){
                    if(s1.charAt(j)!=s2.charAt(j)){
                        adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                        break;
                    }
                }
            }
            List<Integer> topo=toposort(K,adj);
        String s="";
        for(int i:topo){
            s=s+(char)(i+(int)('a'));
        }
        return s;

    }
    public List<Integer> toposort(int v, ArrayList<ArrayList<Integer>> adj){
                   int indegree[]=new int[v];
                   for(int i=0;i<v;i++){
                       for(int it:adj.get(i)){
                           indegree[it]++;
                       }
                   }
                   List<Integer> list=new ArrayList<>();
                   Queue<Integer> q=new LinkedList<>();
                   for(int i=0;i<v;i++){
                       if(indegree[i]==0){
                           q.offer(i);
                       }
                   }
                   while(!q.isEmpty()){
                       int node=q.poll();
                       list.add(node);
                       for(int it:adj.get(node)){
                           indegree[it]--;
                           if(indegree[it]==0){
                               q.offer(it);
                           }
                       }
                   }
                   return list;
    }
}
