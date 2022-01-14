package Array;

import java.util.Scanner;

public class even_odd_array
{
    int n;
    even_odd_array(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n= obj.nextInt();
    }
    void display(){
        if(n%2==0){
            System.out.println(n+" is even number");
        }
        else {
            System.out.println(n+" is odd number");
        }
    }
    public static void main(String args[]) 
    {
        even_odd_array obj=new even_odd_array();
        obj.display();
    }
    
}
