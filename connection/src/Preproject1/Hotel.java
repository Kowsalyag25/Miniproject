package Preproject1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class Hotel
{
void hotel1()
{
	Hotel h=new Hotel();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","Kowsy@25"); 
			Statement ss=(Statement) con.createStatement();
			System.out.println("     ");
			System.out.println("********    You are choosing Hotel menu option     *********");
			System.out.println("           Here listed the TOP Hotels,Amount and Rooms available       ");
			ResultSet rs=ss.executeQuery("select * from hotel"); 
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+"	"+rs.getString(4)+"	"+rs.getString(5));
			}
			System.out.println("*****Thank you******");
			System.out.println("     ");		
		} catch (Exception e) { 
			System.out.println(e);
		}
}
}