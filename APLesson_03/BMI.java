import java.util.Scanner; //import Statement

public class BMI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your hieght? ");
		
		String hieght = keyboard.next();
		
		System.out.println("Great " + hieght + " is about average," );
		
		//prompt for user input
		System.out.println("What is your weight? ");
		
		String weight = keyboard.next();
		
		System.out.println("Great " + weight + " is decent," );
		
		int w = 180;
		int h = 70;
		int BmI = (703 * w) / (h * h);
		
		System.out.println("Your BMI is" + BmI);
		
		
	}
}