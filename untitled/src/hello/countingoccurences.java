package hello;

import java.util.Scanner;

public class countingoccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check the occurence of 3: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 1) {
            if (n % 10 == 3) {
                count++;
            }
            n = (int) n / 10;
        }
        System.out.println(count);
    } }
