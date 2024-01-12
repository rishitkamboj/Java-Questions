package OOPS.lecture6.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;


    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks +
                " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);

        //if diff==0 equal
        // if diff>0 this is greater
        // if diff<0 this is less
        return diff;

    }
}
