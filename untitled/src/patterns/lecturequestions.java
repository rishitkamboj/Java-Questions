package patterns;

public class lecturequestions {
    public static void main(String[] args) {
pattern8(5);


    }
    // pattern 2
    static void pattern2(int n) {
        for (int row = 1; row <=n ; row++) {
            //for every row, run the col
            for(int col=1;col<=row;col++) {
                System.out.print("* ");
            }
            //We need to add a new line
            System.out.println(); }
    }
    // pattern 1
    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    // pattern 3
    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for(int col=n;col>row;col--)// for(int col=1;col<=n-row+1;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    // pattern 4
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
    // pattern 5
    static void pattern5(int n) {
        for (int row = 0; row <= 2*n-1; row++) {
            int totalcol= row>n ? 2*n-row-1 : row;
            for (int col = 0; col <=totalcol ; col++) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
//pattern 6
    static void pattern6(int n) {
        for (int row = 0; row <n ; row++) {
            for (int s = 0; s <n-row-1 ; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c <=row ; c++) {
                System.out.print("*");

            }
            System.out.println();
            }


            }

            // pattern 7
    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = 0; space <row ; space++) {
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 8
    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <=n-row ; s++) {
                System.out.print(" ");

            }
            for (int c=1;c<=2*row-1;c++) {
    System.out.print("*");
} System.out.println();
        }
    }
    //pattern 9
    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <row ; s++) {
                System.out.print(" ");

            }
            for (int c=1;c<=2*n-(2*row-1);c++) {
                System.out.print("*");
            } System.out.println();
        }
    }

    //pattern 28
 static void pattern28(int n) {
     for (int row = 0; row <= 2*n-1; row++) {
         int totalcol= row>n ? 2*n-row-1 : row;
         int noofspaces=n-totalcol;
         for (int s = 0; s <=noofspaces; s++) {
             System.out.print(" ");
         }
         for (int col = 0; col <=totalcol ; col++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
// pattern 30
    static void pattern30(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int s = 1; s <=n-row ; s++) {
                System.out.print("  ");

            }
            for (int col = row; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
    // pattern 17
    static void pattern17(int n) {
        for (int row = 1; row <=2*n ; row++) {
            int c=row>n ? 2*n-row : row;
            for (int s = 1; s <=n-c ; s++) {
                System.out.print("  ");
            }
            for (int col = c; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col+" ") ;
            }

            System.out.println();
        }}
// question 31
    static void pattern31(int n) {
int original=n;
        n=2*n;

        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n ; col++) {
                int index=original==Math.min(Math.min(row,col),Math.min(n-row,n-col))?Math.min(Math.min(row,col),Math.min(n-row,n-col))-1:Math.min(Math.min(row,col),Math.min(n-row,n-col));
int atEveryIndex=original-index;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }


    }















}



