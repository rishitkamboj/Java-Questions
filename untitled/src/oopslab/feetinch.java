package oopslab;
 /*
 * create a class distance having data members feet and inches.
 * use constructors and functions to initialize feet and inches,
 * and convert feet to inches and inches to feet with functions  */
public class feetinch {
    float feet;
    float inches;

    feetinch(){
        this.feet=0;
        this.inches=0;
    }

    feetinch(float f ,float i){
        this.feet=f;
        this.inches=i;
    }
    feetinch(float f,char ch){
        if(ch=='f'){
            this.feet=f;
            this.inches=0;
        }
        else{
            this.feet=0;
            this.inches=f;
        }
    }

    void convertFeettoInch(){
        inches=feet*12;
        System.out.println("Feet converted to inches: "+inches);
    }
     void convertInchtoFeet(){
        feet=inches/12;
         System.out.println("Inches converted to feet: "+feet);
     }


     public static void main(String[] args) {
        feetinch f=new feetinch(1,'f');
        f.convertFeettoInch();

     }

}
