package DSAcourse.questions;

import java.util.Scanner;

public class charhash {
    public static void main(String[] args) {
        //lower case a,b,c,d,e,f
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int hash[]=new int[26]; // can do just 250 like
        // int hash[]=new int[256]; it will work just fine as a will be 97 will go at 97
        for (int i = 0; i <s.length(); i++) {
            hash[s.charAt(i)-'a']++; // hash[s.charAt(i)]++;

        }

        int q;
        System.out.println("Enter number of queries");
        q=sc.nextInt();
        while(q-- !=0){
            char c;
            c=sc.next().charAt(0);
            //fetch
            System.out.println(hash[c-'a']); // hash[c];
        }
    }}
