package strivercourse.arrays;

public class findmissnum {
    public static void main(String[] args) {
 int arr[]={1,2,3,4,6,7};
        System.out.println("Missing number is "+xorr(arr));
    }



    static int miss(int arr[]){

        for (int i = 1; i <= arr.length ; i++) {
                    int flag=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }

    //hash BETTER APPROACH
    static int hash(int arr[]){

        int hash[]=new int[arr.length+1];
        for (int i = 0; i < arr.length-1 ; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i <hash.length ; i++) {
            if(hash[i]==0){
                return i;
            }

        }
        return -1;
    }

// OPTIMAL APPROACH 1 USING SUMMATION
    static int sum(int arr[]){
        int sum= (arr.length)*(arr.length+1)/2;
        int sum2=0;
        for (int i = 0; i < arr.length-1; i++) {
            sum2+=arr[i];
        }

        return sum-sum2;
    }
//XOR APPROACH
    static int xorr(int arr[]){
int xor1=0,xor2=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1^= arr.length;

        return xor1^xor2;
    }














    static int cyclicapp(int arr[]){
        int i=1;
        while(i<arr.length){
            int correct=i;
            if(!(arr[i-1]==correct)){
                return correct;
            }
            i++;
        }
        return -1;
    }
}
