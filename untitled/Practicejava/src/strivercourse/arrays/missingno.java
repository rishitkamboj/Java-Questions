package strivercourse.arrays;

public class missingno {
    public static void main(String[] args) {

    }

    // brute to check by using nested loops
    // better approach to use hashing
    //optimal approach 1 maths

    static int[] miss(int arr[]){
           long n=arr.length;
           //S-Sn
        //S2-S2n
        long S=0,S2=0;
        long Sn=(n+1)*n/2;
        long S2n=(n+1)*(n)*(2*n+1)/2;
        int x=-1,y=-1;

        for (int i = 0; i <n; i++) {
            S+=arr[i];
            S2+=((long)(arr[i])*(long)(arr[i]));
        }
        int val1=(int)(S-Sn); //x-y
        int val2=(int)(S2-S2n);
        val2=val2/val1; // x+y

        x=(val1+val2)/2;
        y=x-val1;




        return new int[]{x,y};
    }







    // optimal approach 2 i.e XOR approach






    static int[] missing(int arr[]){
        int n=arr.length;
        int xr=0;
        for (int i = 0; i <n ; i++) {
            xr=xr^arr[i];
            xr=xr^(i+1);
        }
        int bitNo=0;
        while(true){
         if(( xr & (1<<bitNo)) !=0){
             break;
         }
         bitNo++;
        }
        // it can be done by doing xr & ~(xr-1)
 int zero=0;
        int one=1;
        for (int i =0; i <n ; i++) {
           if((arr[i] & (1<<bitNo)) != 0){
               one=one^arr[i];
               one=one^i;

           }
           else {
               zero=zero^arr[i];
               zero=zero^i;

           }

        }
        int count=0;
        for (int i = 0; i < n; i++) {
           if(arr[i]==zero){
               count++;
           }
        }

        if (count==2)
        {return new int[]{zero,one};}
        return new int[]{one,zero};
    }
}
