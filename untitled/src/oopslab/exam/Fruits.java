package oopslab.exam;



class Apple{
    void show(){
        System.out.println("I am an Apple");
    }}

    class Banana extends Apple{
        void show(){
            System.out.println("I am a Banana");
        }
    }
    class Cherry extends Apple{
        void show(){
            System.out.println("I am a Cherry");
        }
    }

public class Fruits {
    public static void main(String[] args) {

    Apple a=new Apple();
    Apple b=new Banana();
    Apple c=new Cherry();
    Banana d=new Banana();
    Cherry e=new Cherry();
    a.show();
    b.show();
    c.show();
    d.show();
    e.show();}
}
