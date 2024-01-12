package DSAcourse.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int n;
        System.out.println("Enter a number to print it's divisors");
        Scanner sc =new Scanner(System.in);
        n= sc.nextInt();
        for (int i =1; i*i <=n ; i++) {
            if(n%i==0){
                list.add(i);
                if((n/i)!=i){
                    list.add(n/i);
                }
        }
            Collections.sort(list);

    }  System.out.println("Multiples");
        System.out.println(list);
}}
