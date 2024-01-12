package OOPS.lecture3.polymorphism;

public class Circle extends Shapes{


    // this will run when the object of Circle is created
    // hence it is overriding the parent method

    @Override // this is called annotation
    // this will check whether something is being overridden or not
    void area(){
        System.out.println("Area is pie*r^2");
    }
}
