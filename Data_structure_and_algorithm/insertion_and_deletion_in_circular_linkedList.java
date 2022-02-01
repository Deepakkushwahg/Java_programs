package Data_structure_and_algorithm;

// algo of insertion at beginning and deletion by position in LinkedList
import java.util.Scanner;

public class insertion_and_deletion_in_circular_linkedList
{
    static int f=0;
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
        }
    }
    public static void InsertionAtBeg(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            newnode.next = head;
        }
        else
        {
            Node last = head;
            while(last.next!=head)
            {
                last = last.next;
            }
            newnode.next = head;
            last.next = newnode;
            head = newnode;
        }
    }
    public static int count()
    {
        Node last = head;
        int c=1;
        while(last.next!=head)
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
            if(head.next==head && pos==1)
            {
                head = null;
            }
            else if(pos<=count())
            {
                if(pos==1)
                {
                    Node last = head;
                    while(last.next!=head)
                    {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                else
                {
                    int c=1;
                    Node last = head;
                    while(last.next!=head)
                    {
                        if(c==pos-1)
                        {
                            break;
                        }
                        else
                        {
                            last = last.next;
                            c++;
                        }
                    }
                    last.next = last.next.next;
                }
            }
            else
            {
                System.out.println("Invalid position");
                f=1;
            }
        }
    }
    public static void PrintList()
    {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node last = head;
            while(last.next!=head)
            {
                System.out.print(last.data+" ");
                last = last.next;
            }
            System.out.println(last.data);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            InsertionAtBeg(sc.nextInt());
        }
        System.out.print("Your LinkedList: ");
        PrintList();
        System.out.print("\nEnter the position to delete the data: ");
        DeletionByPos(sc.nextInt());
        if(f==0)
        {
            System.out.println("LinkedList after Deletion");
            PrintList();
        }
    }
}
