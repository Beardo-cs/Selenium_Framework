import java.io.*;
import java.util.*;

public class staticProgram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
       int H =  sc.nextInt();
       int B = sc.nextInt();
       if(H <= 0){
    	   System.out.println("java.lang.Exception: Breadth and height must be positive");
    	   
       }
       else if(B<=0) {
    	   System.out.println("java.lang.Exception: Breadth and height must be positive");
    	   
       }
       else {
    	   System.out.println(H*B);
    	   
       }
    }
}