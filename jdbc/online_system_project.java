// online shopping management system - MyShopping.com
package jdbc;

import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;

public class online_system_project
{
    Connection conn;
    static String n;
    Scanner sc = new Scanner(System.in);
    online_system_project()
    {
        try
        {
            String URL = "jdbc:mysql://localhost:3306/sectiongdb";
            conn = DriverManager.getConnection(URL,"root","root");
            System.out.println("Connection Success.");
        }
        catch(Exception e)
        {
            System.out.println("Connection failed "+e);
        }
        System.out.println("\n\n\t\t\t\t\t\tWelcome To MyShopping.com\n\n");
        System.out.println("Project By : ");
        System.out.println("\n===============================================================================================================================\n");
        System.out.println("\tName1: Harsh\t\tName2: Rishabh\t\tName3: Deepak .");
        System.out.println("\n===============================================================================================================================\n");
        System.out.println("Press Any key to continue.....");
        if(Pattern.matches("[0-9a-zA-Z/.,';@]",sc.next()))
        {
            System.out.println("\n\t\t1.> log in \n\t\t2.>Create New Account");
            System.out.println("\n\tEnter you Choice\n\t");
            int n = sc.nextInt();
            if(n == 1)
            {
                login(conn,sc);
            }
            else if(n == 2)
                Create_new_account(conn,sc);
        }
        else
        {
            System.out.println("Invalid key");
        }

    }

    static void bill(String i, int p)
    {
        int s = (p * 9) / 100;
        int t = p * 9 / 100 * 2 + p;
        System.out.println("\t\t\t\t  BILL OF SUPPLY");
        System.out.println("==============================================================================");
        System.out.println("\tITEM\t\t\t\t\t\t\t\t COST");
        System.out.println("\t"+i+"\t\t\t\t\t "+p);
        System.out.println("\n\n\n\n\nC_GST = 9%\t\t\t\t\t\t\t\t "+s);
        System.out.println("\nS_GST = 9%\t\t\t\t\t\t\t\t "+s);
        System.out.println("\n\t\t\t\t\t\t\t\t  TOTAL = "+t);
        System.out.println("\nReturn Accepted in 7 days");
        System.out.println("\nFor Any Query Contact To MyShopping.com");
    }


    static void confirmation(String item_name, int price_rs,Scanner sc)
    {
        n = sc.next();
        if (n.charAt(0) == 'Y' || n.charAt(0) == 'y')
        {
            bill(item_name, price_rs);
            System.out.println("\n\t................THANK YOU !................\n");
            System.out.println("\t................Order  Successful.........................");
        }
        else if(n.charAt(0) == 'n' || n.charAt(0) == 'N')
            System.out.println("\n\t Order Canceled.........\n\t");
        else
            System.out.println("\n\tInvalid Input............\n");
    }


    static void COD(String item_name, int price_rs,Scanner sc)
    {
        System.out.println("\n\t\tOrder Confirmation......\t\t\n");
        System.out.println("Amount :- \t"+price_rs);
        System.out.println("\n\t\tPress for confirm  Y for yes N for No [Y/N] : \n");
        confirmation(item_name,price_rs,sc);
    }


    static void UPI(String item_name, int price_rs,Scanner sc)
    {
        System.out.println("\n\tEnter UPI Id .......\n");
        String a = sc.next();
        System.out.println("\n\t\tOrder Confirmation......\t\t\n");
        System.out.println("\n\tUPI id : \t"+a+"\nAmount :- \t "+price_rs);
        System.out.println("\n\t\tPress for confirm Y for yes N for No [Y/N] : \n");
        confirmation(item_name, price_rs,sc);
    }


    static void Debit(String item_name, int price_rs,Scanner sc)
    {
        System.out.println("\n\tEnter The card No......\n");
        int card = sc.nextInt();
        System.out.println("\n\tEnter validity Date ......\n");
        String Valid =sc.next();
        System.out.println("\n\tEnter CCV..\n");
        int ccv = sc.nextInt();
        System.out.println("\n\t\tOrder Confirmation......\t\t\n");
        System.out.println("\n\tcard no.:-\t "+card+"\n\tAmount:- \t"+price_rs);
        System.out.println("\n\tPress for confirm Y for yes N for No [Y/N] : \n");
        confirmation(item_name,price_rs,sc);
    }

    static void Net_banking(String item_name, int price_rs,Scanner sc)
    {
        System.out.println("\n\tEnter Your Bank name  ....\n");
        String bank = sc.nextLine();
        System.out.println("\n\tEnter Account holder name ....\n");
        String username = sc.nextLine();
        System.out.println("\n\tEnter The Password......\n");
        String passwd = sc.next();
        System.out.println("Bank name  "+bank+"\tUsername  "+username+"\tAmount  "+price_rs);
        System.out.println("\n\t\t confirm Order .........\n\tY for yes N for No [Y/N] : \n");
        confirmation(item_name,price_rs,sc);
    }


    static void payment(String pay, int price_cost, Scanner sc)
    {
        System.out.println("\n\t1.> COD(cash on delivery)\n\t2.> UPI\n\t3.> Debit Card\n\t4.> Net Banking");
        System.out.println("\n\tEnter Your choice : \n\t");
        int n = sc.nextInt();
        if(n == 1)
            COD(pay, price_cost,sc);
        else if(n == 2)
            UPI(pay, price_cost,sc);
        else if(n == 3)
            Debit(pay, price_cost,sc);
        else if(n == 4)
            Net_banking(pay, price_cost,sc);
        else
            System.out.println("\n\t.............Invalid payment Option.............\n");
    }


