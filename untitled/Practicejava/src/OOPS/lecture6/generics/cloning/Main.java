package OOPS.lecture6.generics.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rish=new Human(24,"Hey");
//        Human twin=new Human(rish);
        // this is taking a lot of time.. we r basically
        // creating a copy
        // we can use this using clonable
        Human twin=(Human)rish.clone();
        System.out.println(twin.age);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;

        System.out.println(Arrays.toString(twin.arr));
    }
}
