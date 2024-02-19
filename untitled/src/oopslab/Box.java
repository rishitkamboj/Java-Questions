package oopslab;

public class Box {
    double height;
    double width;
    double depth;

    Box(){
        this.height=0;
        this.width=0;
        this.depth=0;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    Box(double l){
        this.height = l;
        this.width = l;
        this.depth = l;
    }
    Box(Box a){
        this.height = a.height;
        this.width = a.width;
        this.depth = a.depth;
    }

    double volume(){
        return height*width*depth;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        this.weight=0;
    }

    BoxWeight(double height, double width, double depth, double weight) {
        super(height, width, depth);
        this.weight = weight;
    }

     BoxWeight(double l, double weight) {
        super(l);
        this.weight = weight;
    }

    public BoxWeight(Box a, double weight) {
        super(a);
        this.weight = weight;
    }
    BoxWeight(BoxWeight a){
         super(a);
         this.weight=a.weight;
    }
}

class Shipment extends BoxWeight{
    double cost;

    Shipment(double cost) {
        super();
        this.cost = cost;
    }


     Shipment(double height, double width, double depth, double weight, double cost) {
        super(height, width, depth, weight);
        this.cost = cost;
    }

  Shipment(double l, double weight, double cost) {
        super(l, weight);
        this.cost = cost;
    }

}

