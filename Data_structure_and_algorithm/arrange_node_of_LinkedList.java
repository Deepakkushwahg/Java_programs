package Data_structure_and_algorithm;

// arrange the even number one side and odd number another side of LinkedList
import java.util.Scanner;

public class arrange_node_of_LinkedList
{
    static Node head,tail;
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
    static void Insertion(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newNode;

        }
        else
        {
            tail.next = newNode;
            tail = tail.next;
        }
    }
    static void ArrangingNodes()
    {
        Node evenHead = null,evenTail = null,temp = head,oddHead = null,oddTail = null;
        while(temp!=null)
        {
            Node n = new Node(temp.data);
            if(temp.data%2==0)
            {
                if(evenHead==null)
                {
                    evenHead = evenTail = n;
                }
                else
                {
                    evenTail.next = n;
                    evenTail = evenTail.next;
                }
            }
            else
            {
                if(oddHead==null)
                {
                    oddHead = oddTail = n;
                }
                else
                {
                    oddTail.next = n;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
        }
        if(oddHead==null)
            head = evenHead;
        else
        {
            oddTail.next = evenHead;
            head = oddHead;
        }
    }
    static void PrintLinkedList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            Insertion(sc.nextInt());
        }
        if(head!=null && head.next!=null)
            ArrangingNodes();
        System.out.println("LinkedList after arranging the Nodes");
        PrintLinkedList();
    }
}