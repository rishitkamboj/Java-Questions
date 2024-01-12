package methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        /* variable length arguments is used when we dont
        know how many inputs are we giving

         */
        fun(2,3,4,5,6);
    }
    static void fun(int ...v)// here no number of inputd
    //are declared so here v is simply an array of ints
            // we can do same with strings aur anything here v is just
            //variable name
    {
        System.out.println(Arrays.toString(v));

    }
}
