package oopslab;
 /*
 wap to create a class student having data members roll no , name , branch, university and functions get() and display()-
 to input student details and display. derive the a class marks from student class  having data members five sub marks
 and member functions find_total() and find_average().
  Now create an object of derived of class(marks) and call all the functions of student and marks class.
  */
public class student1 {
 int rollNo;
 String name;
 String branch;
 String uni;


 void get(int r,String n,String br,String un){
  this.rollNo=r;
  this.name=n;
  this.branch=br;
  this.uni=un;
 }
 void display(){
  System.out.println("Roll No: "+rollNo+" Name: "+name+" Branch: "+branch+" University: "+uni);
 }


  public static void main(String[] args) {
   marks mark=new marks(new int[]{98,97,95,99,91});
   mark.display();
   System.out.println(mark.total());
   System.out.println(mark.average());
  }
}

class marks extends student1{
 int []marks1;

  marks(int marks[]) {
   super.get(21,"Rish","Computer Science","IIT");
  this.marks1 = marks;
 }

 int total(){
   int sum=0;
   for(int i:marks1){
    sum+=i;
   }
   return sum;
 }
 double average(){
   int sum=total();

   return (double)sum/5;
 }
}
