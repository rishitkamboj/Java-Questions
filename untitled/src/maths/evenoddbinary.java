package maths;

import java.util.Scanner;



public class evenoddbinary {
    public static void main(String[] args) {
      int n=68;
        System.out.println(isOdd(n));

    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
