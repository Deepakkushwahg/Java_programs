// Type of the constructor :
// there are three type of the constructor:-
// 1. Non parameterise
// 2. parameterise
// 3. Default

// Non parameterise:- it cannot contain arguments of itself that is call non parameterise constructor.
//>  Non parameterised constructor 
// syntax :
//    class_name()
//	 {}


// parametersise :- it can contains no. of argument of any data type such as parameterise function that is called parameterise constructor.
// syntax :-
//	class_name(int a, String b)
//  {}


// Default :- it is used for creating an new instant(object) with the help of <new> keyword.
// Syntax:-
// class_name object_name = new <class_name();>    //in <> it is Default constructor not full line.
//	{}
// note:- constructor overloading can be possible same as function overloading.
// Example of constructor overloading:-

// class GLA
// {
// 	GLA()
// 	{
// 		System.out.println("Non parameter constructor.....");
// 	}
// 	GLA(int a)
// 	{
// 		System.out.println("Parameter constructor...");
// 	}
// 	public static void main(String[] args) {
// 		GLA con1 = new GLA();
// 		GLA con2 = new GLA(5);
// 	}
// }


// constructor inheritance (constructor chaining) :-
// 1. constructor can not be inherited but derived class constructor responsiblities to call the base class constructor.
// 2. when a derived class constructor calls the base class constructor then first output will be produce of the base class constructor.
// Example Non parameterised constructor inheritance :-

// class Deepak
// {
// 	Deepak()
// 	{
// 		System.out.println("Deepak .... non para constructor..... base");
// 	}
// }
// class GLA extends Deepak
// {
// 	GLA()
// 	{
// 		System.out.println("GLA ..... non para constructor.... derived");
// 	}
// 	public static void main(String[] args) {
// 		GLA con = new GLA();
// 	}
// }


// parameterised inheritance constructor:-

// class Deepak
// {
// 	Deepak()
// 	{
// 		System.out.println("Deepak .... non para constructor..... base");
// 	}
// 	Deepak(int a)
// 	{
// 		System.out.println("Deepak .... para constructor..... base");
// 	}
// }
// class GLA extends Deepak
// {
// 	GLA()
// 	{
// 		System.out.println("GLA .....non para constructor.... derived");
// 	}
// 	GLA(int a)
// 	{
// 		System.out.println("GLA .... para constructor..... derived");
// 	}
// 	public static void main(String[] args) {
// 		GLA con = new GLA(5);
// 	}
// }

// Derived class parameterised constructor does not call the base class parameterised constructor therefore java provide <super()> method for calling the base class parameterised constructor.


// super() method :- super() method statement must be first statement in the derived class parameterised constructor.
// Example of parameterised constructor inheritance using super() method
// class Deepak
// {
// 	Deepak()
// 	{
// 		System.out.println("Deepak .... non para constructor..... base");
// 	}
// 	Deepak(int a)
// 	{
// 		System.out.println("Deepak .... para constructor..... base");
// 	}
// }
// class GLA extends Deepak
// {
// 	GLA()
// 	{
// 		System.out.println("GLA .....non para constructor.... derived");
// 	}
// 	GLA(int z)
// 	{
// 		super(z);
// 		System.out.println("GLA .... para constructor..... derived");
// 	}
// 	public static void main(String[] args) {
// 		GLA con = new GLA(5);
// 	}
// }



// Abstract class / interface:-
// 1. An abstract class is a those class which cannot create an object of itself.
// 2. An abstract class is create with using <abstract> keyword.
// 3. An abstract class can contain any type of method such as public, private abstract etc.
// Example of the abstract class:-

// abstract class AKTUniversity
// {
//     void Btech()
//     {
//         System.out.println("btech by AKTU");
//     }
    
// }
// class college extends AKTUniversity
// {
//     void diploma()
//     {
//         System.out.println("Self course");
//     }
//     public static void main(String[] args) {
//         college obj = new college();
//         obj.diploma();
//         obj.Btech();       
//     }
// }

