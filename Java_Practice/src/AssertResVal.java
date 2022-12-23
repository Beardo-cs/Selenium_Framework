import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AssertResVal {
	public static Statement connectdb() throws SQLException {
		Connection con=DriverManager.getConnection(  
		        "jdbc:mysql://139.59.27.246:3306/bookstore_db","bookstoreDBA","PaSSworD");  
        Statement s = con.createStatement();
		return s;
	}
	public static void main(String[] args) throws SQLException {
		String user_id = "0249b0bd-7b5e-4534-af85-c6691ba40682";
		Statement s = connectdb();
        ResultSet res = s.executeQuery("SELECT * FROM bookstore_db.REVIEW WHERE user_id=\"" + user_id + "\"");
        while (res.next()) {
            System.out.println( res.getString("review_message"));
        }
	
}}
