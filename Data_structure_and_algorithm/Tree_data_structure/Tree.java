package Data_structure_and_algorithm.Tree_data_structure;

import java.util.Scanner;

// algo of implementation of tree and preOrder, postOrder, inOrder, print level traversal algorithm's

public class Tree {
    static Node root;
    static int a=1;
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    static void implementing_Tree(Node newNode,int level)
    {
        if(Math.pow(2,level)-3>0)
        {
            newNode.left = new Node(++a);
            newNode.right = new Node(++a);
            level--;
            implementing_Tree(newNode.left,level);
            implementing_Tree(newNode.right,level);
        }
    }
    static int Height(Node currentNode)
    {
        if(currentNode==null)
            return 0;
        int l = Height(currentNode.left);
        int r = Height(currentNode.right);
        if(l>r)
        {
            return l+1;
        }
        else
            return r+1;
    }
    static void PrintLevel(Node currentNode,int l)
    {
        if(currentNode==null)
            return;
        if(l==1)
            System.out.print(currentNode.data+" ");
        PrintLevel(currentNode.left,l-1);
        PrintLevel(currentNode.right,l-1);
    }
    static void PrintLevelTraversal(Node currentNode)
    {
        int h = Height(currentNode);
        for(int i=1;i<=h;i++)
            PrintLevel(currentNode,i);
    }
    static void PrintTreeByInOrder(Node currentNode)
    {
        if(currentNode==null)
            return;
        PrintTreeByInOrder(currentNode.left);
        System.out.print(currentNode.data+" ");
        PrintTreeByInOrder(currentNode.right);
    }
    static void PrintTreeByPreOrder(Node currentNode)
    {
        if(currentNode==null)
            return;
        System.out.print(currentNode.data+" ");
        PrintTreeByPreOrder(currentNode.left);
        PrintTreeByPreOrder(currentNode.right);
    }
    static void PrintTreeByPostOrder(Node currentNode)
    {
        if(currentNode==null)
            return;
        PrintTreeByPostOrder(currentNode.left);
        PrintTreeByPostOrder(currentNode.right);
        System.out.print(currentNode.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the level of tree: ");
        int level = sc.nextInt();
        if(level>0)
            root = new Node(1);
        implementing_Tree(root,level);
        System.out.println("Printing by inorder");
        PrintTreeByInOrder(root);
        System.out.println("\nPrinting by height traversal");
        PrintLevelTraversal(root);
        System.out.println("\nPrinting by preorder");
        PrintTreeByPreOrder(root);
        System.out.println("\nPrinting by postorder");
        PrintTreeByPostOrder(root);
    }
}
