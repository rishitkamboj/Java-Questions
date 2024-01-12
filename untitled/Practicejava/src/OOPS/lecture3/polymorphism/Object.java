package OOPS.lecture3.polymorphism;
import java.util.Random;

public class Object {
    String num;

    public Object(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num;
    }

    public static void main(String[] args) {
//        Object obj=new Object("Rishit");
//        System.out.println(obj);
//

        Random r =new Random();
        System.out.println(Math.abs(r.nextInt()%10+1));


    }
}
