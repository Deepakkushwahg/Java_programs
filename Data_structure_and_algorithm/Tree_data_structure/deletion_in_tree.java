package Data_structure_and_algorithm.Tree_data_structure;

// implementation of insertion according to sorted element and deletion of element from that tree
import java.util.Scanner;

public class deletion_in_tree
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
    static Node Insertion(Node parentNode,int x)
    {
        if(parentNode==null)
        {
            Node newNode = new Node(x);
            return newNode;
        }
        if(parentNode.data>x)
            parentNode.left = Insertion(parentNode.left,x);
        else
        {
            parentNode.right = Insertion(parentNode.right,x);
        }
        return parentNode;
    }
    static int Min(Node root)
    {
        if(root.left==null)
            return root.data;
        return Min(root.left);
    }
    static Node deletion(Node currentNode,int x)
    {
        if(currentNode==null)
            return null;
        if(x<currentNode.data)
            currentNode.left = deletion(currentNode.left,x);
        else if(x>currentNode.data)
            currentNode.right = deletion(currentNode.right,x);
        else
        {
            if(currentNode.left==null)
                return currentNode.right;
            else if(currentNode.right==null)
                return currentNode.left;
            else
            {
                currentNode.data = Min(currentNode.right);
                currentNode.right = deletion(currentNode.right,currentNode.data);
            }
        }
        return currentNode;
    }
    static void PrintInOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        PrintInOrder(root.left);
        System.out.print(root.data+" ");
        PrintInOrder(root.right);
    }
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            root = Insertion(root,sc.nextInt());
        }
        System.out.print("Enter the element which you want to delete from tree: ");
        int value = sc.nextInt();
        root = deletion(root,value);
        PrintInOrder(root);
    }
}
