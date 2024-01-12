package strivercourse.arrays;

import java.util.ArrayList;

public class union {
    public static void main(String[] args) {
        //BRUTE FORCE
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,4,5,6};
//        HashSet<Integer>set=new HashSet<>();
//        for (int i:arr1
//             ) {
//            set.add(i);
//        }
//        for (int j:arr2
//             ) {
//            set.add(j);
//        }
//        System.out.println(Arrays.toString(set.toArray()));

        // OPTIMAL APPROACHHHHHHH
      int n1=arr1.length;
      int n2=arr2.length;
      int i=0,j=0;
      ArrayList<Integer> list=new ArrayList<>();
      while(i<n1 && j<n2){ // case 1 or 2 when there is comparsion

          if(arr1[i]<=arr2[j]){
          if(list.size()==0 || list.get(list.size()-1)!=arr1[i])
              list.add(arr1[i]);
              i++;
          }
          else {
              if(list.size()==0 || list.get(list.size()-1)!=arr2[j])
                  list.add(arr2[j]);
                  j++;


      } }
          while(i<n1){
              if(list.size()==0 || list.get(list.size()-1)!=arr1[i])
                  list.add(arr1[i]);

              i++;
          }
          while(j<n2){
              if(list.size()==0 || list.get(list.size()-1)!=arr2[j])
                  list.add(arr2[j]);

              j++;
          }
          System.out.println(list);










      }
    }

