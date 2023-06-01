package classWork;
import java.sql.*;

public class MySqlConnection {
	public void connect() {
		String url = "jdbc:mysql://localhost:3306/practice";
		String uname = ""; //username
		String pass = ""; //password
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(url, uname, pass);
			System.out.println("Database Connected");
			
			Statement st = con.createStatement();
			String query = "select * from users";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3));
			}
			st.close();
			con.close();
		} catch(SQLException sqe) {
			System.out.println(sqe.getMessage());
		} catch(ClassNotFoundException cse) {
			System.out.println(cse.getMessage());
		}
	}
}
