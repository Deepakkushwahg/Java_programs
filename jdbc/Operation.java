package jdbc;
import java.util.*;
import java.sql.*;
public class Operation extends DBConnection
{
    void insert()
    {
        try
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Student id");
            int id = sc1.nextInt();
            System.out.println("Enter Student name");
            String name = sc1.next();
            System.out.println("Enter Student age");
            int age = sc1.nextInt();
            System.out.println("Enter Student course");
            String course = sc1.next();

            String insertquery = "insert into student values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(insertquery);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setString(4, course);

            pst.executeUpdate();
            System.out.println("Data inserted");
        }
        catch(Exception e)
        {
            System.out.println("Data not inserted  "+e);
        }
    }
    void delete()
    {
        try
        {
            Scanner sc2 = new Scanner(System.in);
            //System.out.println("Enter student id whose data you want to deleted");
            //int id = sc2.nextInt();
            //String delquery = "delete from student where stdid = "+id;
            System.out.println("Enter student course whose data you want to deleted");
            String course = sc2.next();
            String delquery = "delete from student where stdcourse = '"+course+"'";
            PreparedStatement pst2 = con.prepareStatement(delquery);
            pst2.executeUpdate();
            System.out.println("Data deleted....");
        }
        catch(Exception e)
        {
            System.out.println("Can't deleted "+e);
        }
    }
    void view()
    {
        try
        {
            String viewquery = "select * from student";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(viewquery);

            System.out.println("Values of student Table");
            while(rs.next())
            {
                System.out.print("    "+rs.getInt(1));
                System.out.print("    \t"+rs.getString(2));
                System.out.print("    \t"+rs.getInt(3));
                System.out.print("    \t"+rs.getString(4));
                System.out.print("\n");
            }
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    void update()
    {
        try
        {
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Enter student course which you want to update");
            String course = sc3.next();
            System.out.println("Enter student id where you want to update the data");
            int id = sc3.nextInt();
            String updatequery = "update student set stdcourse = '"+course+"'"+"where stdid = "+id;
            PreparedStatement pst3 = con.prepareStatement(updatequery);
            pst3.executeUpdate();
            System.out.println("Data updated");
        }
        catch(Exception e)
        {
            System.out.println("Data not updated "+e);
        }
    }
    public static void main(String args[])
    {
        Operation obj = new Operation();
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for view");
            System.out.println("Press 4 for update");
            System.out.println("Press 5 for Exit");

            System.out.print("\nEnter your choice : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.view();
                    break;
                case 4:
                    obj.update();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
