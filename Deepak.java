
class first
{
    void func1()
    {
        System.out.println("first class");
    }
}
class second extends first
{
    void func2()
    {
        System.out.println("second class");
    }
}
class third extends second
{
    void func3()
    {
        System.out.println("third class");
    }
}
class Deepak123 extends third
{
    void func()
    {
        System.out.println("Deepak123 class");
    }
    public static void main(String[] args) 
    {
        Deepak123 obj = new Deepak123();
        obj.func();
        obj.func1();
        obj.func2();
        obj.func3();

    }    
}
