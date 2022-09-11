package Data_structure_and_algorithm.Stack_data_structure;

public class stack_implementation_using_LinkedList {
    static Node Top;
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
    public void push(int data)
    {
        Node newnode = new Node(data);
        if(Top==null)
        {
            Top = newnode;
        }
        else
        {
            newnode.next = Top;
            Top = newnode;
        }
    }
    public static boolean isEmpty()
    {
        if(Top==null)
            return true;
        else
            return false;
    }
    public int pop() throws StackOverflowError
    {
        if(isEmpty())
        {
            throw new StackOverflowError();
        }
        int value = Top.data;
        Top = Top.next;
        return value;
    }
    public int peek()
    {
        return Top.data;
    }
    public static int count()
    {
        int c=0;
        Node currentNode = Top;
        while(currentNode!=null)
        {
            c++;
            currentNode = currentNode.next;
        }
        return c;
    }
    public int get(int index) throws IndexOutOfBoundsException {
        if(Top == null)
        {
            throw new IndexOutOfBoundsException();
        }
        else if(index>=count())
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            int c=1;
            Node currentNode = Top;
            while(currentNode.next!=null)
            {
                if(c==index)
                    break;
                c++;
                currentNode =currentNode.next;
            }
            return currentNode.data;
        }
    }
    public void set(int index, int data) throws IndexOutOfBoundsException
    {
        Node newnode = new Node(data);
        if(Top==null && index==0)
        {
            Top=newnode;
        }
        else if(Top!=null)
        {
            if(index<=count()-1)
            {
                if(index==0)
                {
                    newnode.next = Top;
                    Top=newnode;
                }
                else
                {
                    Node currentNode = Top;
                    for(int i=0;i<index;i++)
                    {
                        currentNode = currentNode.next;
                    }
                    newnode.next=currentNode.next;
                    currentNode.next = newnode;
                }
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }

        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }
    public static void main(String[] args) {
        stack_implementation_using_LinkedList st = new stack_implementation_using_LinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.isEmpty());
        System.out.println(st.pop()+" is deleted from stack");
        System.out.println("Data at Top is "+st.peek());
        System.out.println("Data at index 1 is "+st.get(1));
        st.set(1,50);
    }
}
