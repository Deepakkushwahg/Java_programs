package Data_structure_and_algorithm.Tree_data_structure;

// implementation of insertion according to sorted element and searching element in tree
import java.util.Scanner;

public class searching_in_tree
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
            parentNode.right = Insertion(parentNode.right,x);
        return parentNode;
    }
    static String searching(Node currentNode,int value)
    {
        if(currentNode==null)
            return "Not found";
        if(currentNode.data==value)
            return "Found";
        if(currentNode.data>value)
        {
            return searching(currentNode.left,value);
        }
        else
        {
            return searching(currentNode.right,value);
        }
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
        System.out.print("Enter the element whose you want to search in tree: ");
        int value = sc.nextInt();
        System.out.println("Number is "+searching(root,value));
    }
}
