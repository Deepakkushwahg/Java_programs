package Array;

public class sum_of_values_of_an_array
{
    public static void main(String args[]) 
    {
        int s=0,i=0,size;
        size = args.length;
        while(i<size)
        {
            System.out.println(args[i]);
            s = s+Integer.parseInt(args[i]);
            i++;
        }
        System.out.println("Total : "+s);
    }
    
}
