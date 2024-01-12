package maths;

import java.util.Arrays;

public class flippingimagegooglew {
    public static void main(String[] args) {


        int[][] ans = {{1, 1, 0}, {1, 0, 1}, {0, 1, 1}};
        for (int i = 0; i < ans.length;i++){
            for (int j=0;j<(ans[i].length+1)/2;j++) {
                int temp=ans[i][j]^1;
                ans[i][j]=ans[ans.length-1-i][j];
                ans[ans.length-1-i][j]=temp;
            }
                    for (int row=0;row<ans.length;row++)
        {
            System.out.println(Arrays.toString(ans[row]));;
        }
            }
        }
    }
