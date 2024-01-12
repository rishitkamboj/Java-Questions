package strivercourse.arrays;

import java.util.ArrayList;

public class nby3times {
    public static void main(String[] args) {

int arr[]={1,1,1,2,2,2,7,5};
        System.out.println(n3times(arr));



    }


    static ArrayList<Integer> n3times(int arr[]){
        ArrayList<Integer>ans=new ArrayList<>();
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(cnt1==0 && el2 !=arr[i]){
                cnt1=1;
                el1=arr[i];
            }
           else if(cnt2==0 && el1 !=arr[i]){
                cnt2=1;
                el2=arr[i];
            }
           else if(arr[i]==el1){ cnt1++;}
            else if(arr[i]==el2){ cnt2++;}
            else{ cnt1--;
            cnt2--;}
        }

        cnt1=0;
        cnt2=0;
        for (int i = 0; i < arr.length; i++) {
            if(el1==arr[i]){ cnt1++;}
            if(el2==arr[i]){ cnt2++;}

        }
        int mini=(int)(arr.length/3)+1;
        if(cnt1>= mini){ ans.add(el1);}
        if(cnt2>= mini){ ans.add(el2);}

        return ans;
    }

}
