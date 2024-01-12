package OOPS.practice.inheritance;

public class Box {
    int length;
    int height;
    int width;

    public Box() {
        this.length=-1;
        this.height=-1;
        this.width=-1;
    }

    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Box(Box box) {
        this.length = box.length;
        this.height = box.height;
        this.width = box.width;
    }



}