    static void order(int order_no,Scanner sc)
    {
        if(order_no == 26)
            payment("Puma T-Shirt - Cost RS.2600", 2600,sc);
        else if(order_no == 20)
            payment("US polo T-Shirt - Cost RS.2000", 2000,sc);
        else if(order_no == 18)
            payment("Puma Shirt - Cost RS.1800", 1800,sc);
        else if (order_no == 32)
            payment(" Jeans - Cost RS.3200", 3200,sc);
        else if(order_no == 27)
            payment("Puma shoes - Cost RS.2700", 2700,sc);
        else if(order_no == 40)
            payment("Casio Watch - Cost RS.4000", 4000,sc);
        else if(order_no == 30)
            payment("Sunglasses - Cost RS.1800", 1800,sc);
        else if(order_no == 3)
            payment("Pen - Cost RS.30", 30,sc);
        else if(order_no == 33)
            payment("cosmetic set - Cost RS.3300", 3300,sc);
        else if (order_no == 28)
            payment("game set - Cost RS.2800", 2800,sc);
        else
            System.out.println("out of stock");
    }


    static void mens(Scanner sc)
    {
        System.out.println("press 1 : Clothes \npress 2 : Accessories \n");
        int m = sc.nextInt();
        if (m == 1)
        {
            System.out.println("press 26 : Puma T-Shirt - Cost RS.2600 \npress 20 : US polo T-Shirt - Cost RS.2000 \npress 18 : Puma Shirt - Cost RS.1800 \npress 32 : Jeans - Cost RS.3200 \n");
            int m1 = sc.nextInt();
            order(m1,sc);
        }
        else if(m == 2)
        {
            System.out.println("press 27 : Puma shoes - Cost RS.2700 \npress 40 : Casio Watch - Cost RS.4000 \npress 30 : Sunglasses - Cost RS.1800 \npress 3 : Pen - Cost RS.30 \n");
            int ma1 = sc.nextInt();
            order(ma1,sc);
        }
        else
            System.out.println("Invalid category");
    }


    static void women(Scanner sc)
    {
        System.out.println("press 1 : Clothes \npress 2 : Accessories \n");
        int w = sc.nextInt();
        if (w == 1)
        {
            System.out.println("press 26 : Puma T-Shirt - Cost RS.2600 \npress 20 : US polo T-Shirt - Cost RS.2000 \npress 18 : Puma Shirt - Cost RS.1800 \npress 32 : Jeans - Cost RS.3200 \n");
            int w1 = sc.nextInt();
            order(w1,sc);
        }
        else if(w == 2)
        {
            System.out.println("press 27 : Puma shoes - Cost RS.2700 \npress 40 : Casio Watch - Cost RS.4000 \npress 30 : Sunglasses - Cost RS.1800 \npress 33 : cosmetic set - Cost RS.3300 \n");
            int wa1 = sc.nextInt();
            order(wa1,sc);
        }
        else
            System.out.println("Invalid category");
    }

    static void child(Scanner sc)
    {
        System.out.println("press 1 : Clothes \npress 2 : Accessories \n");
        int c = sc.nextInt();
        if (c == 1)
        {
            System.out.println("press 26 : Puma T-Shirt - Cost RS.2600 \npress 20 : US polo T-Shirt - Cost RS.2000 \npress 18 : Puma Shirt - Cost RS.1800 \npress 32 : Jeans - Cost RS.3200 \n");
            int c1 = sc.nextInt();
            order(c1,sc);
        }
        else if(c == 2)
        {
            System.out.println("press 27 : Puma shoes - Cost RS.270 \npress 40 : Casio Watch - Cost RS.4000 \npress 30 : Sunglasses - Cost RS.1800 \npress 28 : game set - Cost RS.2800 \n");
            int ca1 = sc.nextInt();
            order(ca1,sc);
        }
        else
            System.out.println("Invalid category");
    }


    static void product_Category(Scanner sc)
    {
        System.out.println("\n\t\t\t\t\tOur Products category Are");
        System.out.println("press 1 : MENS CATEGORY \npress 2 : WOMEN CATEGORY \npress 3 : CHILD CATEGORY \n");
        int a = sc.nextInt();
        if(a == 1)
            mens(sc);
        else if(a == 2)
            women(sc);
        else if(a == 3)
            child(sc);
        else
            System.out.println("Invalid category");
    }


    static void login(Connection conn, Scanner sc)
    {
        try
        {
            int flag = 0;
            System.out.println("\n\tEnter your username: \n\t");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("\n\tEnter Your password:\n\t");
            String password = sc.next();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from online_system");
            while(rs.next())
            {
                if(name.equals(rs.getString(1)) && password.equals(rs.getString(2)))
                {
                    System.out.println("\n\t\t\t\t\t    Welcome ! " + name);
                    flag = 1;
                    product_Category(sc);
                }
            }
            if(flag==0)
                throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Username or password");
        }
    }


    static void Create_new_account(Connection conn,Scanner sc)
    {
        try
        {
            System.out.println("\t\t\t\t\t\tEnter Your Details");
            System.out.println("Enter User Name ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter Password");
            String password = sc.next();
            System.out.println("Enter confirm password");
            String confirm_password = sc.next();
            if(password.equals(confirm_password))
            {
                PreparedStatement pst = conn.prepareStatement("insert into online_system values(?,?);");
                pst.setString(1,name);
                pst.setString(2,password);
                pst.executeUpdate();
                System.out.println("\nYour Login Details Are");
                System.out.println("Username: "+name);
                System.out.println("Password: "+password);
                login(conn,sc);
            }
            else
                System.out.println("password and confirm password mis-match");
        }
        catch(Exception e)
        {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        online_system_project obj = new online_system_project();
    }
}