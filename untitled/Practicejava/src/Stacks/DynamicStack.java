package Stacks;

public class DynamicStack extends CustomStack{


    @Override
    public boolean push(int item) {
      if(this.isFull()){
          //double the array size
          int[] temp=new int[data.length*2];
          // copy all the previous items

          for (int i = 0; i <data.length ; i++) {
                    temp[i]=data[i];
          }
          data=temp;
      }
      return super.push(item);
    }

    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }
}
