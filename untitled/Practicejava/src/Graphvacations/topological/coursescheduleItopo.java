package Graphvacations.topological;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class coursescheduleItopo {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
               int indegree[]=new int[numCourses];
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
            for(int i=0;i<numCourses;i++){
                for(int it:adjList.get(i)){
                    indegree[it]++;
                }
            }


               Queue<Integer> q=new LinkedList<>();
               for (int i=0;i<indegree.length;i++){
                   if(indegree[i]==0){
                       q.add(i);
                   }
               }
               int count=0;
               while (!q.isEmpty()){
                   int node=q.poll();
                   count++;
               for(int it:adjList.get(node)){
                   indegree[it]--;
                   if(indegree[it]==0){
                       q.add(it);
                   }
               }
               }
               if(count==numCourses){
                   return true;
               }
               return false;
    }




    public boolean isCycle(int node,int visited[],int path[],ArrayList<ArrayList<Integer>> adjList){
        visited[node]=1;
        path[node]=1;

        for(int it:adjList.get(node)){
            if(visited[it]==0){
                   if(isCycle(it,visited,path,adjList)){
                       return true;
                   }
            }
            else if(path[it]==1){
                return true;
            }
        }
        path[node]=0;
        return false;
    }

}
