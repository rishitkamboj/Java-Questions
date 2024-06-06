package Graphvacations.disjoinset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class DisjointSet {
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();

    public DisjointSet(int n) {
        for(int i=0;i<=n;i++){
           rank.add(0);
           parent.add(i);
           size.add(1);
        }
    }
    public int findParent(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ul=findParent(parent.get(node));
        parent.set(node,ul);
        return parent.get(node);
    }
    public void unionByRank(int node1, int node2){
        int uu=findParent(node1);
        int uv=findParent(node2);
        if(uu==uv){
            return;
        }
        if(rank.get(uu)<rank.get(uv)){
            parent.set(uu,uv);
        }
        else if(rank.get(uu)>rank.get(uv)){
             parent.set(uv,uu);
        }
        else{
            parent.set(uv,uu);
            int r=rank.get(uu);
            rank.set(uu,r+1);
        }

    }


    public void unionBySize(int node1, int node2){
        HashSet<Integer> s=new HashSet<>();
        int uu=findParent(node1);
        int uv=findParent(node2);
        if(uu==uv){
            return;
        }
        if(size.get(uu)<size.get(uv)){
            parent.set(uu,uv);
            size.set(uv,size.get(uu)+size.get(uv));
        }
        else{
            parent.set(uv,uu);
            size.set(uu,size.get(uv)+size.get(uu));
        }
    }



    public static void main(String[] args) {
        DisjointSet ds=new DisjointSet(7);
        ds.unionByRank(1,2);
        ds.unionByRank(2,3);
        ds.unionByRank(4,5);
        ds.unionByRank(6,7);
        ds.unionByRank(5,6);
        if(ds.findParent(3)==ds.findParent(7)){
            System.out.println("SAME");
        }
        else {
            System.out.println("DIFFERENT");
        }
        ds.unionByRank(3,7);
        if(ds.findParent(3)==ds.findParent(7)){
            System.out.println("SAME");
        }
        else {
            System.out.println("DIFFERENT");
        }

    }
}
