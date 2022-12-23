package QACapital.Appium9Jun2022;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String txt = "Your login Id is: ce70bca2";
		String[] newtxt = txt.split(":");
		System.out.println(newtxt[1].trim());
    }
}
