package oopslab.strings;

import java.util.Arrays;

public class stringprac {
    public static void main(String[] args) {
        String a="Rishit";
        String b="rishit";
        System.out.println(a.equals("Rishit"));
        System.out.println(a==b);
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(" Kamboj"));
        System.out.println(a+" Kamboj");
        System.out.println(a.charAt(0));
        System.out.println(a.length());
        System.out.println(a.contains("R"));
        System.out.println(String.format("value of %4.2f",122.1));
        byte []by=a.getBytes();
        for (int i = 0; i < by.length; i++) {
            System.out.print( by[i]+" ");
        }
        System.out.println();
        System.out.println(a.indexOf("R"));

        String c=a.intern();
        System.out.println(c);
        System.out.println(a.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(String.join(",","rishit","ritesh","ayush"));
        System.out.println(a.replace("t",""));
        String [] sp=("My name is Rishit").split("\\s");
        for(String i:sp){
            System.out.println(i);
        }
        System.out.println(a.substring(1));
        System.out.println(a.substring(0,3));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println("      abc".trim());
        System.out.println(String.valueOf(12));
          int arr[]=new int[2];
          arr[0]=1;
          arr[1]=2;
        System.out.println(Arrays.toString(arr));



    }
}
