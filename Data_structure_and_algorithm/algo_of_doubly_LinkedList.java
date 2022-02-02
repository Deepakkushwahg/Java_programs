package Data_structure_and_algorithm;

// algo of insertion at end in Doubly LinkedList
import java.util.Scanner;

public class algo_of_doubly_LinkedList
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
    public static void InsertionAtEnd(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            Node last = head;
            while(last.next!=null)
                last = last.next;
            newnode.previous = last;
            last.next = newnode;
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
            InsertionAtEnd(sc.nextInt());
        System.out.print("LinkedList: ");
        PrintList();
    }
}
