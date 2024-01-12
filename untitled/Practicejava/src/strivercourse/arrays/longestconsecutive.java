package strivercourse.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class longestconsecutive {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,8,9,10};
        System.out.println(longseq(arr));
    }





    // my way or brute force similar thing
   static int longest(int arr[]){
        int longest=1;
int count=0;
       for (int i = 0; i < arr.length; i++) {
                     int x=arr[i];
                     count=1;
                     while(ls(arr,x+1)==true){
                         x++;
                         count++;
                     }
                     longest=Math.max(count,longest);
       }
       return longest;
   }


   static boolean ls(int arr[], int x){
        boolean ans=false;
       for (int i:arr
            ) {
           if(i==x){
               return true;
           }

       }
       return ans;
   }


// BETTER SOLUTIONNNNNN
    static int longer(int arr[]){
        Arrays.sort(arr);
int longest=1,count=0,lastsmall=Integer.MIN_VALUE ;
for (int i = 0; i < arr.length; i++) {
     if(arr[i]-1 == lastsmall){
         count++;
         lastsmall=arr[i];
     }
     else if (arr[i] != lastsmall){
         count=1;
         lastsmall=arr[i];
     }
     longest=Math.max(count,longest);

        }
return longest;
    }

    // optimalllllllll
    static int longseq (int arr[]){
        if(arr.length==0){ return 0;}
   int longest=1;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }

        for (int it:set) {

            if(!set.contains(it-1)){
                int count=1;
                int x=it;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }

        return longest;
    }
















}
