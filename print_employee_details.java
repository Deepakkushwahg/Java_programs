/*  Write a program that would print the information (name, year of joining, address) of three employees by creating
    a class named 'Employee'. The output should be as follows:
    Name        Year of joining            Address
    Aman         2021                	   Chandigarh
    Sunil        2000                      Mathura
    Rohan        2010                      Agra

*/
import java.util.Scanner;
class employee
{
    Scanner scan = new Scanner(System.in);
    void emp(int n)
    {
        String name[] = new String[n];
        int year[] = new int[n];
        String address[] = new String[n];
        System.out.println("Enter the details as a name, year of joining and address");
        for(int i=0;i<n;i++)
        {  
            name[i]=scan.next();
            year[i]=scan.nextInt();
            address[i]=scan.next();
        }
        System.out.println("----------------------output-----------------------");
        System.out.println("Name\t\tYear of joining\t\tAddress");
        for(int j=0;j<n;j++)
        {
            System.out.println(name[j]+"\t\t"+year[j]+"\t\t\t"+address[j]);
        }
    }

}

public class print_employee_details extends employee
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of employees: ");
        int n = scan.nextInt();
        print_employee_details obj = new print_employee_details();
        obj.emp(n);
        
    }
    
}
