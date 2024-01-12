package OOPS.lecture7.collections.enums;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // public static and final
        // since its final you can create child enums
        // type of all of this is Week

        Week(){
            System.out.println("Constructor called for "+this);
        }
// this is not public or protected,only private or default
        // why? we dont want to create new objects
        // this is not the enum ocncepts, thats why

        // internally : public static final Week Monday=new Week();

        // all the enums extend java.lang.enum something
        // enum cant extend anything
        // it cant be super class

    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
//         for(Week day: Week.values()){
//             System.out.println(day);
//         }
    }


}
