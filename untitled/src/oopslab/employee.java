package oopslab;
/*WAP IN JAVA TO CREATE A CLASS EMPLOYEE HAVING DATA MEMBERS EMPID, EMPNAME AND BASIC SALARY AND COMPANY NAME AND MEMBER FUNCTIONS VOID GET
VOID DISPLAY
VOID GETgROSSsALARY(){
    DA=30%*BASIC SALARY
    HRA=10%*BASIC SALARY
    TA=#%*BASIC SALARY
    GROSS SALARY=DA+HRA+TA
*/

public class employee {
    int empID;
    String EmpName;
    double Salary;
    String compName;



    void input(int id,String name,double sal,String c){
        empID=id;
        EmpName=name;
        Salary=sal;
        compName=c;
    }
    void display(){
        System.out.println("Name: "+EmpName+" ID: "+empID+" Salary: "+Salary+" Company Name: "+compName);
    }
    void getGrossSalary(){
        double grossSal;
        double DA=30*Salary/100;
        double HRA=10*Salary/100;
        double TA=3*Salary/100;
        grossSal=DA+HRA+TA+Salary;
        System.out.println("Gross Salary is: "+grossSal);
    }

    public static void main(String[] args) {
        employee e1=new employee();
        e1.input(1,"Rish",12500,"Google");
        e1.display();
        e1.getGrossSalary();
    }


}
