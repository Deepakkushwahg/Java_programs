package Data_structure_and_algorithm;

import java.util.Scanner;

public class check_palindrome_number_using_stack
{
    static int n;
    check_palindrome_number_using_stack(Stack st)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(char i : String.valueOf(n).toCharArray())
        {
            st.push(i);
        }
    }
    static class Stack
    {
        static class Node
        {
            char data;
            Node next;
            Node(char data)
            {
                this.data = data;
                next = null;
            }
        }
        Node Top;
        Stack()
        {
            Top = null;
        }
        public void push(char data)
        {
            Node newNode = new Node(data);
            if(Top==null)
            {
                Top = newNode;
            }
            else
            {
                newNode.next = Top;
                Top = newNode;
            }
        }
        public char pop()
        {
            if(Top==null)
            {
                System.out.println("Stack Underflow");
                return '\0';
            }
            else
            {
                char x = Top.data;
                Top = Top.next;
                return x;
            }
        }
        public int size()
        {
            Node temp = Top;
            int c=0;
            while(temp!=null)
            {
                c++;
                temp = temp.next;
            }
            return c;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        new check_palindrome_number_using_stack(st);
        int size = st.size();
        String nr = "";
        for(int i=0;i<size;i++)
        {
            nr+=st.pop();
        }
        if(Integer.parseInt(nr)==n)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");

    }
}
