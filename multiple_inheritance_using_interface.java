interface AKTUni
{
    abstract void btech(); // declaration
}
interface LPU
{
    abstract void mtech();
    public void mba();
}
class college3 implements AKTUni,LPU
{
    public void btech()
    {
        System.out.println("btech program...1");
    }
    public void mtech()
    {
        System.out.println("mtech program....2");
    }
    public void mba()
    {
        System.out.println("mba program....3");
    }
    public static void main(String[] args) 
    {
        college3 obj = new college3();
        obj.btech();
        obj.mtech();
        obj.mba();
    }
}
