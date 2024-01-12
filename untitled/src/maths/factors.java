package maths;

import java.util.ArrayList;
import java.util.Arrays;

public class factors {
    public static void main(String[] args) {
        factors3(20);
    }

    // O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + "  " + (n / i)+" ");
                }
            }
        }
    }


    // O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }



    static void factors3(int n) {
        ArrayList<Integer> List=new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i + "  ");
                    List.add(n/i);
                }
            }
        }
        for (int i = List.size()-1; i>=0 ; i--) {
            System.out.print(List.get(i)+" ");
        }
    }
    //both time and space will be
}