import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assert {

	public static void main(String[] args) throws SQLException {
//		int a=1;
//		int b=2;
//		 if(!(a<b)) {
//         	System.out.println("HI");
//         }
//		 
//		 String order = "6cfd7799-c741-44d5-9596-dbbffc1ca187";
//		 String norder = "Order - 6cfd7799-c741-44d5-9596-dbbffc1ca187";
//		String[] name =  norder.split("- ");
//		System.out.println(name[1]);
//		 
//		String cart_id = "";
//        String user_id = "0249b0bd-7b5e-4534-af85-c6691ba40682";
//        String[] query = {"ADDRESS_LINE1","ADDRESS_LINE1","CITY","STATE","COUNTRY","POSTAL_CODE","PHONE"};
//        String[] address = {"North Street","Panapadi","Chennai","Tamil Nadu","IN","605751","9944111111"};
//        // TODO Auto-generated method stub
//        Connection con = DriverManager.getConnection("jdbc:mysql://139.59.27.246:3306/bookstore_db", "bookstoreDBA", "PaSSworD");
//        Statement s = con.createStatement();
//        ResultSet res = s.executeQuery("SELECT * FROM bookstore_db.ADDRESS WHERE USER_ID = \"" + user_id + "\"");
//        while (res.next()) {
//            for(int i=0;i<query.length;i++) {
//            	System.out.println(query[i] + address[i]);
//                //System.out.println(res.getString(query[i] ), address[i]);
//            }
//            
//            
//        }
		 String user_id = "0249b0bd-7b5e-4534-af85-c6691ba40682";
		 String norder = "Order - f8c42f36-0bee-4470-9490-f24ae0cdb9da";
		 String order = "6cfd7799-c741-44d5-9596-dbbffc1ca187";
		String[] name =  norder.split("- ");
		Connection con = DriverManager.getConnection("jdbc:mysql://139.59.27.246:3306/bookstore_db", "bookstoreDBA", "PaSSworD");
        Statement s = con.createStatement();
        //ResultSet res = s.executeQuery("SELECT * FROM bookstore_db.ORDER_TABLE where ORDER_ID =\"" + name[1] + "\"");
        ResultSet res = s.executeQuery("SELECT * FROM bookstore_db.ORDER_TABLE where ORDER_ID =\"" + name[1] + "\"");
        //res.next();
        
        		 while (res.next()) {
        	            System.out.println( res.getString("TOTAL_ITEMS_PRICE"));
        	            System.out.println(res.getString("USER_NAME"));
        	            System.out.println(res.getString("TAX_PRICE"));
        	            System.out.println(res.getString("SHIPPING_PRICE"));
        	            System.out.println(res.getString("TOTAL_ORDER_PRICE"));
        	            System.out.println(res.getString("PAYMENT_RECEIPT_URL"));
        	        }
        	
        }

    }
		
		
		
	

