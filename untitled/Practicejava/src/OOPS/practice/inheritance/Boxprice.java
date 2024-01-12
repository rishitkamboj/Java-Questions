package OOPS.practice.inheritance;

public class Boxprice extends Boxweight{
    int price;

    public Boxprice(int price) {
        super();
        this.price = price;
    }

    public Boxprice(Box box, int weight, int price) {
        super(box, weight);
        this.price = price;
    }

    public Boxprice(int length, int height, int width, int weight, int price) {
        super(length, height, width, weight);
        this.price = price;
    }
}
