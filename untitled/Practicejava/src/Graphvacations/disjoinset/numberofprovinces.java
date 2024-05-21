package Graphvacations.disjoinset;

public class numberofprovinces {
    public int findCircleNum(int[][] isConnected) {
       DisjointSet ds=new DisjointSet(isConnected.length);
       for(int i=0;i<isConnected.length;i++){
       for(int j=0;j<isConnected[i].length;j++){
                  if(isConnected[i][j]==1){
                      ds.unionBySize(i,j);
                  }
       }
       }
       int count=0;
       for(int i=0;i<isConnected.length;i++){
           if(ds.findParent(i)==i){
               count++;
           }

       }
       return count;
    }





        }
