package OOPS.staticExample;


// outside classes cannot be static like here innerclasses cant be static
// only innerclass i.e. Test cannot be static
/* Outside class cannot be static because it itself not dependent on any other class */
public class Innerclasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
           Test a=new Test("Rishit");
           Test b=new Test("Rishit");
    }
}
