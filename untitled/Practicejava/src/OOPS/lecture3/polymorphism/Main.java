package OOPS.lecture3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
//        shape.area();
//        circle.area();
//        square.area();

        // but if we do
        Shapes squ=new Square();
        squ.area();
    }

    // here area is represented in multiple ways as all classes have
    // different methods
}
