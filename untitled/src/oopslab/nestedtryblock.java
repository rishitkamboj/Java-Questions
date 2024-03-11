/* q2) wap in java to implement nested try catch block*/



package oopslab;


public class nestedtryblock {
    public static void main(String[] args) {
        try{
            int a=2/3;

            try{
                int b=3/0;
            }
            catch(Exception e){
                System.out.println("Exception catched from inner try block");
            }
        }
        catch(Exception e){
            System.out.println("Exception catched from outer try block");
        }
    }
}
