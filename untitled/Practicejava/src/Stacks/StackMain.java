package Stacks;

public class StackMain  {
    public static void main(String[] args) throws Exception {
//CustomStack stack=new CustomStack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//
//        stack.display();
        StackusingLL stack=new StackusingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.printf("\n%d",stack.pop());
        System.out.println();
        stack.display();

    }
}
