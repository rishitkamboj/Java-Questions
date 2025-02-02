package JANUARY.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    //variation 1 we just need to return the element at r and c index
    // we can just return r-1C c-1


    int rowCol(int r,int c){
        int ans=1;
        for(int i=0;i<c;i++){
            ans=ans*(r-i);
            ans=ans/(i+1);
        }
        return ans;
    }


    public List<Integer> rowfn(int row){
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        long a=1;
        for(int i=1;i<row;i++){
            a=a*(row-i);
            a=a/i;
            ans.add((int)a);
        }
        return ans;
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            list.add(rowfn(i));
        }
        return list;
    }
}
