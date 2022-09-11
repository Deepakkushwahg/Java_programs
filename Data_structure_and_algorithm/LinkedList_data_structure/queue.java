package Data_structure_and_algorithm;

// implementation of queue by LinkedList
public class queue
{
    static Node Front;  //head
    static Node Rear;   //tail
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
    public static boolean isEmpty()
    {
        if(Front==null)
            return true;
        else
            return false;
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            Front = newNode;
            Rear = newNode;
        }
        else
        {
            Rear.next = newNode;
            Rear = newNode;
        }
    }
    public int dequeue()
    {
        if(isEmpty()){
            System.out.println("queue underflow");
            return -1;
        }
        else
        {
            int value = Front.data;
            Front = Front.next;
            return value;
        }
    }
    public int front()
    {
        return Front.data;
    }
    public int rear()
    {
        return Rear.data;
    }
    public static void main(String[] args) {
        queue ls = new queue();
        ls.enqueue(10);
        ls.enqueue(20);
        ls.enqueue(30);
        ls.enqueue(40);
        System.out.println(ls.front());
        System.out.println(ls.dequeue());
        ls.enqueue(50);
        System.out.println(ls.dequeue());
        System.out.println(ls.front());
        System.out.println(ls.rear());
    }
}
