package oopslab;

/* write a program in java to demonstrate function overloading and constructor
   overloading to find area of sphere , area of cylinder and
   area of cuboid.
 */

public class areas {
    int height;
    int radius;
    int length;
    int breadth;

    areas(){
        this.height=0;
        this.radius=0;
        this.length=0;
        this.breadth=0;
    }

    areas(int h,int r){
        this.height=h;
        this.radius=r;
    }
    areas(int r){
        this.radius=r;
    }
    areas(int h,int l,int b){
        this.height=h;
        this.length=l;
        this.breadth=b;
    }

    void area(int radius){
        double sphere=4*3.14*radius*radius;
        System.out.println("Area of sphere: "+sphere );
    }
    void area(int r,int h){
        //2πr (h + r)
        double cylinder=(2*3.14*r)*(h+r);
        System.out.println("Area of cylinder: "+cylinder);
    }
    void area(int l,int b,int h){
        //2(lb+bh+hl)

        double cuboid=2*((l*b)+(b*h)+(h*l));
        System.out.println("Area of cuboid: "+cuboid);

    }

    public static void main(String[] args) {
        areas a=new areas();
        a.area(1,2);
        a.area(1,2,3);
    }

}
