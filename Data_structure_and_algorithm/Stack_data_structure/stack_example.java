package Data_structure_and_algorithm;

/* Java program to implement basic stack
operations */
class Stack1 {
    static final int MAX = 3;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {

        return (top < 0);
    }
    boolean isFull()
    {
        return top==MAX-1;
    }
    Stack1()
    {

        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ a[i]);
        }
    }
}
public class stack_example
{
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40); //Overflow
        System.out.println(s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println(s.isFull());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
