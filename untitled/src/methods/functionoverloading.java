package methods;

import java.util.Arrays;
import java.util.Scanner;

public class functionoverloading {
    public static void main(String[] args) {
        //imagine two functions of the same name
        // they can exist if the parameters are diff
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
