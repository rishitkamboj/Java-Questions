package strivercourse.arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityel_n2times {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 5, 5};
        System.out.println("Major element is " + major3(arr));
    }


    static int major1(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > Math.floor(arr.length / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    static int major2(int arr[]) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
         int value= mpp.getOrDefault(arr[i],0);
         mpp.put(arr[i],value+1);
        }

        for(Map.Entry<Integer,Integer> it : mpp.entrySet()){
            if(it.getValue()>Math.floor(arr.length)/2){
                return it.getKey();

            }

        }
        return -1;
    }

    static int major3(int arr[]){
        int count=0,el=0;
        for (int i = 0; i <arr.length ; i++) {
            if(count==0){
                count=1;
                el=arr[i];
            }

            else if(arr[i]==el){
                count++;
            }
            else{ count--;}
        }
        int count1=0;

       // this is done when the array might not have a majority element
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==el){
                count1++;
            }}
            if(count1>(arr.length/2)){
                return el;
            }
            return -1;
        }

    }










