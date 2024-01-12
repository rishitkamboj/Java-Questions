package methods;

public class shadow {
  static  int x=90; // this will be available in this code that means
    //in this block // this will be shadowed at line 10 by 40 value
    public static void main(String[] args) {

        System.out.println(x);// this will print 90
        int x=40;
        System.out.println(x);// this will print 40
        // shadowing in java is the practice of using the
        }
        static void fun() {
            System.out.println(x);
        }
    }


