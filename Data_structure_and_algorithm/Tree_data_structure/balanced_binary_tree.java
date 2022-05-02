package Data_structure_and_algorithm.Tree_data_structure;
// AVL Tree implementation

import java.util.Scanner;

public class balanced_binary_tree
{
    static Node root;
    static class Node
    {
        Node left,right;
        int data, height;
        Node(int data)
        {
            this.data = data;
            left = right = null;
            height = 1;
        }
    }
    static void preOrderTree(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrderTree(root.left);
        preOrderTree(root.right);
    }
    static int height(Node root)
    {
        if(root==null)
            return 0;
        return root.height;
    }
    static Node Insertion(Node root, int x)
    {
        if(root==null)
        {
            Node newNode = new Node(x);
            return newNode;
        }
        if(x<root.data)
            root.left = Insertion(root.left,x);
        else if(x> root.data)
            root.right = Insertion(root.right,x);
        else
            return root;
        root.height = 1+Math.max(height(root.left),height(root.right));

        int balance = balanceTree(root);
        if (balance > 1 && x < root.left.data)
            return rightRotate(root);

        // Right Right Case
        if (balance < -1 && x > root.right.data)
            return leftRotate(root);

        // Left Right Case
        if (balance > 1 && x > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (balance < -1 && x < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    static Node leftRotate(Node root)
    {
        Node n = root.right;
        Node temp = n.left;
        n.left = root;
        root.right = temp;
        root.height = 1+Math.max(height(root.left),height(root.right));
        n.height = 1+Math.max(height(n.left),height(n.right));
        return n;
    }

    static Node rightRotate(Node root)
    {
        Node n = root.left;
        Node temp = n.right;
        n.right = root;
        root.left = temp;
        root.height = 1+Math.max(height(root.left),height(root.right));
        n.height = 1+Math.max(height(n.left),height(n.right));
        return n;
    }

    static int balanceTree(Node root)
    {
        if(root==null)
            return 0;
        return height(root.left)-height(root.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            root = Insertion(root, sc.nextInt());
        }
        System.out.println("Preorder traversal of constructed tree is : ");
        preOrderTree(root);
    }
}
