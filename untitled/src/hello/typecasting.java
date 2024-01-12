package hello;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
 float celcius=input.nextFloat();
 float fahrenheit= (float)(celcius*1.8+32);
        System.out.println("Given temperature "+celcius+"C"+" in Fahrenheit is "+fahrenheit+"F");


    }
}