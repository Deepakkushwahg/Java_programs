package Data_structure_and_algorithm.Tree_data_structure;

import java.util.Scanner;

public class minimum_value_of_bst
{
    static Node root;
    static class Node
    {
        Node left,right;
        int data;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    static Node Insertion(Node root,int x)
    {
        if(root==null)
            return new Node(x);
        if(root.data>x)
        {
            root.left = Insertion(root.left,x);
        }
        else if(root.data<x)
        {
            root.right = Insertion(root.right,x);
        }
        return root;
    }
    static int minValueOfBST(Node root)
    {
        if(root==null)
            return -1;
        if(root.left==null)
            return root.data;
        return minValueOfBST(root.left);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            root = Insertion(root,sc.nextInt());
        }
        System.out.println("Minimum value in Tree is "+minValueOfBST(root));
    }
}
