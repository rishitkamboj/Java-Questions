package oopslab;

import java.util.Scanner;

/* q4) wap in java to create a user defined exception named time exception with the following conditions
            (1) if hours value is less than 0 and greater than 24
            (2) if minutes value is less than 0 and greater than 60
            (3) if seconds value is less than 0 and greater than 60*/
public class TIME {

    void time() throws TimeException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time in hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter time in minutes");
        int minute = sc.nextInt();
        System.out.println("Enter time in seconds:");
        int seconds = sc.nextInt();
        if (hours >= 24 || hours < 0) {
            throw new TimeException("Hour is less than 0 or greater than or equal to 24");
        }
        if (minute >= 60 || minute < 0) {
            throw new TimeException("Minute is less than 0 or greater than or equal to 60");
        }
        if (seconds >= 60 || seconds < 0) {
            throw new TimeException("Seconds is less than 0 or greater than or equal to 60");
        }
    }

    public static void main(String[] args) {
        TIME t = new TIME();

         try {
             t.time();
         }
         catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
}

class TimeException extends Exception {
    TimeException(String s) {
        super(s);
    }
}
