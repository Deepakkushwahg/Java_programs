import java.util.*;

public class bank_system_project
{
    bank_system_project()
    {
        System.out.println("Welcome in our bank");
    }
    public static void main(String[] args) 
    {
        bank_system_project con = new bank_system_project();
        Scanner scan = new Scanner(System.in);
        System.out.println("Which type of account you want to open\n 1. Saving account -- type 0\n 2. current account -- type 1");
        System.out.print("Enter - ");
        int acc_type = scan.nextInt();
        back_end_project bep = new back_end_project(acc_type); 
        if(acc_type == 0)
        {
            bep.saving_account();
            bep.passbook_saving_account();
        }
        else if(acc_type == 1)
        {
            bep.current_account();
            bep.passbook_current_account();
        }
        else
        {
            System.out.println("You are entering wrong key for opening account\n Please enter correct key");
        }

        
    }
    
}
