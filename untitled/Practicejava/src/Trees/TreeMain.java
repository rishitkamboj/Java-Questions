package Trees;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.exit;

public class TreeMain {
    public static void main(String[] args) {
        BST tree=new BST();
        int choice = 1;
        int key;
        Scanner sc=new Scanner(System.in);

        while (choice!=5) {
            System.out.print("\n1. Insert element\n2. Preorder\n3. Inorder\n4. PostOrder\n5. Exit\nEnter a choice: ");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("\nEnter a value to insert: ");
                   key=sc.nextInt();
                  tree.insert(key);
                    break;

                case 2:
                    System.out.printf("\nPreorder Traversal: ");
                    tree.preOrder();
                    break;

                case 3:
                    System.out.printf("\nInorder Traversal: ");
                    tree.inOrder();
                    break;

                case 4:
                    System.out.printf("\nPostorder Traversal: ");
                    tree.postOrder();
                    break;

                case 5:
                    System.out.printf("\nExiting program");
                    exit(0);

                default:
                    System.out.println("\nEnter a valid choice: ");
            }
        }

    }
}
