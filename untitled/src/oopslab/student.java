package oopslab;

import java.util.Scanner;
public class student {
    int roll;
    String name,university;
    double fees;
    int []marks=new int[3];

    void input(int r,String n,String uni,double f,int []arr){
        roll=r;
        name=n;
        university=uni;
        fees=f;
//        for(int i=0;i<marks.length;i++){
//            marks[i]=arr[i];
//        }
//
        marks=arr;
    }
    void display(){
        System.out.printf("Name= "+name+" Roll no= "+roll+" University= "+university+" Fees= "+fees);
        System.out.println("Marks: ");
        for(int i:marks){
            System.out.print(i+" ");
        }

    }
    void average(){
        double avg=0;
        for(int i:marks){
            avg+=i;
        }
        avg/=3;
        System.out.printf("Average %.2f ",avg);
    }

    public static void main(String[] args) {

        student s1=new student();
        s1.input(12,"Rishit","Uni",1200,new int[]{99,98,98});
        s1.display();
        s1.average();


    }
}
