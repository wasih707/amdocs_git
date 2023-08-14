package doctor;
import java.sql.*;

public class Demo {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doct_apn", "root", "pass@word1");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from doctors");
		while(rs.next())
		{
			System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		}
		st.close();
		con.close();		}
	

}
