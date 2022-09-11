package Data_structure_and_algorithm.LinkedList_data_structure;

// algo of Insertion at End and Deletion by value in the circular LinkedList

import java.util.Scanner;

public class circular_LinkedList_algo
{
    Node head;
    static class Node
    {
        int value;
        Node next;
        Node(int data)
        {
            value = data;
        }
    }
    public static circular_LinkedList_algo InsertAtEnd(circular_LinkedList_algo list, int value)
    {
        Node NewNode = new Node(value);
        if(list.head == null)
        {
            list.head = NewNode;
            list.head.next = list.head;
        }
        else
        {
            Node last = list.head;
            while(last.next != list.head)
                last = last.next;
            last.next = NewNode;
            NewNode.next = list.head;
        }
        return list;
    }
    public static circular_LinkedList_algo DeletionByValue(circular_LinkedList_algo list, int key)
    {
        int f=0;
        Node last = list.head;
        Node previous = list.head;
        while(last.value != key && last.next!=list.head)
        {
            previous = last;
            last = last.next;
            f=1;
        }
        if(f==0 && last.next!=list.head)
        {
            while (last.next!=list.head)
                last = last.next;
            last.next = list.head.next;
            list.head = list.head.next;
            System.out.println(key + " is deleted from LinkedList");
            System.out.println("After Deletion...........");
        }
        else if(f==0 && last.value==key)
        {
            list.head=null;
            System.out.println(key + " is deleted from LinkedList");
            System.out.println("After Deletion............");
        }
        else if(last.value == key)
        {
            previous.next = last.next;
            System.out.println(key + " is deleted from LinkedList");
            System.out.println("After Deletion............");
        }
        else
            System.out.println(key + " is not found in LinkedList");
        return list;
    }
    public static void printList(circular_LinkedList_algo list)
    {
        if(list.head ==null)
        {
            System.out.println("No Node is present i.e Empty LinkedList");
        }
        else
        {
            System.out.print("LinkedList : ");
            Node last = list.head;
            while (last.next != list.head)
            {
                System.out.print(last.value + " ");
                last = last.next;
            }
            System.out.println(last.value);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circular_LinkedList_algo list = new circular_LinkedList_algo();
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of LinkedList");
        for(int i=0;i<size;i++)
            list = InsertAtEnd(list, sc.nextInt());
        printList(list);
        System.out.print("Enter the value which you want to delete: ");
        int key = sc.nextInt();
        list = DeletionByValue(list,key);
        printList(list);
    }
}
