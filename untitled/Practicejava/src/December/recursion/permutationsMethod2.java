
package December.recursion;
import java.util.*;
public class permutationsMethod2 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        permutations(0,3,arr,ans);
        System.out.println(ans);
     }


    public static void permutations(int ind,int n,int arr[],List<List<Integer>> ans){
        if(ind==n){
            List<Integer> a=new ArrayList<>();
            for(int i:arr){
                a.add(i);
            }
            ans.add(a);
            return;
        }
        for(int i=ind;i<n;i++){
            swap(ind,i,arr);
            permutations(ind+1,n,arr,ans);
            swap(ind,i,arr);
        }
    }


    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
