import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoginDemo {

	public static void main(String[] args) throws Exception
	{
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection between java application with MYSQL database
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","?Har@2022");
		//create statement object
		
		Statement st= c.createStatement();
		//taking table name dynamically
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the table name:-");
		String tname= br.readLine();
		
		
		
		
		//write and execute SQL query
		
		String query="create table "+ tname +" (user_id int(5) primary key , username varchar(20),password varchar(20) )";
		
		st.executeUpdate(query);
		System.out.println(" login table created successfully");
	
		
		//close the connection
		
		st.close();
		c.close();
		
		

	}

}
