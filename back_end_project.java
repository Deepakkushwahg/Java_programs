import java.util.*;
public class back_end_project 
{
    Scanner scan = new Scanner(System.in);
    String your_name = "";
    String mother_name = "";
    String father_name = "";
    long phone_number = 0;
    long aadhar_number = 0;
    int acc_type = 0;

    back_end_project(int a)
    {
        acc_type = a;
    }
    public void saving_account()
    {
        System.out.print("Enter your name for saving account: ");
        your_name = scan.nextLine();
        System.out.print("Enter father name: ");
        father_name = scan.nextLine();
        System.out.print("Enter mother name: ");
        mother_name = scan.nextLine();
        System.out.print("Enter your mobile number: ");
        phone_number = scan.nextLong();
        System.out.print("Enter your Aadhar card number: ");
        aadhar_number = scan.nextLong();
    }
    public void passbook_saving_account()
    {
        System.out.println("\n\n-----------------------------------Bank pass book---------------------------------------------\n");
        System.out.println("\nYour saving account has been opened with");
        System.out.println("Account number: 2435478390126708");
        System.out.println("IFSC code: 243646402657");
        System.out.println("Account holder: "+your_name);
        System.out.println("Phone number: "+phone_number);
    }
    public void current_account()
    {
        System.out.print("Enter your name for current account: ");
        your_name = scan.nextLine();
        System.out.print("Enter father name: ");
        father_name = scan.nextLine();
        System.out.print("Enter mother name: ");
        mother_name = scan.nextLine();
        System.out.print("Enter your mobile number: ");
        phone_number = scan.nextLong();
        System.out.print("Enter your Aadhar card number: ");
        aadhar_number = scan.nextLong();
    }
    public void passbook_current_account()
    {
        System.out.println("\n\n-----------------------------------Bank pass book---------------------------------------------\n");
        System.out.println("\nYour current account has been opened with");
        System.out.println("Account number: 2860548192706082");
        System.out.println("IFSC code: 532690147602");
        System.out.println("Account holder: "+your_name);
        System.out.println("Phone number: "+phone_number);
    }

}
