package Data_structure_and_algorithm;

import java.util.Scanner;

public class doubly_LinkedList_without_tail {
    static Node head;
    static class Node
    {
        int data;
        Node previous,next;
        Node(int data)
        {
            this.data = data;
            previous = null;
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
    static void deletionAtBeg() {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            head = head.next;
            if(head!=null)
                head.previous = null;
        }
    }
    static void insertAtPos(int pos,Node n) {
        if(head==null)
        {
            if(pos==1)
            {
                head = n;
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
                    n.next = head;
                    head.previous = n;
                    head = n;
                }
                else if(pos==count()+1)
                {
                    Node last = head;
                    while(last.next!=null)
                    {
                        last = last.next;
                    }
                    n.previous = last;
                    last.next = n;
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
                    n.next = last.next;
                    last.next.previous = n;
                    last.next = n;
                    n.previous = last;
                }
            }
        }
    }

    static void insertAtPos(int data, int pos) {
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

    static void PrintDoublyLinkedList() {
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
            System.out.println();
        }
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node last = head;
            while(last.next!=null)
                last = last.next;
            newNode.previous = last;
            last.next = newNode;
        }
    }

    static void insertAtBeg(int data) {
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
    static void deletionAtEnd() {
        if(head==null)
        {
            System.out.println("LinkedLIst is Empty");
        }
        else
        {
            Node last = head;
            while(last.next!=null)
                last = last.next;
            last.previous.next = null;
            last.previous = null;
        }
    }
    static String searchNode(Node n) {
        if(head==null)
            return "not present";
        Node last = head;
        while(last.data!=n.data && last.next!=null)
            last = last.next;
        if(last.data==n.data)
            return "present";
        return "not present";
    }

    static String searchData(int data) {
        if(head==null)
            return "not present";
        Node last = head;
        while(last.data!=data && last.next!=null)
            last = last.next;
        if(last.data==data)
            return "present";
        return "not present";
    }

    static void deletionByNode(Node n) {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else if(head.data==n.data)
        {
            head = head.next;
            if(head!=null)
                head.previous = null;
        }
        else
        {
            Node last = head;
            while(last.next.data!=n.data && last.next.next!=null)
            {
                last = last.next;
            }
            if(last.next.data==n.data)
            {
                if(last.next.next==null)
                {
                    last.next.previous = null;
                    last.next = null;
                }
                else
                {
                    last.next.previous = null;
                    last.next = last.next.next;
                    last.next.previous.next = null;
                    last.next.previous = last;
                }
            }
            else
            {
                System.out.println("Data is not present in LinkedList");
            }
        }
    }

    static void deletionByData(int data) {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else if(head.data==data)
        {
            head = head.next;
            if(head!=null)
                head.previous = null;
        }
        else
        {
            Node last = head;
            while(last.next.data!=data && last.next.next!=null)
            {
                last = last.next;
            }
            if(last.next.data==data)
            {
                if(last.next.next==null)
                {
                    last.next.previous = null;
                    last.next = null;
                }
                else
                {
                    last.next.previous = null;
                    last.next = last.next.next;
                    last.next.previous.next = null;
                    last.next.previous = last;
                }
            }
            else
            {
                System.out.println("Data is not present in LinkedList");
            }
        }
    }

    static void deletionAtPos(int pos) {
        if(head==null)
        {
            System.out.println("Invalid position");
        }
        else
        {
            if(pos==1)
            {
                head = head.next;
                if(head!=null)
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
                }
            }
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
        PrintDoublyLinkedList();
        System.out.println("Enter the data and position where you want to insert the data respectively");
        insertAtPos(sc.nextInt(),sc.nextInt());
        System.out.println("Enter the position and Node data where you want to insert Node");
        insertAtPos(sc.nextInt(),new Node(sc.nextInt()));
        PrintDoublyLinkedList();
        deletionAtBeg();
        deletionAtEnd();
        PrintDoublyLinkedList();
        System.out.println("Enter the position of data which you want to delete");
        deletionAtPos(sc.nextInt());
        PrintDoublyLinkedList();
        System.out.println("Enter the data which you want to delete");
        deletionByData(sc.nextInt());
        PrintDoublyLinkedList();
        System.out.println("Enter the Node data which you want to delete");
        deletionByNode(new Node(sc.nextInt()));
        PrintDoublyLinkedList();
        System.out.println("Enter the value which you want to check");
        System.out.println("Data is "+searchData(sc.nextInt())+" in LinkedList");
        System.out.println("Enter the Node data which you want to check");
        System.out.println("Node is "+searchNode(new Node(sc.nextInt()))+" in LinkedList");
    }
}
