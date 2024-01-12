package recursionarray;

import java.util.ArrayList;

public class multilpleoccurenceLINEAR {
    public static void main(String[] args) {

    }
   static ArrayList<Integer> hey= new ArrayList<>();
    static void Alllinear2(int []arr,int s,int target) {
        if(s==arr.length) {
            return;
        }
        if(arr[s]==target){
            hey.add(s);
        }
         Alllinear2(arr,s+1,target);
    }
}
