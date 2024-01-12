package methods;

public class greeting {
    public static void main(String[] args) {
//      String message=greet();
//        System.out.println(message);
        String personalisedmessage= myGreet("Rishit Kamboj");
        System.out.println(personalisedmessage);
    }

    private static String myGreet(String name) {
        String message="Hello " + name;
        return message;
    }

    static String greet() {
        String greeting="how are you? ";
        return greeting;
    }
}
