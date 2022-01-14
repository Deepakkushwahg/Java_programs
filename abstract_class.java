abstract class AKTU
{
    void Btech()
    {
        System.out.println("btech by AKTU");
    }
    
}
class college extends AKTU
{
    void diploma()
    {
        System.out.println("Self course");
    }
    public static void main(String[] args) {
        college obj = new college();
        obj.Btech();
        obj.diploma();       
    }
}
