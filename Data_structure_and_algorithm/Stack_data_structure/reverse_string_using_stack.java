package Data_structure_and_algorithm;

// Reverse a string using stack by implementing stack class

import java.util.Scanner;

public class reverse_string_using_stack
{
    static String str;
    reverse_string_using_stack(Stack st)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        for(char i : str.toCharArray())
        {
            st.push(i);
        }
        str = str.substring(0,0);
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
        private Node Top;
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
        new reverse_string_using_stack(st);
        System.out.println("String after reverse");
        int size = st.size();
        for(int i=0;i<size;i++)
        {
            str = str+st.pop();
        }
        System.out.println(str);
    }
}
