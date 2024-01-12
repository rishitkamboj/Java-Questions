package hello;

import java.util.Scanner;

public class stringpalidroneornot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String str=s.toLowerCase();
        for(int i=0;i<=str.length()/2;i++) {
            if(str.charAt(i)==str.charAt(str.length()-i-1)) {
                System.out.println("Input string is a palindrome ");
            break;}
                else {
                    System.out.println("it is not a palindrome");
            }


       }




    }
}
