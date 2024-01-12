package Trees;

import java.util.Scanner;

import static java.lang.System.exit;

public class BTMain {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();

        int choice = 1;
        int key;
        Scanner sc=new Scanner(System.in);

        while (choice!=3) {
            System.out.print("\n1.Insert element\n2.Inorder\n3.Exit\nEnter a choice: ");
            choice=sc.nextInt();

            switch (choice) {
                case 1:

                    tree.insert();
                    break;

                case 2:
                    System.out.printf("\nInorder Traversal: ");
                    tree.inOrder();
                    break;

                case 3:
                    exit(0);
                    break;


                default:
                    System.out.println("\nEnter a valid choice: ");
            }
        }

    }
    }

