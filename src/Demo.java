import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","100480abc");
			Statement stmt= c.createStatement();
			ResultSet Res=stmt.executeQuery("select * from login2");
			while(Res.next()) {
				System.out.println(Res.getString("username")+","+Res.getString("email")+","+Res.getString("phone_no")+","+Res.getString("password"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
 