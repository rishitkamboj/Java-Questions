package strivercourse.arrays;

import java.util.Arrays;

public class mergearrwithoutextraspace {
    public static void main(String[] args) {

        int arr1[]={1,4,5,6};
        int arr2[]={7,8,9,10};
mergee(arr1,arr2);

        for (int i:arr1
             ) {
            System.out.print(i+" ");
        }
        for (int j :
                arr2) {
            System.out.print(" "+j);
        }

    }


    //merge my methodddd
    static  void merge(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;k++;
            }
            else if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                j++;k++;
            }
            else{
                arr3[k]=arr2[j];
                i++;j++;k++;
            }
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i++];

        }
        while(j<arr2.length){
            arr3[k++]=arr2[j++];

        }

        System.out.println("Merged array");
        System.out.println(Arrays.toString(arr3));

        i=0;j=0;
        for (i = 0; i<arr1.length ; i++) {
             arr1[i]=arr3[i];
        }
        for (j = 0; j<arr2.length ; j++) {
             arr2[j]=arr3[i+j];
        }




    }


//optimal 1 striverrrrrrrrr

static void mergee(int arr1[], int arr2[]){

        int left= arr1.length-1;
        int right=0;
        while(left>=0 && right< arr2.length){
            if(arr1[left]>arr2[right]){
                swap(arr1[left],arr2[right]);
                left--;
                right++;
            }
            else{
              break;
            }
        }
        Arrays.sort(arr1);
    Arrays.sort(arr2);




    }



    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }


    // optimal approach 2 based upon Shell sorttttt or gap method

    static void mergegap(int arr1[], int arr2[]){
        int len=arr1.length+arr2.length;
        int gap=len/2+(len%2);
        while(gap>0){
            int left=0;
            int right=gap+left;
            while(right<len){
                if(left<arr1.length && right>=arr1.length){
                    swapIfGreater(arr1,arr2,left,right-arr1.length);
                }
                else if(left>=arr1.length){
                    swapIfGreater(arr1,arr2,left-arr1.length,right-arr1.length);

                }
                //arr 1 and arr1
                else{
                    swapIfGreater(arr1,arr2,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) { break;}
            gap=(gap/2)+(gap%2);
        }

    }





    static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }



}
