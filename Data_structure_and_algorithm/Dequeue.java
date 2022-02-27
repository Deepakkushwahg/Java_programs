package Data_structure_and_algorithm;

import java.util.Scanner;

public class Dequeue {
    static Node Front,Rear;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public static boolean isEmpty()
    {
        if(Front==null)
        {
            return true;
        }
        return false;
    }
    public static void enqueueByBeg(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            Front = newNode;
            Rear = newNode;
        }
        else
        {
            newNode.next = Front;
            Front = newNode;
        }
    }
    public static int dequeueByBeg()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return -1;
        }
        int value  = Front.data;
        Front = Front.next;
        return value;
    }
    public static void enqueueByEnd(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            Front = newNode;
            Rear = newNode;
        }
        else
        {
            Rear.next = newNode;
            Rear = newNode;
        }
    }
    public static int dequeueByEnd()
    {
        if (isEmpty())
        {
            System.out.println("Underflow");
            return -1;
        }
        int value = Rear.data;
        Node last = Front;
        while (last.next.next != null)
            last = last.next;
        last.next = null;
        Rear = last;
        return value;
    }
    public static void PrintDequeue()
    {
        Node last = Front;
        while(last!=null)
        {
            System.out.print(last.data+" ");
            last = last.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the value");
        for(int i=0;i<size;i++)
            enqueueByBeg(sc.nextInt());
        PrintDequeue();
        System.out.println("\nDeleted value is "+dequeueByBeg());
        PrintDequeue();
        System.out.println("\nEnter the value");
        for(int i=0;i<size;i++)
            enqueueByEnd(sc.nextInt());
        System.out.println("\n");
        PrintDequeue();
        System.out.println("\nDeleted value is "+dequeueByEnd());
        PrintDequeue();
    }
}
