package December.arrays.medium;

public class sortanArrayof012 {

    //method 1 sort the array
    //method 2 count the no of 0s 1s and 2s
    // method 3 Dutch national flag

    void dutchNationalFlag(int arr[]){
        int n = arr.length;
        int s=0;
        int m=0;
        int e=arr.length-1;
        while(m<=e){
            if(arr[m]==0){
                //swap(s,m,arr);
                s++;
                m++;
            }
           else  if(arr[m]==1){
                m++;
            }
           else{
               // swap(m,e,arr);
                e--;
            }
        }
    }
}
