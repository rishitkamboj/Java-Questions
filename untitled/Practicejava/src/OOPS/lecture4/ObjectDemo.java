package OOPS.lecture4;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;

    }


    // we will go in details of how to create it in hashmap lecture
    // it is a number representation of object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(12);
        ObjectDemo obj2=new ObjectDemo(12);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }








}

