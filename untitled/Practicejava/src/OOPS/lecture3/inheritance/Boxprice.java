package OOPS.lecture3.inheritance;

public class Boxprice extends Boxweight {
           float price;

    public Boxprice(float price) {
        this.price = price;
    }
    public Boxprice() {
        super();
        this.price = -1;
    }

    public Boxprice(Boxprice other) {
        super(other);
        this.price = other.price;
    }



    public Boxprice(double length, double height, double width, double weight, float price) {
        super(length, height, width, weight);
        this.price = price;
    }
}
