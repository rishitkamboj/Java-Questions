package oopslab.strings;

public class outputques {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder();
        a.append("The Dog is playing in the garden");
        String s="The Dog is playing in the garden";
        String []str=s.split("\\s");
        for (int i = str.length-1; i>=0 ; i--) {
            System.out.print(" "+str[i]);
        }
        System.out.println();
        String news=s.replace("Dog","cat");
        System.out.println(news.replace("garden","kitchen"));
        System.out.println(a.delete(0,4));
        System.out.println(a.delete(7,15));

    }
}
