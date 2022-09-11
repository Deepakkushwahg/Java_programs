package Data_structure_and_algorithm.LinkedList_data_structure;

// algo of insertion at specify position in LinkedList
import java.util.Scanner;

public class insertion_at_specify_position_in_LinkedList {
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static insertion_at_specify_position_in_LinkedList Insertion(insertion_at_specify_position_in_LinkedList list,int data,int pos)
    {
        Node newnode = new Node(data);
        if(list.head==null && pos==1)
        {
            list.head=newnode;
        }
        else if(list.head!=null)
        {
            int p=1;
            Node last = list.head;
            while(last.next!=null)
            {
                last = last.next;
                p++;
            }
            if(pos<=p+1)
            {
                last = list.head;
                if(pos==1)
                {
                    list.head=newnode;
                    list.head.next=last;
                }
                else
                {
                    for(int i=0;i<pos-2;i++)
                    {
                        last = last.next;
                    }
                    if(last.next==null)
                    {
                        last.next=newnode;
                    }
                    else
                    {
                        newnode.next=last.next;
                        last.next = newnode;
                    }
                }
            }
            else
            {
                System.out.println("Invalid position");
                return list;
            }

        }
        else
        {
            System.out.println("Invalid position");
            return list;
        }
        return list;
    }
    public static void PrintList(insertion_at_specify_position_in_LinkedList list)
    {
        if(list.head == null)
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
        insertion_at_specify_position_in_LinkedList list = new insertion_at_specify_position_in_LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of LinkedList: ");
        int size = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            System.out.print("Enter position: ");
            int position = sc.nextInt();
            list = Insertion(list,value,position);
        }
        System.out.print("\nLinkedList: ");
        PrintList(list);
    }
}
