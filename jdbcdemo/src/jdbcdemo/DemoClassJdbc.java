package jdbcdemo;

import java.sql.*;

public class DemoClassJdbc 
{
	
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/npci";
		String uname = "root";
		String pass = "12345";
		String query = "select Name from student where Id = 2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("Name");
		
		System.out.println(name);
		
		st.close();
		con.close();
		
		
		
	}

}
