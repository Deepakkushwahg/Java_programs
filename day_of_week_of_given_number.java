import java.util.Scanner;

public class day_of_week_of_given_number
{
    int n;
    day_of_week_of_given_number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day in number of week: ");
        n = sc.nextInt();
    }
    String display()
    {
        switch(n)
        {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "No day on this number";
        }
    }
    public static void main(String[] args) {
        System.out.println(new day_of_week_of_given_number().display());
    }
}
