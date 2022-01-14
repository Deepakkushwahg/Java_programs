interface AKTUniversity2
{
    abstract void btech();
    static void func()
    {
        System.out.println("static function is working in interface....");
    }
}
class college4 implements AKTUniversity2
{
    public void btech()
    {
        System.out.println("btech progarm...");
    }
    public static void main(String[] args) {
        college4 obj = new college4();
        obj.btech();
        AKTUniversity2.func();
    }
}