package OOPS.lecture5;

public class Daughter extends Parent{


    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am goiing to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love pastaa");
    }
}
