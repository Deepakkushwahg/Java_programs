import java.util.Scanner;
public class withdraw_money_from_atm_with_multiple_of_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double bank_balance, amount, withdrawal_amount;
        System.out.print("Enter the amount for withdraw: ");
        withdrawal_amount = sc.nextInt();
        System.out.print("Enter your bank balance: ");
        bank_balance = sc.nextFloat();
        if(withdrawal_amount % 5 == 0 && withdrawal_amount<bank_balance)
        {
            amount = bank_balance-(withdrawal_amount+0.50);
            System.out.println("bank balance after withdraw : "+ amount);
        }
        else if(withdrawal_amount<bank_balance)
        {
            System.out.println("Incorrect withdrawal amount (not multiple of 5)");
            System.out.println("bank balance : "+ bank_balance);
        }
        else
        {
            System.out.println("Insufficient Funds");
            System.out.println("bank balance : "+ bank_balance);
        }       
    }
}
