package oopslab;



/* q1) wap in java to handle following exceptions
         (i) arithmetic exception
         (ii) number format exception
        (iii) array index out of bound
        (iv) null pointer exception

*/

public class handleexception {
    public static void main(String[] args) {


    try{
        int a=2/0;
        String b="abc";
        int ab=Integer.parseInt(b);
        String abc=null;
       char ch= abc.charAt(2);

    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic exception");
        System.out.println(e.getMessage());
    }
    catch(NumberFormatException e){
        System.out.println("Number format excpetion");
        System.out.println(e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of bound");
        System.out.println(e.getMessage());
    }
    catch(NullPointerException e ){
        System.out.println("Null pointer ");
        System.out.println(e.getMessage());
    }





}}
