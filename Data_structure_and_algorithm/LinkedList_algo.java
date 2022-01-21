package Data_structure_and_algorithm;
// insertion and deletion algo of LinkedList
import java.util.Scanner;

public class LinkedList_algo
{
    Node Head;
    static class Node
    {
        int value;
        Node next;
        Node(int d)
        {
            value = d;
            next = null;
        }
    }
    public static LinkedList_algo Insert(LinkedList_algo list,int value)
    {
        Node newnode = new Node(value);
        if(list.Head==null)
        {
            list.Head = newnode;
        }
        else
        {
            Node last = list.Head;
            while(last.next!=null)
                last = last.next;
            last.next = newnode;
        }
        return list;
    }
    public static LinkedList_algo Deleted(LinkedList_algo list, int key)
    {
        int f=0;
        Node last = list.Head;
        Node previous = list.Head;
        while(last.value != key && last.next!=null)
        {
            previous = last;
            last = last.next;
            f=1;
        }
        if(f==0 && last.next!=null)
        {
            list.Head = list.Head.next;
        }
        if(last.value==key)
        {
            previous.next = last.next;
            System.out.println(key + " is deleted from list");
        }
        else
            System.out.println(key + " is not found in list");
        return list;
    }
    public static void printList(LinkedList_algo list)
    {
        Node last = list.Head;
        while(last.next!=null)
        {
            System.out.print(last.value+" ");
            last = last.next;
        }
        System.out.println(last.value);
    }
    public static void main(String[] args) {
        LinkedList_algo list = new LinkedList_algo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
        {
            list = Insert(list,sc.nextInt());
        }
        printList(list);
        System.out.println("Enter the value which you want to deleted from list");
        int key = sc.nextInt();
        list = Deleted(list,key);
        printList(list);
    }
}
