package strivercourse.arrays;

import java.util.Arrays;

public class setmatel0 {
    public static void main(String[] args) {
int arr[][]={ {1,1,1},{1,0,1},{1,1,1} };
int n=arr.length;
int m=arr[0].length;
//        int ans[][]=mat0(arr);
        matrixopt(arr,m,n);
        System.out.println("Final matrix is ");

        for (int[] row:arr) {
            for (int ele:row
                 ) {
                System.out.print(ele+" ");
            }
            System.out.println();

        }

    }




// BRUTE FORCE nearly O(n3)

    static int[][] mat0 (int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
        if(arr[i][j]==0){
           markrow(arr,i);
           markcol(arr,j);
        }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }

        }
        return arr;
    }
    static void markrow(int arr[][], int row){
        for (int j=0;j<arr[row].length;j++){
            if(arr[row][j]!=0){
                arr[row][j]=-1;
            }
        }


    }
    static void markcol(int arr[][], int col){
        for (int j=0;j<arr.length;j++){
            if(arr[j][col]!=0){
                arr[j][col]=-1;
            }
        }
    }


    // better approach
    // make a row and column array to keep a check for each row and
    // column


    static void  matrix(int arr[][],int m,int n){
int row[]=new int[n];
Arrays.fill(row,0);
int col[]=new int[m];
Arrays.fill(col,0);

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m; j++) {

                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m; j++) {

                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }







    }



    // optimal


    static void  matrixopt(int arr[][],int m,int n){
//        int row[]=new int[n];
//        Arrays.fill(row,0);
//        int col[]=new int[m]; -> matrix[0][..]

//        Arrays.fill(col,0);-> matrix[..][0]
int col0=1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m; j++) {

                if(arr[i][j]==0){
                // we will mark the ith row
                    // mark the jth row
                    arr[i][0]=0;
                    if(j!=0){
                    arr[0][j]=0;}
                    else{ col0=0;}
                }
            }
        }

        for (int i = 1; i <n ; i++) {
            for (int j = 1; j < m; j++) {

                if (arr[i][j] != 0) {
                    // check for column & row

                    if (arr[0][j] == 0 || arr[i][0] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for (int j = 0; j < m; j++) {
                arr[0][j]=0;
            }
            if(col0==0){
                for (int i = 0; i <n ; i++) {
                    arr[i][0]=0;
                }
            }
        }
    }
    }
