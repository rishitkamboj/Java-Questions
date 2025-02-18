package JANUARY.Recursion;

import java.util.Arrays;

public class BasicPrint {
    public static void main(String[] args) {

        System.out.println(fibo(5));
    }



    static void printNtimes(String s,int index){
        if(index<1){
            return;
        }
        System.out.print(s+" ");
        printNtimes(s,index-1);
    }

    static void OnetoN(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        OnetoN(n-1);
    }
    static void NtoOne(int n){
        if(n<1){
            return;
        }
        NtoOne(n-1);
        System.out.print(n+" ");
    }

  static  int sumOnetoN(int n){
        if(n<1){
            return 0;
        }

        return n+sumOnetoN(n-1);
    }

    static  int FactOnetoN(int n){
        if(n<=1){
            return 1;
        }

        return n*FactOnetoN(n-1);
    }

    static void reverseArray(int start,int end,int arr[]){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(start+1,end-1,arr);
        }
    }

    static boolean palinDrome(int start,int end,String s){
        if(start>=end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return palinDrome(start+1,end-1,s);
    }

    static int fibo(int n){
       if(n<2){
           return n;
       }
        return fibo(n-1)+fibo(n-2);
    }





}
