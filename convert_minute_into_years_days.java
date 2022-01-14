import java.util.Scanner;
public class convert_minute_into_years_days 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the minutes : ");
        int minutes = sc.nextInt();
        int year = minutes/525600;
        int days = minutes%525600/1440;
        System.out.println(year+" Years "+days+" Days");        

    }
}
