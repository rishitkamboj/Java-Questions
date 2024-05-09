package Graphvacations.topological;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class courseshceduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int indegree[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int ans[]=new int[numCourses];
        int i=0;
        int count=0;
        while(!q.isEmpty()){
            count++;
            int node=q.poll();
            ans[i++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(count==numCourses){
            return ans;
        }
        return new int[]{};
    }
}
