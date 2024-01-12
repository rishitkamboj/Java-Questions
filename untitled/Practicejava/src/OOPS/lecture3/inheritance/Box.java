package OOPS.lecture3.inheritance;

public class Box {
    double length;
    double height;
    double width;

  static void greeting(){
      System.out.println("Hey, I am in Box Class");
  }


    public Box() {
        this.height=-1;
        this.width=-1;
        this.length=-1;
    }

    Box(double side){
        this.height=side;
        this.width=side;
        this.length=side;
    }

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box( Box old){
        this.height=old.height;
        this.length=old.length;
        this.width=old.width;
    }




    public void info(){
        System.out.println("Running the box");
    }
}
