public class static_function_example
{
    static void func()
    {
        System.out.println("Static function example");
    }
    public static void main(String[] args)
    {
        static_function_example obj = new static_function_example();
        static_function_example.func();
    }
    
}
// describe the static keyword
// 1. static function
// 2. static block
// 3. static variable