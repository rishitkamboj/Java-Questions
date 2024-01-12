package hello;

import java.util.Scanner;

public class reversingastring {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        String str=s.toLowerCase();
//        for(int i=str.length()-1;i>=0;i--) {
//            System.out.print(str.charAt(i));
//
//        }
        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}