// 1. An abstract method is a those method which doesn't have a body of itself.
// 2. An abstract method is created with the help of its keyword.
// 3. An abstract method declare only in abstarct class.
// 4. An abstract method defination (override) will be define in the drived class.
// Example of the abstract class with abstract method:-

// abstract class AKTUniversity
// {
//     void Btech()
//     {
//         System.out.println("btech by AKTU");
//     }
//     abstract void manager(); //declaration
    
// }
// class college extends AKTUniversity
// {
//     // overide
//     void manager() //defination
//     {
//         System.out.println("AKTU manager");
//     }
//     void diploma()
//     {
//         System.out.println("Self course");
//     }
//     public static void main(String[] args) {
//         college obj = new college();
//         obj.diploma();
//         obj.Btech();       
//         obj.manager();
//     }
// }

// 1. An abstract class can contains more than one abstract method.
// 2. when a class extends an abstract class than there is mandatory to provide the defination (override) of all abstract method of the abstract class.
// 3. All abstract method of the abstract class must be override in the derived class.

// abstract class AKTUniversity
// {
//     void Btech()
//     {
//         System.out.println("btech by AKTU");
//     }
//     abstract void manager(); //declaration
//     abstract void manager2();
    
// }
// class college extends AKTUniversity
// {
//     // overide
//     void manager() //defination
//     {
//         System.out.println("AKTU manager");
//     }
//     void diploma()
//     {
//         System.out.println("Self course");
//     }
//     public static void main(String[] args) {
//         college obj = new college();
//         obj.diploma();
//         obj.Btech();       
//         obj.manager();
//         obj.manager2();
//     }
// }


// interface :-
// 1. java does not support multiple inheritance therefore java provides a concepts of an interface for implementing multiple inheritancing.
// 2. An interface same as an abstract class which cannot create an object of itself.
// 3. An interface is create with using (interface) keyword.
// 4. An interface contains only public and abstract method along with static method
// Static function has been implemented in java from jdk7.
// 5. An interface provides only declaration of method even public method also. except the static method


// 6. A class inherite an interface with using implements keyword.
// 7. when a class inherite and interface when there is mandantory to provide the defination of all methods (Excepts the static method ) of an interface.
//          or
// All methods (except the static method ) of an interface must be override in the derived class.


// Example multiple inheritance using interface:-
// interface AKTUniversity
// {
//     abstract void btech(); // declaration
// }
// interface LPU
// {
//     abstract void mtech();
//     public void mba();
// }
// class college2 implements AKTUniversity,LPU
// {
//     public void btech()
//     {
//         System.out.println("btech program...");
//     }
//     public void mtech()
//     {
//         System.out.println("mtech program....");
//     }
//     public void mba()
//     {
//         System.out.println("mba program....");
//     }
//     public static void main(String[] args) 
//     {
//         college2 obj = new college2();
//         obj.btech();
//         obj.mtech();
//         obj.mba();
//     }
// }

// Example of static function in interface:-
// interface AKTUniversity
// {
//     abstract void btech();
//     static void func()
//     {
//         System.out.println("static function is working in interface....");
//     }
// }
// class college2 implements AKTUniversity
// {
//     public void btech()
//     {
//         System.out.println("btech progarm...");
//     }
//     public static void main(String[] args) {
//         college2 obj = new college2();
//         obj.btech();
//         AKTUniversity.func();
//     }
// }





// examle final 
// class Deepak
// {
//     final void clang()
//     {
//         System.out.println("btech..");
//     }

// }
// class rishabh extends Deepak
// {   
//     void clang(int a)
//     {
//         System.out.println("clang...");
//     }
//     public static void main(String[] args) {
//         rishabh obj = new rishabh();
//         obj.clang();
//     }
// }


// class Test
// {   
// 	static int num1;   // static variable 
// 	static public void m1() //  static  method
// {
// 	System.out.println("In static method "+num1);
// }
// 	public static void main(String args[])
// 	{
// 		num1 = 20;  // accessing static variable 
// 		m1();  // accessing static method
// 	}
// } // end 