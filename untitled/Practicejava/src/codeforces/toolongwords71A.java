package codeforces;

import java.util.Scanner;

public class toolongwords71A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int i=1;i<=z;i++){
        String w=sc.next();

        if(w.length()<=10){
            System.out.println(w);
        }
        else{
            String a = w.charAt(0) + Integer.toString(w.length() - 2) + w.charAt(w.length() - 1);
            System.out.println(a);
        }
    }}
}
