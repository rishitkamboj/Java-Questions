package OOPS.lecture6.generics.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human other) {
        this.age=other.age;
        this.name=other.name;
        this.arr=new int[]{3,4,5,6,9,1};
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,5,6,9,1};
    }

//    public Object clone() throws CloneNotSupportedException{
//
//      // this is shallow copy
//
//
//        return super.clone();
//    }

        public Object clone() throws CloneNotSupportedException{

      // this is shallow copy
   Human twin=(Human)super.clone();


   // make a deep copy
            twin.arr=new int[twin.arr.length];
            System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
   return twin;

    }

}
