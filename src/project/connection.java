package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connect=	DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjdbc", "root", "root");
	Statement st=	connect.createStatement();
			int row=	st.executeUpdate("Insert into Liberybooks.Librerybooks()values(4, 'Energize Your Mind', 'Gaur Gopal Das', '8688217677', true)");
			System.out.println("inserted"+row);
	return connect;
		}
public void connectionfordata () {
	
	
}


}
