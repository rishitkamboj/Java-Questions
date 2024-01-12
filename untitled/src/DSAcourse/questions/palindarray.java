package DSAcourse.questions;

import java.util.Scanner;

public class palindarray {
    public static void main(String[] args) {
String abc="madam";
        System.out.println(str(abc,0));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
    }
    static boolean str(String str,int s){
       if(s>=str.length()/2){
           return true;
       }

        if(str.charAt(s)!=str.charAt(str.length()-s-1)){
           return false;
       }


       return  str(str,s+1);


    }
}
