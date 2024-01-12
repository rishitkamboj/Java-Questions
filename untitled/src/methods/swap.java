package methods;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // swap numbers code
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a);
//        System.out.println(b);
        String name="RIshit Kamboj";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
   name="Rahul Rana";
    }

    static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
    }
}
