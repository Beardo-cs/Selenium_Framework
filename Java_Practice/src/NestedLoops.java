
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =1;
		for(int i=0; i <4; i++ ) {
			//1 literation of inner and then It will execute 4 inner inside it
//			System.out.println("Outer Loop Started");
			for(int j=1;j<=4-i;j++) {
//				System.out.println("Inner Loop");
				System.out.print(k +"\t");
				k++;
			}
			System.out.println(" ");
//			System.out.println("Outer Loop Ended");

			
		}

	}

}
