package Data_structure_and_algorithm.LinkedList_data_structure;

import java.util.Scanner;

// Insertion in the singly LinkedList by many method
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next=null;
    }
}
public class insertions_in_LinkedList
{
    Node head;
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public int count(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void insertAtBeg(int x){
        Node n = new Node(x);
        n.next = head;
        head = n;
    }
    public void insertAtPos(int pos, int x){
        Node n = new Node(x);
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
                while(temp!=null){
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
    public void insertAtEnd(int x){
        Node n = new Node(x);
        Node temp = head;
        if(head==null){
            head=n;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public static void starting_function(insertions_in_LinkedList obj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements which you want to insert by end method");
        int size_for_end = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size_for_end;i++)
        {
            obj.insertAtEnd(sc.nextInt());    // function calling for insertion at end of the LinkedList
        }
        System.out.print("LinkedList: ");
        obj.print();
        System.out.println("\nEnter the number of elements which you want to insert by beginning method");
        int size_for_beginning = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size_for_beginning;i++)
        {
            obj.insertAtBeg(sc.nextInt());      // function calling for insertion at Beginning of the LinkedList
        }
        System.out.print("LinkedList: ");
        obj.print();
        System.out.print("\nEnter the position where you want to insert the element: ");
        int position = sc.nextInt();
        System.out.print("Enter the element: ");
        obj.insertAtPos(position,sc.nextInt());    // function calling for insertion at specify position in the LinkedList
        System.out.print("Final LinkedList: ");
        obj.print();
    }
    public static void main(String[] args) {
        insertions_in_LinkedList obj = new insertions_in_LinkedList();
        starting_function(obj);

    }
}