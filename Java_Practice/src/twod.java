import java.util.*;

public class twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object data[][] = new Object[10][4];
        data[0][0] = "IPhone-14";
        data[0][1] = "IPhone 14 Grey Color";
        data[0][2] = "10000";
        data[0][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[0][0] + ".jpeg";

        data[1][0] = "Samsung Mobile";
        data[1][1] = "Samsung Galaxy Note 7 ";
        data[1][2] = "12000";
        data[1][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[1][0] + ".jpeg";

        data[2][0] = "Samsung Smart TV";
        data[2][1] = "Samsung Smart TV Supports Youtube, Android Apps";
        data[2][2] = "50000";
        data[2][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[2][0] + ".jpeg";

        data[3][0] = "Sony Speaker";
        data[3][1] = "Sony Speaker with Dobly Experience";
        data[3][2] = "2000";
        data[3][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[3][0] + ".jpeg";

        data[4][0] = "IWatch";
        data[4][1] = "IWatch wrist Black Color";
        data[4][2] = "25000";
        data[4][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[4][0] + ".jpeg";

        data[5][0] = "LG Refrigerator";
        data[5][1] = "LG Refrigerator with 2 Doors";
        data[5][2] = "17000";
        data[5][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[5][0] + ".jpeg";

        data[6][0] = "ISmart Glass";
        data[6][1] = "ISmart glass White Frame";
        data[6][2] = "9000";
        data[6][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[6][0] + ".jpeg";

        data[7][0] = "Mac Book Pro";
        data[7][1] = "Mac Book Pro with Metallic Black";
        data[7][2] = "120000";
        data[7][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[7][0] + ".jpeg";

        data[8][0] = "Samsung Curve LED Monitor";
        data[8][1] = "Samsung Curve LED Monitor for Gaming";
        data[8][2] = "30000";
        data[8][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[8][0] + ".jpeg";

        data[9][0] = "Apple Smart Water Bottle";
        data[9][1] = "Smart Water Bottle";
        data[9][2] = "6500";
        data[9][3] = System.getProperty("user.dir") + "//src//test//resources//images//" + data[9][0] + ".jpeg";

//            
        for (int i = 0; i < data.length; i++) { 
        	for (int j = 0; j < data[i].length; j++) {
        		System.out.println(data[i][j]);
        		//System.out.println("n");
        		if(j==0) {
        			System.out.println(j);
        		}
        		else if(j==1) {
        			System.out.println(j+" 1");
        		}
        		else if(j==2) {
        			System.out.println(j+ " 2");
        		}
        		else {
        			System.out.println(j+ " 3");
        		}
        		 
        		
        		 }}

     
                

	}	
}
