public class print_element_using_foreach_loop 
{
    public static void main(String[] args) 
    {
        // String days[] = {"Sun","Mon","Tus","Wed","Thus","Fri","Sat"};
        // for(String var : days)
        //     System.out.println(var);
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int x = arr[0];
        for(int i : arr)
        {
            if(i>x)
                x=i;
            System.out.print(i+" ");
        }
            System.out.println("\nHighest element "+x);
    }    
}
