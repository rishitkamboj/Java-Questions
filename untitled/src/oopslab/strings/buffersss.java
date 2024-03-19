package oopslab.strings;

public class buffersss {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        a.append("Rishit");
        a.append(" Kamboj");
        System.out.println(a);
        System.out.println(a.replace(4,6," "));
        System.out.println(a.delete(4,6));
        System.out.println(a.reverse());
        System.out.println(a.capacity());
        a.ensureCapacity(23);
        System.out.println(a.charAt(1));
        System.out.println(a.length());
        System.out.println(a.substring(2));
   //     System.out.println(a.insert());
a.reverse();
        System.out.println(a.insert(4,"it "));



    }
}
