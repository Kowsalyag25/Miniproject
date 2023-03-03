package Preproject1;

import java.nio.file.spi.FileSystemProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Transport 
{
void transport1()
{
	Transport t=new Transport();
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity","root","Kowsy@25"); 
		Statement ss=(Statement) con.createStatement();
		System.out.println("     ");
		System.out.println("********    You are choosing Transport menu option     *********");
		System.out.println("           Here Listed Transport information and how many members are travels in tha the particular transport      ");
		ResultSet rs=ss.executeQuery("select * from trans1"); 
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"	"+rs.getString(2)+"		"+rs.getString(3)+"		"+rs.getString(4)+"		"+rs.getString(5));
		}
		System.out.println("Thank You");
		System.out.println("     ");
				
	} catch (Exception e) { 
		System.out.println(e);
	}
}
}