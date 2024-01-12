package RECURSION;

public class pr1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        if(n==5) {// base condition
            /* hello */
            System.out.println(5);
            return;}
        System.out.println(n);

        // if you are calling a function again and again,
        // you can treat it as a separate call in the stack
        print(n+1);
    }}


