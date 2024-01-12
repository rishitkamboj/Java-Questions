package DSAcourse.questions;

public class printname {
    public static void main(String[] args) {
name(5);
    }

   static void name(int n){
       if(n<1){
           return;
       } System.out.println("Rishit"+n);
       name(n-1);


    }
}
