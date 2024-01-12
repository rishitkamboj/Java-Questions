package methods;

import java.util.Scanner;

public class palindromecheckpart2stringway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        String s=sc.next();
        System.out.println("Given number "+s+" is palindrome: "+check(s));

    }
    static boolean check(String s) {
        int length= s.length();
        for(int i=0;i<=length/2;i++) {
            if(s.charAt(i)!=s.charAt(length-1-i)){
                return false;
            }
        } return true;
    }
} /*
 /* ffdgdv */
