package Data_structure_and_algorithm.Tree_data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class built_preorder_tree
{
    static int a=1,flag=0;
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
    static void preorder(Node NewNode,int label)
    {
        if(Math.pow(2,label)-3<=0)
            flag=1;
        if(Math.pow(2,label)-3>0)
        {
            label--;
            if(flag==0)
                NewNode.left = new Node(++a);
            else
                NewNode.right = new Node(++a);
            preorder(NewNode.left,label);
            preorder(NewNode.right,label);
        }
    }
    static void PrintByPreorder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        PrintByPreorder(root.left);
        PrintByPreorder(root.right);
    }
    static ArrayList<Integer> ls = new ArrayList<Integer>();
    void leftNodes(Node node)
    {
        if(node.left!=null)
        {
            ls.add(node.data);
            leftNodes(node.left);

        }
        else if(node.right!=null)
        {
            ls.add(node.data);
            leftNodes(node.right);
        }
    }
    void leafNodes(Node node)
    {
        if(node.left==null && node.right==null)
        {
            ls.add(node.data);
            return;
        }
        else if(node!=null && node.left!=null)
        {
            leafNodes(node.left);
        }
        if(node.right!=null)
            leafNodes(node.right);
    }
    void rightNodes(Node node)
    {
        if(node.right!=null)
        {
            rightNodes(node.right);
            ls.add(node.data);
        }
        else if(node.left!=null)
        {
            ls.add(node.data);
            rightNodes(node.left);
        }
    }
    public static void main(String[] args) {
//        System.out.print("Enter the label of tree: ");
//        int label = new Scanner(System.in).nextInt();
//        root = new Node(1);
//        preorder(root,label);
//        PrintByPreorder(root);
        root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(5);
        root.left.right.right = new Node(3);
        root.left.right.right.left = new Node(7);
        root.left.right.right.right = new Node(8);
        built_preorder_tree obj = new built_preorder_tree();
        obj.leftNodes(root);
        obj.leafNodes(root);
        if(root.right!=null)
            obj.rightNodes(root.right);
        System.out.println(ls);
    }
}
