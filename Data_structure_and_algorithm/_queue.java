package Data_structure_and_algorithm;

import java.util.Scanner;

// implementation of queue by array
public class _queue
{
    static int Front,Rear,maxsize;
    static int q[];
    _queue()
    {
        Front = -1;
        Rear = -1;
        q = new int[maxsize];
    }
    boolean isEmpty()
    {
        return Front==-1;
    }
    boolean isFull()
    {
        return Rear==maxsize-1;
    }
    void enqueue(int data)
    {
        if(isFull())
            System.out.println("queue Overflow");
        else if(isEmpty())
        {
            Front++;
            Rear++;
            q[Rear] = data;
        }
        else
        {
            Rear++;
            q[Rear] = data;
        }
    }
    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("queue underflow");
            return -1;
        }
        int x = q[Front];
        if(Front==Rear)
        {
            Front = -1;
            Rear = -1;
            return x;
        }
        Front++;
        return x;
    }
    int front()
    {
        return q[Front];
    }
    int rear()
    {
        return q[Rear];
    }
    public static void PrintQueue()
    {
        for(int i=Front;i<=Rear;i++)
            System.out.print(q[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        maxsize = sc.nextInt();
        _queue ls = new _queue();
        System.out.println("Enter the Elements");
        for (int i=0;i<maxsize;i++)
            ls.enqueue(sc.nextInt());
        System.out.println(ls.dequeue());
        System.out.println(ls.front());
        System.out.println(ls.rear());
        System.out.println(ls.dequeue());
        PrintQueue();
    }
}
