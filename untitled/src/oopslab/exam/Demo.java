package oopslab.exam;



abstract class Shape{
   abstract void getArea();
   abstract void getPerimeter();
   void printInfo(){}
}
class Circle extends Shape{
    void getArea(){
        double area=3.14*7*7;
        System.out.println("Area of circle is: "+area);
    }
    void getPerimeter(){
        double per=2*3.14*7;
        System.out.println("Perimeter of circle is: "+per);
    }
}

class Rectangle extends Shape{
    void getArea(){
        double area=5*2;
        System.out.println("Area of Rectangle is: "+area);
    }
    void getPerimeter(){
        double per=2*(5+2);
        System.out.println("Perimeter of Rectangle is: "+per);
    }
}






public class Demo {
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape r =new Rectangle();

        c.getArea();
        c.getPerimeter();
        r.getArea();
        r.getPerimeter();
    }
}
