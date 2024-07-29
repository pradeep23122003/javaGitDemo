package sampledb;
import java.sql.*;

public class jdbcdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String passWord = "root";
		String query = "SELECT * FROM Student";
		Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println("Connected");
		rs.next();
		System.out.println("StudentID:"+rs.getInt(1));
		System.out.println("StudentName:"+rs.getString(2));
		System.out.println("RegNo:"+rs.getInt(3));
		System.out.println("Email:"+rs.getString(4));
		System.out.println("MobNo:"+rs.getInt(5));
		System.out.println("Dept:"+rs.getString(6));
		con.close();
	}

}
