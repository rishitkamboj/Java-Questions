package oopslab;


/*q3) wap in java to demonstrate throw and throws keyword to handle exception */
public class throwThrows  {
    public static void main(String[] args) {
        Excep a=new Excep();
        try{
            a.abc();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class Excep {
    void abc() throws AgeException{
        throw new AgeException("abc exception");
    }

}

class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}


