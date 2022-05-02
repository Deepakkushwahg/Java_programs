package Data_structure_and_algorithm.Tree_data_structure;

import java.util.ArrayList;
import java.util.Scanner;

public class print_boundary_of_tree
{
    static int a=1;
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
    void implementing_Tree(Node newNode,int level)
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
    static ArrayList<Integer> ls = new ArrayList<>();
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
        print_boundary_of_tree obj = new print_boundary_of_tree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the label of tree: ");
        int level = sc.nextInt();
        if(level>0)
            root = new Node(1);
        obj.implementing_Tree(root,level);
        obj.leftNodes(root);
        obj.leafNodes(root);
        if(root.right!=null)
            obj.rightNodes(root.right);
        System.out.println("All boundary elements of tree");
        System.out.println(ls);
    }
}
