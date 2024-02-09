package oopslab;

/*    WAP in JAVA to create a class find area,
in which three functions one for finding area of circle, second finding area of rectangle,
 third finding area of square and display the result.*/

public class findarea {

    void circle(int r){
        double area=3.14*r*r;
        System.out.println("Area of circle: "+area);
    }

    void rectangle(int l,int b){
        double area=l*b;
        System.out.println("Area of rectangle: "+area);
    }
    void square(int a){
        double area=a*a;
        System.out.println("Area of square: "+area);
    }

    public static void main(String[] args) {
        findarea f=new findarea();
        f.circle(7);
        f.rectangle(1,2);
        f.square(2);
    }

}
