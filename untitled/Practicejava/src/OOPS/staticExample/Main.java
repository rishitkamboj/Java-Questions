package OOPS.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human rahul=new Human(29,"Rahul",1,true);
//        Human rishit=new Human(19,"Rishit",10,false);

//        System.out.println(Human.population);
        fun();

       // u cant use this because it requires an instance
        // but the function you are using it in does not depend on object
        // you cant have non-static inside static okay? LOGICAL THING
    }


    // we know that something which is not static belongs to an object(instance of a class), hence it is meaningless to use this
    // without specifying which instance of the class this method belongs to ,
   static void fun(){
        Main obj=new Main();
        obj.greeting();

   }



    void greeting(){
        fun();
        System.out.println("Hello world");
    }
}
