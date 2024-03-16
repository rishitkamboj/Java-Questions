package oopslab;

/*wap a program to create an user defined exception invalid age exception with the following conditions
            (1) if a person age is less than 18 then throw invalid age exception with a message youre
            not eligible for vote otherwise if a person age is greater than 18 then display youre eligible to vote  */
 class age {
  void validate(int a)throws InvalidAgeException{
        if(a<18)
            throw new InvalidAgeException("youre not eligible for vote");
        else
            System.out.println("youre eligible to vote");
}



    public static void main(String[] args) {
        age a=new age();
        try{
            a.validate(12);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
            super(s);
        }
}}

