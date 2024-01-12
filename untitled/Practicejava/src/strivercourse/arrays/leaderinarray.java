package strivercourse.arrays;

import java.util.ArrayList;

public class leaderinarray  {
    public static void main(String[] args) {
        int arr[]={1,2,8,4,5,6};
        System.out.println("leaders are "+lead(arr));



    }
    //brute force
    static ArrayList<Integer> leaders(int arr[]){
          ArrayList<Integer> leader=new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            boolean lead=true;
            for (int j = i+1; j < arr.length ; j++) {
                  if(arr[j]>arr[i]){ lead=false;
                  break;
                  }
            }
            if(lead){
                leader.add(arr[i]);
            }

        }

       return leader;
    }






    //another approach of mine
    static ArrayList<Integer> lead(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();


        int maxright=Integer.MIN_VALUE;

        for (int i = arr.length-1; i>=0 ; i--) {
             if(arr[i]>maxright){
                 ans.add(arr[i]);
                 maxright=arr[i];
             }
        }



        return ans;
    }

}
