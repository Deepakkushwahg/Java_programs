package Data_structure_and_algorithm.LinkedList_data_structure;

// All operation of singly LinkedList without using tail
import java.util.Scanner;

public class singly_LinkedList_without_tail {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static void insertAtBeg(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    public static void insertAtEnd(int data)
    {
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
            last.next = newNode;
        }
    }
    public static int count(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public static void insertAtPos(int data,int pos)
    {
        Node newNode = new Node(data);
        if(head==null){
            if(pos!=1){
                System.out.println("Invalid Position");
            }
            else{
                head = newNode;
            }
        }
        else{
            if(pos==1){
                newNode.next = head;
                head = newNode;
            }
            else if(pos>count()+1){
                System.out.println("Invalid Position");
            }
            else{
                Node temp = head;
                int c=1;
                while(temp.next!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }
    public static void insertAtPos(int pos,Node n)
    {
        if(head==null){
            if(pos!=1){
                System.out.println("Invalid Position");
            }
            else{
                head = n;
            }
        }
        else{
            if(pos==1){
                n.next = head;
                head = n;
            }
            else if(pos>count()+1){
                System.out.println("Invalid Position");
            }
            else{
                Node temp = head;
                int c=1;
                while(temp.next!=null){
                    if(c==pos-1){
                        break;
                    }
                    c++;
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;
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
            head = head.next;
    }
    public static void deletionAtEnd()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            Node last = head;
            while(last.next.next!=null)
            {
                last = last.next;
            }
            last.next = null;
        }
    }
    public static void deletionAtPos(int pos)
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else if(pos>count())
        {
            System.out.println("Invalid position");
        }
        else if(pos==1)
        {
            head = head.next;
        }
        else
        {
            Node last = head;
            int c=1;
            while(last!=null){
                if(c==pos-1){
                    break;
                }
                c++;
                last = last.next;
            }
            last.next = last.next.next;
        }
    }
    public static void deletionByData(int data)
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else if(head.data==data)
        {
            head = head.next;
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
                last.next = last.next.next;
            }
            else
            {
                System.out.println("Data is not present in LinkedList");
            }
        }
    }
    public static void deletionByNode(Node n)
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
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
                last.next = last.next.next;
            }
            else
            {
                System.out.println("Data is not present in LinkedList");
            }
        }
    }
    public static String searchData(int data)
    {
        if(head==null)
            return "not present";
        Node last = head;
        while(last.data!=data && last.next!=null)
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
        while(last.data!=n.data && last.next!=null)
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
            while(last!=null)
            {
                System.out.print(last.data+" ");
                last =last.next;
            }
            System.out.println();
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
