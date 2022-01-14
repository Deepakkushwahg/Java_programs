package Array;// public class array
// {
//     public static void main(String args[])
//     {
//         int ar[] = {11,13,15,16,25,7,55,89,23};
//         System.out.println("------------array elements ---------------");
//         int s=0;
//         for(int i=0;i<ar.length;i++)
//         {
//             System.out.println(ar[i]);
//             s = s+ar[i];
//         }
//         System.out.println("sum of elements : "+s);
//         System.out.println("No. of elements : "+ar.length);   
//     }
    
// }

class cmddemo
{
    public static void main(String args[]) 
    {
        int s = 0;
        for(String i : args)
        {
            System.out.println(i);
            s=s+Integer.parseInt(i);
        }
        System.out.println("Sum of all numbers is "+s);
    }
}