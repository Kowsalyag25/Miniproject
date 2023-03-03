package Preproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class News {
	void news1()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","Kowsy@25"); 
			Statement ss=(Statement) con.createStatement();
			System.out.println("     ");
			System.out.println("********    You are choosing News menu option     *********");
			System.out.println("          The current news for all topics      ");
			ResultSet rs=ss.executeQuery("select * from newss"); 
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"	"+rs.getString(2)+"					"+rs.getString(3));
			}
			System.out.println("Thank You");
			System.out.println("     ");
					
		} catch (Exception e) { 
			System.out.println(e);
		}
	}
}

