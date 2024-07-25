package striverAtoZ.ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class unionoftwoarrays {


  public static  List<Integer> union(int arr1[],int arr2[],int n,int m){
      int i=0;
      int j=0;
      List<Integer> ans = new ArrayList<Integer>();
      while(i<n && j<m){
          if(arr1[i]<arr2[j]){
              if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i]) {
                  ans.add(arr1[i]);

              }
              i++;
          }
          else if(arr2[j]<arr1[i]){
              if(ans.isEmpty() || ans.get(ans.size()-1)!=arr2[j]) {
                  ans.add(arr2[j]);
              }
              j++;
          }
          else{
              if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                  ans.add(arr1[i]);
              }
              i++;
              j++;
          }
      }
      while(i<n){
          if(ans.isEmpty() || ans.get(ans.size()-1)!=arr1[i]) {
              ans.add(arr1[i]);
          }
          i++;
      }
      while(j<m){
          if(ans.isEmpty() || ans.get(ans.size()-1)!=arr2[j]) {
              ans.add(arr2[j]);
          }
          j++;
      }
      return ans;
  }
}
