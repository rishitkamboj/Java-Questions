package strivercourse.arrays;

import java.util.Arrays;

public class putzeroatend {
    public static void main(String[] args) {
        //BRUTE FORCE
        int arr[]={1,2,3,0,3,4,5,0,1,1,1,0,0,0,0,1};
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i:arr) {
//            if(i!=0){
//                list.add(i);
//            }
//        }
//
//        for (int i = 0; i <list.size(); i++) {
//          arr[i]=list.get(i);
//
//        }
//        for (int i= list.size();i<arr.length;i++){
//            arr[i]=0;
//        }
//        System.out.println(Arrays.toString(arr));

        //OPTIMAL SOLUTIONNNN
// we r using 2 pointer methodddd
        int j=-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==0) {
                j = i;
                break;
            }
        }
        for (int i =j+1; i < arr.length ; i++) {
            if(arr[i]!=0){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              j++;
            }

        }
        System.out.println(Arrays.toString(arr));


    }
}
