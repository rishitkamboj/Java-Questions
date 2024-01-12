package OOPS.lecture6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Rishit=new Student(24,99.1f);
        Student Rohan=new Student(21,95.1f);
        Student arpit=new Student(1,98f);
        Student karan=new Student(210,73f);
        Student sachin=new Student(281,90.1f);

        Student[] list={Rishit,Rohan,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));



//
//if(Rishit.compareTo(Rohan)>0){
//    System.out.println("Rishit has more marks");
//}


    }
}
