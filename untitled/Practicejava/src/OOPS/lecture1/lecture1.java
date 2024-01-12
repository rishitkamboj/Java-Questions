package OOPS.lecture1;

import java.util.ArrayList;

public class lecture1 {
    public static void main(String[] args) {
        Student rish=new Student(24,"Rishit Kamboj",99.00f);

        System.out.println(rish.rno);
        ArrayList<String> str=new ArrayList<>();
              str.add("Hi");
              str.add("Test");
        for (String i:str
             ) {
            System.out.println(i);
        }




    }


    // data type for students
    static class Student{
        int rno;
        String name;
        float marks;

        Student(int roll, String n,float mark){
             this.rno=roll;
             this.name=n;
             this.marks=mark;
        }
    }
}
