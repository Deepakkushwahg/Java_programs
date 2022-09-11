package Data_structure_and_algorithm;

import java.util.Scanner;

public class circular_LinkedList_using_tail
{
    static Node head,tail;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void insertAtBeg(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public static void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public static int count(){
        Node temp = head;
        int c=1;
        while(temp.next!=head){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static void insertAtPos(int data,int pos)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            if(pos==1)
            {
                head = newnode;
                tail = newnode;
                tail.next = head;
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
                    newnode.next = head;
                    head = newnode;
                    tail.next = head;
                }
                else if(pos==count()+1)
                {
                    tail.next = newnode;
                    tail = newnode;
                    tail.next = head;
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
    public static void insertAtPos(int pos,Node n)
    {
        if(head==null)
        {
            if(pos==1)
            {
                head = n;
                tail = n;
                tail.next = head;
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
                    n.next = head;
                    head = n;
                    tail.next = head;
                }
                else if(pos==count()+1)
                {
                    tail.next = n;
                    tail = n;
                    tail.next = head;
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
                    n.next = last.next;
                    last.next = n;
                }
            }
            else
            {
                System.out.println("Invalid position");
            }
        }
    }
    public static void deletionAtBeg()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            head = head.next;
            tail.next = head;
        }
    }
    public static void deletionAtEnd()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else if(head==tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            Node last = head;
            while(last.next.next!=head)
            {
                last = last.next;
            }
            tail = last;
            tail.next = head;
        }
    }
    public static void deletionAtPos(int pos)
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            if(head==tail && pos==1)
            {
                head = null;
                tail = null;
            }
            else if(pos==count())
            {
                Node last = head;
                while(last.next.next!=head)
                {
                    last = last.next;
                }
                tail = last;
                tail.next = head;
            }
            else if(pos<count())
            {
                if(pos==1)
                {
                    head = head.next;
                    tail.next = head;
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
            }
        }
    }
    public static void deletionByData(int data)
    {
        if(head==null)
            System.out.println("Empty LinkedList");
        else if(head==tail && head.data==data)
        {
            head = null;
            tail = null;
        }
        else if(head.data==data)
        {
            head = head.next;
            tail.next = head;
        }
        else
        {
            Node last = head;
            while(last.next.data!=data && last.next.next!=head)
            {
                last = last.next;
            }
            if(last.next==tail && tail.data==data)
            {
                tail = last;
                tail.next = head;
            }
            else if(last.next.data==data)
            {
                last.next = last.next.next;
            }
            else
                System.out.println("Data is not present in LinkedList");
        }

    }
    public static void deletionByNode(Node n)
    {
        if(head==null)
            System.out.println("Empty LinkedList");
        else if(head==tail && head.data==n.data)
        {
            head = null;
            tail = null;
        }
        else if(head.data==n.data)
        {
            head = head.next;
            tail.next = head;
        }
        else
        {
            Node last = head;
            while(last.next.data!=n.data && last.next.next!=head)
            {
                last = last.next;
            }
            if(last.next==tail && tail.data==n.data)
            {
                tail = last;
                tail.next = head;
            }
            else if(last.next.data==n.data)
            {
                last.next = last.next.next;
            }
            else
                System.out.println("Data is not present in LinkedList");
        }
    }
    public static String searchData(int data)
    {
        if(head==null)
            return "not present";
        Node last = head;
        while(last.data!=data && last.next!=head)
            last = last.next;
        if(last.data==data)
            return "present";
        return "not present";
    }
    public static String searchNode(Node n)
    {
        if(head==null)
            return "not present";
        Node last = head;
        while(last.data!=n.data && last.next!=head)
            last = last.next;
        if(last.data==n.data)
            return "present";
        return "not present";
    }
    public static void PrintLinkedList()
    {
        if(head==null)
        {
            System.out.println("Empty LinkedList");
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
        System.out.println("Enter the Elements for insert by beginning");
        for(int i=0;i<size;i++)
            insertAtBeg(sc.nextInt());
        System.out.println("Enter the Elements for insert by end");
        for(int i=0;i<size;i++)
            insertAtEnd(sc.nextInt());
        PrintLinkedList();
        System.out.println("Enter the data and position where you want to insert the data respectively");
        insertAtPos(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the position and Node data where you want to insert Node");
        insertAtPos(sc.nextInt(),new Node(sc.nextInt()));
        PrintLinkedList();
        deletionAtBeg();
        deletionAtEnd();
        PrintLinkedList();
        System.out.println("Enter the position of data which you want to delete");
        deletionAtPos(sc.nextInt());
        PrintLinkedList();
        System.out.println("Enter the data which you want to delete");
        deletionByData(sc.nextInt());
        PrintLinkedList();
        System.out.println("Enter the Node data which you want to delete");
        deletionByNode(new Node(sc.nextInt()));
        PrintLinkedList();
        System.out.println("Enter the value which you want to check");
        System.out.println("Data is "+searchData(sc.nextInt())+" in LinkedList");
        System.out.println("Enter the Node data which you want to check");
        System.out.println("Node is "+searchNode(new Node(sc.nextInt()))+" in LinkedList");
    }
}


