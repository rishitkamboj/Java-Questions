package oopslab;

abstract class AnonymousInner {
    public abstract void method();
}

public class innerclasses {


   public  class i{
        void print(){
            System.out.println("Inner class");
        }
    }


    void Methodlocal() {
        int num = 10;
// method-local inner class
        class MethodInner {
            public void print() {
                System.out.println("This is method inner class "+num);
            }
        }

        MethodInner inner = new MethodInner();
        inner.print();
    }


    static class Nested_Demo {
        public void stat() {
            System.out.println("This is my nested class");
        }
    }



    public static void main(String args[]) {
        AnonymousInner inner = new AnonymousInner() {
            public void method() {
                System.out.println("This is an example of anonymous inner class");
            }
        };

      innerclasses a=new innerclasses();
      innerclasses.i b=a.new i();
      b.print();
        innerclasses.Nested_Demo d=new innerclasses.Nested_Demo();
        d.stat();
        inner.method();
    }






}
