public class highest_no
{
    public static void main(String args[]) 
    {
        int vr1,vr2,vr3;
        vr1 = Integer.parseInt(args[0]);
        vr2 = Integer.parseInt(args[1]);
        vr3 = Integer.parseInt(args[2]);
        if(vr1>=vr2)
        {
            if(vr1>=vr3)
                System.out.println("Highest no. is "+vr1);
            else
                System.out.println("Highest no. is "+vr3);
        }
        else
        {
            if(vr2>=vr3)
                System.out.println("Highest no. is "+vr2);
            else
                System.out.println("Highest no. is "+vr3);
        }
    }
    
}
