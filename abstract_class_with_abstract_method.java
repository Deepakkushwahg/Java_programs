abstract class AKTU1
{
    void Btech()
    {
        System.out.println("btech by AKTU");
    }
    abstract void manager(); //declaration
    
}
class college1 extends AKTU1
{
    // overide
    void manager() //defination
    {
        System.out.println("AKTU manager");
    }
    void diploma()
    {
        System.out.println("Self course");
    }
    public static void main(String[] args) {
        college1 obj = new college1();
        obj.diploma();
        obj.Btech();       
        obj.manager();
    }
}
