package Data_structure_and_algorithm;

// algo of insertion at end and deletion by position in Doubly LinkedList
import java.util.Scanner;

public class algo_of_doubly_LinkedList
{
    static int f=0;
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
    public static int count()
    {
        int c=1;
        Node last = head;
        while(last.next!=null)
        {
            last = last.next;
            c++;
        }
        return c;
    }
    public static void DeletionByPos(int pos)
    {
        if(head==null)
        {
            System.out.println("Invalid position");
            f=1;
        }
        else
        {
            if(pos==1)
            {
                head = head.next;
                if(head.next!=null)
                    head.previous = null;
            }
            else
            {
                if(pos==count())
                {
                    Node last = head;
                    while(last.next.next!=null)
                        last = last.next;
                    last.next.previous = null;
                    last.next = null;
                }
                else if(pos<count())
                {
                    int c=1;
                    Node last = head;
                    while(last.next!=null)
                    {
                        if(c==pos-1)
                            break;
                        else
                        {
                            last = last.next;
                            c++;
                        }
                    }
                    last.next.next.previous = last;
                    last.next = last.next.next;
                }
                else
                {
                    System.out.println("Invalid position");
                    f=1;
                }
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
        System.out.print("Enter the position to delete the data from Doubly LinkedList: ");
        DeletionByPos(sc.nextInt());
        if(f==0)
        {
            System.out.print("LinkedList after deletion: ");
            PrintList();
        }
    }
}
