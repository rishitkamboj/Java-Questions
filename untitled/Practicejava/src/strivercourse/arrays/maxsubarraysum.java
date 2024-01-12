package strivercourse.arrays;

public class maxsubarraysum {
    public static void main(String[] args) {
        // BRUTE SOLUTION
        /*
        Using three loopssssssss
         */
        /*


        use two loops and put sum=0 in first loop and add in first loop         */
          int arr[]={1,2,3,4,5,6,-1,-2,-4,-10};
        System.out.println(findmaxsum(arr));





    }

    static long findmaxsum(int arr[]){
        long sum=0,max=Long.MIN_VALUE;
        for (int i = 0; i < arr.length-1 ; i++) {
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }


            if(sum<0){
                sum=0;
                // if empty subarray is there then if(max<0){max=0;}
            }
        }
        return max;
    }

}
