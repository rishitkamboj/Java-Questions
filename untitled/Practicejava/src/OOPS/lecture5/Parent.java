package OOPS.lecture5;

public abstract class Parent {
    int age;
    abstract void career();
    abstract void partner();


    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hello");
    }

}
