package Data_structure_and_algorithm;

import java.util.Scanner;

// implementation of circular queue using Array
public class circular_queue
{
    int Queue[],Front,Rear,size;
    circular_queue()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array");
        size = sc.nextInt();
        Queue = new int[size];
        Front = -1;
        Rear = -1;
    }
    public void enqueue(int data)
    {
        if(Front==-1)
        {
            Front++;
            Rear++;
            Queue[Rear]=data;
        }
        else if((Rear+1)%size==Front)
            System.out.println("Overflow");
        else
        {
            Rear = (Rear+1)%size;
            Queue[Rear]=data;
        }
    }
    public void dequeue()
    {
        if(Front==-1)
        {
            System.out.println("Underflow");
        }
        else if(Front==Rear)
        {
            Front = Rear = -1;
        }
        else
        {
            Front = (Front+1)%size;
        }
    }
    public void PrintQueue()
    {
        if(Front==-1)
            System.out.println("Empty Deque");
        else
        {
            int temp = Front;
            while(temp!=Rear)
            {
                System.out.print(Queue[temp]+" ");
                temp = (temp+1)%size;
            }
            System.out.println(Queue[temp]);
        }
    }
    public static void main(String[] args) {
        circular_queue queue = new circular_queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        for(int i=0;i< queue.size;i++)
            queue.enqueue(sc.nextInt());
        queue.dequeue();
        queue.dequeue();
        queue.PrintQueue();
    }
}
