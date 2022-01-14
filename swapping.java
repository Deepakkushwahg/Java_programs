public class swapping
{
    public static void main(String args[]) 
    {
        int vr1,vr2,c;
        vr1 = Integer.parseInt(args[0]);
        vr2 = Integer.parseInt(args[1]);
        System.out.println("vr1 value: "+vr1);
        System.out.println("vr2 value: "+vr2);
        System.out.println("---------swapping------------\n");
        c=vr1;
        vr1=vr2;
        vr2=c;
        System.out.println("vr1 value: "+vr1);
        System.out.println("vr2 value: "+vr2);
    }
    
}
