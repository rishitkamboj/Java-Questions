package strivercourse.arrays;

import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        //BRUTE FORCE
        int arr1[]={1,2,2,3,4,5};
        int arr2[]={2,2,3,4,5,6};
        ArrayList<Integer> ans=new ArrayList<>();
//        int vis[]=new int[arr2.length];
//        for (int i=0;i<arr1.length;i++){
//            for (int j=0;j<arr2.length;j++){
//              if(arr1[i]==arr2[j] && vis[j]==0){
//                  ans.add(arr1[i]);
//                vis[j]=1;
//                break;
//            }
//            if(arr2[j]>arr1[i])break;
//        }
//    }
//        System.out.println(ans);


        //OPTIMAL APPROACHHHHHHHH

        // SORTED SO 2 POINTERS
        int i=0,j=0;
       while(i<arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j]){
               i++;
           }
           else if(arr2[j]<arr1[i]){
               j++;
           }
           else {
               ans.add(arr1[i]);
               i++;
               j++;
           }
       }




        System.out.println(ans);




} }
