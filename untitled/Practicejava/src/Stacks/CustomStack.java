package Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int top=-1;


    public CustomStack() {
       this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data=new int[size];
    }


    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack overflow");
            return false;
        }

        data[++top]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[top--];
    }

public int peek() throws StackException{
    if(isEmpty()){
        throw new StackException("Cannot peek from an empty stack");
    }
        return data[top];
}


public void display() throws StackException{
    if(isEmpty()){
        throw new StackException("Cannot display from an empty stack");
    }

    for (int i = 0; i <=top ; i++) {
        System.out.print(data[i]+" ");
    }
}



    public boolean isFull(){
        return this.top==this.data.length-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
