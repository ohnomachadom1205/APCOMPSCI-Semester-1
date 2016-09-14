import java.util.Scanner; //import Statement

public class ex_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your age ? ");
		
		String age = keyboard.next();
		
		System.out.println("Cool " + age + " is about average," );
		
		//prompt for user input
		System.out.println("How many year of college did you do ? ");
		
		String year = keyboard.next();
		
		System.out.println("Nice, " + year + " is plenty," );
		
		int a = 16;
		int b = 8;
		int incoome = a * a * a * b * b;
		
	    System.out.println("Your average income is" + incoome);
	}
}