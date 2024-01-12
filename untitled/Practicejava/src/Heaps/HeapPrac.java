package Heaps;

import java.util.ArrayList;

public class HeapPrac {
    private ArrayList<Integer> list=new ArrayList<>();



    public int parent(int index){
        return (index-1)/2;
    }

    public int left(int index){
        return (2*index+1);
    }

    public int right(int index){
        return (2*index+2);
    }












    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        if(list.get(index)<list.get(parent(index))){
            swap(index,parent(index));
            upheap(parent(index));
        }
    }


    public int delete(){
        if(list.isEmpty()){
            return -1;
        }
        int temp=list.get(0);
        int last=list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);

        if(left<list.size() && list.get(min)>list.get(left)){
            min=left;
        }
        if(right<list.size() && list.get(min)>list.get(right)){
            min=right;
        }

        if(min!=index){
            swap(min,index);
            downheap(min);
        }
    }











    public void swap(int a,int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
}
