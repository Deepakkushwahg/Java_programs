package Data_structure_and_algorithm.LinkedList_data_structure;

// algo of insertion at specify position in Doubly LinkedList
import java.util.Scanner;

public class Insertion_at_specify_position_in_doubly_LinkedList
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
    public static void InsertionAtPos(int data,int pos)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            if(pos==1)
            {
                head = newnode;
            }
            else
            {
                System.out.println("Invalid position");
            }
        }
        else
        {
            if(pos>count()+1)
            {
                System.out.println("Invalid position");
            }
            else
            {
                if(pos==1)
                {
                    newnode.next = head;
                    head.previous = newnode;
                    head = newnode;
                }
                else if(pos==count()+1)
                {
                    Node last = head;
                    while(last.next!=null)
                    {
                        last = last.next;
                    }
                    newnode.previous = last;
                    last.next = newnode;
                }
                else
                {
                    int c=1;
                    Node last = head;
                    while(last.next!=null)
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
                    newnode.next = last.next;
                    last.next.previous = newnode;
                    last.next = newnode;
                    newnode.previous = last;
                }
            }
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
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter value: ");
            int data = sc.nextInt();
            System.out.print("Enter position: ");
            int position = sc.nextInt();
            InsertionAtPos(data,position);
        }
        System.out.print("LinkedList: ");
        PrintList();
    }
}
