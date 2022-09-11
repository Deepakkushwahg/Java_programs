package Data_structure_and_algorithm.LinkedList_data_structure;

// arrange the node of odd positions in one side and even position in another side
import java.util.Scanner;

public class arrange_node_position
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
        int counter=0;
        while(temp!=null)
        {
            Node n = new Node(temp.data);
            if(counter%2==0)
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
            else
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
            temp = temp.next;
            counter++;
        }
        oddTail.next = evenHead;
        head = oddHead;
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
        if(head.next!=null && head!=null && head.next.next!=null)
            ArrangingNodes();
        System.out.println("LinkedList after arranging the Nodes");
        PrintLinkedList();
    }
}
