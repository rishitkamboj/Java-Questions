package oopslab.exam;

import java.util.Scanner;

public class PrimeCLI {
    public static void main(String[] args) {
        int []arr=new int[5];
        for (int i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 4 and 5");
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();

        int count=0;
        for(int i:arr){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("Number of prime numbers: "+count);

    }



    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
