package Data_structure_and_algorithm.Stack_data_structure;

import java.util.Scanner;
import java.util.Stack;

public class stack_reverse_using_recursion
{
    Scanner sc = new Scanner(System.in);
    int n,start=0,last;
    Stack st = new Stack();
    stack_reverse_using_recursion()
    {
        System.out.println("Enter size of Stack");
        n = sc.nextInt();
        last = n-1;
        System.out.println("Enter Stack object");
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println("Stack before reverse");
        System.out.println(st);
    }
    void reverse_stack()
    {
        Object t = st.get(start);
        st.set(start,st.get(last));
        st.set(last,t);
        if(start<n/2-1)
        {
            start++;
            last--;
            reverse_stack();
        }
        else
            System.out.println("Stack after reverse\n"+st);
    }
    public static void main(String[] args) {
        new stack_reverse_using_recursion().reverse_stack();
    }
}
