package Data_structure_and_algorithm;

import java.util.Scanner;

public class insertion_by_position_in_circular_LinkedList
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static int count()
    {
        int c=1;
        Node last = head;
        while(last.next!=head)
        {
            last = last.next;
            c++;
        }
        return c;
    }
    public static void Insertion(int data,int pos)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            if(pos==1)
            {
                head = newnode;
                newnode.next = head;
            }
            else
            {
                System.out.println("Invalid position");
            }
        }
        else
        {
            if(pos<=count()+1)
            {
                if(pos==1)
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
                else
                {
                    int c=1;
                    Node last = head;
                    while(last.next!=head)
                    {
                        if(c==pos-1)
                            break;
                        last = last.next;
                        c++;
                    }
                    newnode.next = last.next;
                    last.next = newnode;
                }
            }
            else
            {
                System.out.println("Invalid position");
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
        System.out.print("Enter the size of circular LinkedList: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            System.out.print("Enter position: ");
            int position = sc.nextInt();
            Insertion(value,position);
        }
        System.out.print("\nLinkedList: ");
        PrintList();
    }
}
