import java.util.Scanner;

public class forLooop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mahi";
		Scanner sc = new Scanner(System.in);
		//String name1 = sc.next();

		String[] namearr = {"Mahendiran","Yokesh"};
		for (int i = 0; i < namearr.length; i++) {
			System.out.println(name);
		}
		int i=0;
		while(i<namearr.length) {
			System.out.println(name);
			i++;
			
			}

		int[] arr = {101,201,301,401,501};
		for (int j = 0; j < arr.length; j++) {
			for(int k = j-1; j<i;j++) {
				
			}
			
			System.out.println(arr[j]);
			
		}
		System.out.println(arr[1]);
	}

}
