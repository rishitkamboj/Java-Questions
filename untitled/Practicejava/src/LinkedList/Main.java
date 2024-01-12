package LinkedList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        LL list=new LL();

        LL first=new LL();
        LL second=new LL();
        LL merged=new LL();

//        list.InsertLast(6);
//        list.InsertLast(6);
//        list.InsertLast(7);
//list.InsertLast(7);
//
//
//list.InsertLast(8);

//list.InsertLast(9);
//list.InsertLast(9);
//list.InsertLast(10);
//list.InsertLast(10);
//
//
//       list.display();
//
//
//        System.out.println();
//       list.duplicate();
//        list.display();

        int choice=1;
        Scanner sc=new Scanner(System.in);
  
        while(choice!=7){
            System.out.println("Enter a choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter a value");
                  first.create(sc.nextInt(),first);
                }
                case 2 ->{
                    System.out.print("Enter a value");
                    second.create(sc.nextInt(),second);

                }
                case 3 -> merged=LL.merge(first,second);
                case 4-> list.dis1(first);
                case 5-> list.dis1(second);
                case 6-> list.dis1(merged);


            }
        }



//        System.out.println(list.Deletepos(3));






    }
}
