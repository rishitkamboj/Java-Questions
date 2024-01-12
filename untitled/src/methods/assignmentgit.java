package methods;

import java.util.Scanner;

public class assignmentgit {
    public static void main(String[] args) {
//        max();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the cirle: ");
        float r=sc.nextFloat();
        System.out.println("Enter the units of radius");
       String units =sc.next();
       String units2= "sqr"+ units ;
        System.out.println("Area of circle is "+area(r)+" "+units2);
        System.out.println("Circumference of circle is "+circumference(r)+" "+units);
//        System.out.println("Enter a number to check whether it is odd or even");
//        int a=sc.nextInt();
//
//        System.out.println("Given number is even "+ oddeve(a));
    }
//    static void max() {
//        Scanner sc= new Scanner(System.in);
//       int a,b,c;
//        System.out.println("Enter number 1");
//        a=sc.nextInt();
//        System.out.println("Enter number 2");
//        b=sc.nextInt();
//        System.out.println("Enter number 3");
//        c=sc.nextInt();
//        System.out.println("Maximum number is "+Math.max( a, Math.max(b,c)));

     static double circumference(float r) {
        return 2*3.14;

     }
     static double area(float r) {
        return 3.14*r*r;
     }

//    }
static boolean oddeve(int a) {
        if(a%2==0) {
            return true;
        }
        return false;
}
}
