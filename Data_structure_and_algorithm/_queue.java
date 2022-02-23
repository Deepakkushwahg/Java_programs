package Data_structure_and_algorithm;

import java.util.Scanner;

// implementation of queue by array
public class _queue
{
    int Front,Rear,maxsize;
    int q[];
    _queue(int maxSize)
    {
        Front = 0;
        Rear = 0;
        this.maxsize = maxSize;
        q = new int[maxSize];
    }
    boolean isEmpty()
    {
        return Front==0;
    }
    boolean isFull()
    {
        return Rear==maxsize;
    }
    void enqueue(int data)
    {
        if(Rear==maxsize)
            System.out.println("queue Overflow");
        else
        {
            q[Rear] = data;
            Rear++;
        }
    }
    int dequeue()
    {
        if(Front==Rear)
        {
            System.out.println("queue underflow");
            return -1;
        }
        int x = q[Front];
        for(int i=0;i<Rear;i++)
            q[i]=q[i+1];
        Rear--;
        return x;
    }
    int front()
    {
        return q[Front];
    }
    int rear()
    {
        return q[Rear-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of queue: ");
        _queue ls = new _queue(sc.nextInt());
        ls.enqueue(10);
        ls.enqueue(20);
        ls.enqueue(30);
        ls.enqueue(40);
        System.out.println(ls.dequeue());
        System.out.println(ls.front());
        System.out.println(ls.rear());
        System.out.println(ls.dequeue());
    }
}
