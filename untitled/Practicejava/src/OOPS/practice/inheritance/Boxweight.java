package OOPS.practice.inheritance;

public class Boxweight extends Box{
    int weight;

    public Boxweight(int length, int height, int width, int weight) {
        super(length, height, width);
        this.weight = weight;
    }

    public Boxweight() {
        super();
        this.weight=-1;
    }

    public Boxweight(Box box, int weight) {
        super(box);
        this.weight = weight;
    }

}
