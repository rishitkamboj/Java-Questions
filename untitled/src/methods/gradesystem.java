package methods;

import java.util.Scanner;

public class gradesystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        System.out.println(grademachine(marks));

    }
    static String grademachine(int marks) {
     if(marks>=91 && marks<=100) { return "AA";
        }
     if(marks<=90 && marks>=81 ) {return "AB";
    }
     if(marks<=80 && marks>=71) {return "BB";}
     if(marks<=70 && marks>=61) {return "BC";}
     if(marks<=60 && marks>=51) { return "CD";}
     if (marks<=50 && marks>=41) {return "DD";}
     return "fail";
} }
