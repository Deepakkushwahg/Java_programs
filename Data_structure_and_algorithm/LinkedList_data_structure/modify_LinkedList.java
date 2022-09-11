//Given a LinkedList, you have to perform a following task:
// i) Extract the alternative Nodes starting from the second node.
// ii) Reverse the Extracted List.
// iii) Append the extracted List at the end of original List.

package Data_structure_and_algorithm;
import java.util.Scanner;
import java.util.Stack;

public class modify_LinkedList
{
    static Stack<Integer> st = new Stack<>();
    static Node head,tail;
    static int index=0;
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
    static void InsertionByEnd(int data)
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
    static void Traversing()
    {
        Node temp = head;
        if(head==null)
            return;
        while(temp!=null)
        {
            index++;
            if(index%2==0)
            {
                st.push(temp.data);
            }
            temp = temp.next;
        }
        while(!st.isEmpty())
        {
            tail.next = new Node(st.pop());
            tail = tail.next;
        }
    }
    static void PrintLinkedList()
    {
        if(head==null)
        {
            System.out.println("Empty LinkedList");
        }
        else
        {
            System.out.println("Modify LinkedList");
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
        System.out.print("Enter size of linkedList: ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            InsertionByEnd(sc.nextInt());
        }
        Traversing();
        PrintLinkedList();
    }
}
