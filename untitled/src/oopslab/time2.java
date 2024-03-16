package oopslab;

import java.util.Scanner;

public class time2 {
    public static void main(String[] args) {
        time2 a=new time2();
        try{
            a.time();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    void time() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter time in minutes");
        int minute = sc.nextInt();
        System.out.println("Enter time in seconds:");
        int seconds = sc.nextInt();
        if (hours >= 24 || hours < 0) {
            throw new HourException("Hour is less than 0 or greater than or equal to 24");
        }
        if (minute >= 60 || minute < 0) {
            throw new MinuteException("Minute is less than 0 or greater than or equal to 60");
        }
        if (seconds >= 60 || seconds < 0) {
            throw new SecondException("Seconds is less than 0 or greater than or equal to 60");
        }
    }
}



class HourException extends Exception {
    HourException(String s) {
        super(s);}
    }

class MinuteException extends Exception {
   MinuteException(String s) {
        super(s);
    }}

class SecondException extends Exception {
    SecondException(String s) {
        super(s);
    }}



