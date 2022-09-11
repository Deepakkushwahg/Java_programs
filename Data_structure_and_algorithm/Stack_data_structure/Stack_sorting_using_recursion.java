package Data_structure_and_algorithm.Stack_data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Stack_sorting_using_recursion
{
    Scanner sc = new Scanner(System.in);
    Stack st = new Stack();
    int n,k=1,j=0;
    Stack_sorting_using_recursion()
    {
        System.out.println("Enter the size of Stack");
        n = sc.nextInt();
        System.out.println("Enter stack Elements");
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }
        System.out.println("Stack before sorting -");
        System.out.println(st);
    }
    void stack_function()
    {
        if((int)st.elementAt(j)>(int)st.elementAt(j+1))
        {
            Object t = st.elementAt(j);
            st.set(j, st.elementAt(j+1));
            st.set(j+1, t);
        }
        if(j<n-1-k)
        {
            j++;
            stack_function();
        }
        else if(k<n-1)
        {
            k++;
            j=0;
            stack_function();
        }
        else
            System.out.println("Stack after sorting\n"+st);
    }
    public static void main(String[] args) {
        new Stack_sorting_using_recursion().stack_function();
    }
}
