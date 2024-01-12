package strivercourse.arrays;

public class printmaxsubarraysumarray {
    public static void main(String[] args) {
  int arr[]={0,-1,-2,-3,-4,1,2,3,-1};
        System.out.println("Max sum = "+findmaxsum(arr));
    }



    static long findmaxsum(int arr[]){
        int ansstart=-1,ansend=-1,start=0;
        long sum=0,max=Long.MIN_VALUE;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(sum==0){  start=i; }
            sum+=arr[i];
            if(sum>max){
                max=sum;
                ansstart=start;
                ansend=i;
            }

            if(sum<0){
                sum=0;
                // if empty subarray is there then if(max<0){max=0;}
            }
        }
        for (int i = ansstart; i <=ansend ; i++) {
            System.out.printf("\t %d",arr[i]);
        }
        System.out.print("\n");


        return max;
    }
}
