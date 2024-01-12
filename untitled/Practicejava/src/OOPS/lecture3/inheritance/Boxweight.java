package OOPS.lecture3.inheritance;

public class Boxweight extends Box {
    double weight;

    static void greeting(){
        System.out.println("Hey, I am in Boxweight Class");
    }

   Boxweight() {
        this.weight = -1;
    }

    Boxweight(Boxweight other) {
       super(other);
        this.weight = -1;
    }

    public Boxweight(double length, double height, double width, double weight) {
        super(length, height, width); //what is this super?
        // it is used to initialise the values present in parent class !!!
        this.weight = weight;
    }
}
