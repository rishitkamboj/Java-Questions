package maths;

public class prime  {
    public static void main(String[] args) {
        for(int i=1;i<40;i++) {
            prime(i);
        }

    }
    static void prime(int n) {
        if (n == 0) {
            System.out.print("");
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.print(" ");
            }
            c++;
            System.out.print(n + " ");
        }
    } }