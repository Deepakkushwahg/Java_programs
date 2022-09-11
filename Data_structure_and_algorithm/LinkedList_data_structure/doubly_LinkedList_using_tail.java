package Data_structure_and_algorithm.LinkedList_data_structure;

import java.util.Scanner;

public class doubly_LinkedList_using_tail {
    static Node head,tail;
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
        Node last = tail;
        while(last.previous!=null)
        {
            last = last.previous;
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
            else
                tail = null;
        }
    }
    static void insertAtPos(int pos, Node n) {
        if(head==null)
        {
            if(pos==1)
            {
                head = n;
                tail = n;
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
                    tail.next = n;
                    n.previous = tail;
                    tail = n;
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
        Node newNode = new Node(data);
        if(head==null)
        {
            if(pos==1)
            {
                head = newNode;
                tail = newNode;
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
                    newNode.next = head;
                    head.previous = newNode;
                    head = newNode;
                }
                else if(pos==count()+1)
                {
                    tail.next = newNode;
                    newNode.previous = tail;
                    tail = newNode;
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
                    newNode.next = last.next;
                    last.next.previous = newNode;
                    last.next = newNode;
                    newNode.previous = last;
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
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    static void insertAtBeg(int data) {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            tail = newnode;
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
            tail = tail.previous;
            tail.next.previous = null;
            tail.next = null;
        }
    }
    static String searchNode(Node n) {
        if(head==null)
            return "not present";
        Node last = tail;
        while(last.data!=n.data && last.previous!=null)
            last = last.previous;
        if(last.data==n.data)
            return "present";
        return "not present";
    }

    static String searchData(int data) {
        if(head==null)
            return "not present";
        Node last = tail;
        while(last.data!=data && last.previous!=null)
            last = last.previous;
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
            else
                tail = null;
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
                    tail = last;
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
            else
                tail = null;
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
                    tail = last;
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
        if(tail==null)
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
                else
                    tail = null;
            }
            else
            {
                if(pos==count())
                {
                    tail = tail.previous;
                    tail.next.previous = null;
                    tail.next = null;
                }
                else if(pos<count())
                {
                    int c=1;
                    Node last = tail;
                    while(last.previous!=null)
                    {
                        if(c==pos-1)
                            break;
                        else
                        {
                            last = last.previous;
                            c++;
                        }
                    }
                    last.next.previous = null;
                    last.next = last.next.next;
                    last.next.previous.next = null;
                    last.next.previous = last;
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
