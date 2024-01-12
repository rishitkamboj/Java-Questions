package strivercourse.arrays;

import java.util.ArrayList;
import java.util.List;

public class spiraltraversal {
    public static void main(String[] args) {
   int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


   List<Integer> spiral=new ArrayList<>(spiralmatrix(arr));

        for (int i: spiral
             ) {
            System.out.print(i+" ");
        }
    }




// time complexity is O(m*n)
// space complexity is O(m*n)
// right -> bottom -> left -> top
 static List<Integer> spiralmatrix(int arr[][]){
        List<Integer> ans=new ArrayList<>();
         int n= arr.length;
         int m=arr[0].length;
         int left=0,right=m-1;
         int top=0,bottom=n-1;


         while(top<=bottom && left<=right) {
// right
             for (int i = left; i <= right; i++) {
                 ans.add(arr[top][i]);
             }
             top++;

             // top to bottom
             for (int i = top; i <= bottom; i++) {
                 ans.add(arr[i][right]);
             }
             right--;

             //left to bottom
             if(top<=bottom) {
                 for (int i = right; i >= left; i--) {
                     ans.add(arr[bottom][i]);
                 }
                 bottom--;
             }

             if(left<=right) {
                 for (int i = bottom; i >= top; i--) {
                     ans.add(arr[i][left]);
                 }
                 left++;
             }

         }


     return ans;
    }
}

