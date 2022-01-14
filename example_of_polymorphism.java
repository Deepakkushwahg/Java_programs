// Example of function overloading in polymorphism
public class example_of_polymorphism 
{
    void Btech()
    {
        System.out.println("Btech from CS......");
    }
    void Btech(int x)
    {
        System.out.println("Btech from EC......");
    }
    void Btech(int a, int b)
    {
        System.out.println("Btech from mechanical.....");
    }
    public static void main(String[] args) 
    {
        example_of_polymorphism obj = new example_of_polymorphism();
        obj.Btech();
        obj.Btech(10,5);

    }

    
}
