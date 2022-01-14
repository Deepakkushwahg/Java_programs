package jdbc;
import java.sql.*;
public class DBConnection
{
    Connection con;
    DBConnection()
    {
        try
        {
            String URL = "jdbc:mysql://localhost:3306/sectiongdb";
            con = DriverManager.getConnection(URL,"root","root");
            System.out.println("Connection Success.");
        }
        catch(Exception e)
        {
            System.out.println("Connection failed "+e);
        }
    }
    public static void main(String args[])
    {
        DBConnection obj = new DBConnection();
    }

}
