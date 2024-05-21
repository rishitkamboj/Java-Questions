package Graphvacations.disjoinset;

import java.util.*;

public class accountmerge721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
              int n = accounts.size();
              DisjointSet ds = new DisjointSet(n);
        HashMap<String,Integer> map=new HashMap<>();
              for(int i = 0; i < n; i++){
                  for(int j = 1; j < accounts.get(i).size(); j++){
                       String mail=accounts.get(i).get(j);
                       if(!map.containsKey(mail)){
                           map.put(mail,i);
                       }
                       else{
                           ds.unionBySize(i,map.get(mail));

                       }
                  }
              }
         ArrayList<String>[] mergedMail=new ArrayList[n];
              for(int i = 0; i < n; i++){
                  mergedMail[i]=new ArrayList<>();
              }
              for(Map.Entry<String,Integer> it: map.entrySet()){
                     String mail=it.getKey();
                     int node=ds.findParent(it.getValue());
                     mergedMail[node].add(mail);
              }
              List<List<String>> ans=new ArrayList<>();
              for(int i=0; i<n; i++){
                 if(mergedMail[i].size()==0){
                     continue;
                 }
                  Collections.sort(mergedMail[i]);
                 List<String> temp=new ArrayList<>();
                 temp.add(accounts.get(i).get(0));
                 for(String it: mergedMail[i]){
                     temp.add(it);
                 }
                 ans.add(temp);
              }
              return ans;


    }
}
