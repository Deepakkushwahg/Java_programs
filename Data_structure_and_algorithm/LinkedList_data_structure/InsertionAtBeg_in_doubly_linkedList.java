package Data_structure_and_algorithm;

// algo of insertion at beginning in Doubly LinkedList
import java.util.Scanner;

public class InsertionAtBeg_in_doubly_linkedList
{
    static Node head;
    static class Node
    {
        Node previous,next;
        int data;
        Node(int data)
        {
            previous = null;
            this.data = data;
            next = null;
        }
    }
    public static void InsertionAtBeg(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            newnode.next = head;
            head.previous = newnode;
            head = newnode;
        }
    }
    public static void PrintList()
    {
        if(head==null)
        {
            System.out.println("Empty LinkedList");
        }
        else
        {
            Node last = head;
            while (last!= null)
            {
                System.out.print(last.data + " ");
                last = last.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Doubly LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
            InsertionAtBeg(sc.nextInt());
        System.out.print("LinkedList: ");
        PrintList();
    }
}
