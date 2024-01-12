package OOPS.practice;

public  class Human {
    int age;
    String name;
    static int population;// it is static as it is not related to any sort of object
    // or you can say it is same to all the instances



    public Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population++;
        // we took Human.population here to signify that population doesnt depend on the object
        // even tho it will work with this. also but it is BETTER to use class name
    }

    static void pop(){
        System.out.println("Population is "+Human.population);
    }

    void pop2(){
        System.out.println(population);
        // it can be called without this or human too
    }


    public static void main(String[] args) {
        Human Rishit=new Human(19,"Rishit");
        Human Ritesh=new Human(20,"Ritesh");


    }



}

