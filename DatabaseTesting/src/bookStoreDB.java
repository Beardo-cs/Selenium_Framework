import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bookStoreDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con= DriverManager.getConnection("jdbc:mysql://139.59.27.246:3306/bookstore_db","bookstoreDBA","PaSSworD");
		Statement s = con.createStatement();
		ResultSet res = s.executeQuery("SELECT * FROM bookstore_db.PRODUCT WHERE product_id>1");
		//res.next();
		while(res.next()) {
			
			System.out.println(res.getString("product_name").toUpperCase());
		}
		//System.out.println(res.getString("product_name"));
		

	}

}
