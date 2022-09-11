package Data_structure_and_algorithm.LinkedList_data_structure;

import java.util.Scanner;

// implementation of Deque using circular array
public class Deque
{
    static int q[],Front,Rear,maxsize;
    Deque()
    {
        Front = -1;
        Rear = -1;
        q = new int[maxsize];
    }
    public static void enqueueByRear(int data)
    {
        if(Front==-1)
        {
            Front++;
            Rear++;
            q[Rear]=data;
        }
        else if((Rear+1)%maxsize==Front)
        {
            System.out.println("Overflow");
        }
        else
        {
            Rear++;
            q[Rear]=data;
        }
    }
    public static void enqueueByFront(int data)
    {
        if(Front==-1)
        {
            Front++;
            Rear++;
            q[Front]=data;
        }
        else if(Front!=0 && Front-1!=Rear)
        {
            Front--;
            q[Front]=data;
        }
        else if(Front==0 && Rear!=maxsize-1)
        {
            Front = maxsize-1;
            q[Front]=data;
        }
        else
            System.out.println("Overflow");
    }
    public static void dequeueByFront()
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
            Front = (Front+1)%maxsize;
        }
    }
    public static void dequeueByRear()
    {
        if(Front==-1)
            System.out.println("Underflow");
        else if(Front==Rear)
        {
            Front = Rear = -1;
        }
        else if(Rear==0)
            Rear = maxsize-1;
        else
        {
            Rear--;
        }
    }
    public static void PrintDeque()
    {
        if(Front==-1)
            System.out.println("Empty Deque");
        else
        {
            int temp = Front;
            while(temp!=Rear)
            {
                System.out.print(q[temp]+" ");
                temp = (temp+1)%maxsize;
            }
            System.out.println(q[temp]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of deque: ");
        maxsize = sc.nextInt();
        new Deque();
        System.out.println("Enter the Element");
        for(int i=0;i<maxsize/2;i++)
        {
            enqueueByFront(sc.nextInt());
        }
        for(int i=0;i<maxsize/2;i++)
        {
            enqueueByRear(sc.nextInt());
        }
        for(int i=0;i<maxsize%2;i++)
        {
            enqueueByRear(sc.nextInt());
        }
        dequeueByFront();
        dequeueByRear();
        PrintDeque();
    }
}
