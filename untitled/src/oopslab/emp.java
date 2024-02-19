package oopslab;

/*
create a class employee having data members empId,empName and functions get() and derived classes part_time
and full_time

part_time -- data members= no of hours,salary,calSalary(),display()           (5*1000= 5000)

full_time -- data members= no of houtd,salary,calsalary(),display()            (9*1000=9000)

 */
public class emp {
    int empId;
    String empName;

    emp(){}

    emp(int emp,String name){
        this.empId=emp;
        this.empName=name;
    }

    public static void main(String[] args) {
        partTime e1=new partTime(12,"Pri",5,250);
        e1.display();
        System.out.println("Total sal= "+e1.calSalary());
        fullTime e2=new fullTime(2,"Yansh",9,250);
        e2.display();
        System.out.println("Total sal= "+e2.calSalary());
    }
}
class partTime extends emp{
    int noofHours;
    double salary;

    partTime(int emp,String empn,int h,double sal){
        super(emp,empn);
        this.noofHours=h;
        this.salary=sal;

    }

    double calSalary(){

        return noofHours*salary;
    }
    void display(){
        System.out.println("Emp Id: "+empId+" Name: "+empName+" No. of hours: "+noofHours+" Salary per hour: "+salary);
    }
}

class fullTime extends emp{
    int noofHours;
    double salary;

    fullTime(int emp,String empn,int h,double sal){
        super(emp,empn);
        this.noofHours=h;
        this.salary=sal;

    }

    double calSalary(){

        return noofHours*salary;
    }
    void display(){
        System.out.println("Emp Id: "+empId+" Name: "+empName+" No. of hours: "+noofHours+" Salary per hour: "+salary);
    }
}



