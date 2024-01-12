package OOPS.extendDemo2;

public interface A {

    static void greet(){
        System.out.println("HEYLOOO");
    }
    // call via the interface nameee okayyyyy


   default void fun(){
       System.out.println("I am in A");
   };
}
