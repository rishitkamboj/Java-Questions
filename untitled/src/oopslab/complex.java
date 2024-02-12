package oopslab;

/*
* wap to create a class complex having data members real and imaginary.
* take default constructors(to initialise real and imaginary to 0) and take paramaterized constructors
* (to initiliaze real and imginary values).. take another parametarized constructors which recieves two complex
* objects and add and subtract these two complex numbers*/
public class complex {
    int real;
    int imaginary;

    complex(){
        this.real=0;
        this.imaginary=0;
    }
    complex(int r,int i){
        this.real=r;
        this.imaginary=i;
    }
    complex(complex a,complex b,char ch){
        if(ch=='+'){
            this.real=a.real+b.real;
            this.imaginary=a.imaginary+b.imaginary;
        }
        else{
        this.real=a.real-b.real;
        this.imaginary=a.imaginary-b.imaginary;
    }}

    public static void main(String[] args) {
        complex a =new complex(1,1);
        complex b=new complex(2,2);
        complex c=new complex(a,b,'+');
        System.out.println(c.real+"+"+c.imaginary+"i");
    }
}
