package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database
{
	static Connection cn;
	static Connection connect() 
	{
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani","root","root");

}
		catch(Exception e) 
		{
			e.printStackTrace();
}	return cn;

}
}
