package Data_structure_and_algorithm;

import java.util.Scanner;

// Algo of insertion in singly LinkedList at beginning
public class LinkedList_algo_of_insertion_in_beginning {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next = null;
        }
    }
    public static LinkedList_algo_of_insertion_in_beginning Insertion(LinkedList_algo_of_insertion_in_beginning list,int data)
    {
        Node newnode = new Node(data);
        if(list.head==null)
            list.head=newnode;
        else
        {
            Node last = list.head;
            list.head=newnode;
            list.head.next=last;
        }
        return list;
    }
    public static void PrintList(LinkedList_algo_of_insertion_in_beginning list)
    {
        if(list.head==null)
        {
            System.out.println("LinkedList is empty");
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                System.out.print(last.data+" ");
                last = last.next;
            }
            System.out.println(last.data);
        }
    }
    public static void main(String[] args) {
        LinkedList_algo_of_insertion_in_beginning list = new LinkedList_algo_of_insertion_in_beginning();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            list = Insertion(list,sc.nextInt());
        }
        System.out.print("LinkedList: ");
        PrintList(list);
    }
}
