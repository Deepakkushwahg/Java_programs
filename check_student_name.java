import java.util.Scanner;

public class check_student_name
{
    check_student_name(String st)   // constructor
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        if(str.equalsIgnoreCase(st))
        {
            System.out.println("string is equal");
        }
        else
            System.out.println("Unknown string");

    }
    public static void main(String[] args) {
        check_student_name obj = new check_student_name("Deepak");    //creating object of class
    }
}
