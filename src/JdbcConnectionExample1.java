import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionExample1 {
/*Follow this four steps to connect JDBC (i can use database (SQL) statement in java)
 * 1.create connection
 *2.create statement
 *3.Execute statement
 *4.Close connection
 * */
	public static void main(String[] args) throws SQLException {
		//step 1
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","pdbadmin","alam1234");
		//step 2.
		Statement st=con.createStatement();
		//step 3.
		String s="insert into customer values(102,'Bibek','Roy')";
		//String s="update tablename set uname='some'where userid=101";
		//String s="delete tablename where userid=101";
		st.executeQuery(s);
		
		//step 4
		con.close();
		
		System.out.println("program is over");

  }
}
