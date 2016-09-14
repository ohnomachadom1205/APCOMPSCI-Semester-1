import java.util.Scanner; //import Statement

public class RudeAII
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println("Wow " + name + " that name sucks," );
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next interger that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow " + num + " is old you grandpa," );
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		
		String fun = keyboard.next();
		
		System.out.println("Eww " + fun + " is boring," );
		
		//prompt for user input
		System.out.println("What kind of music do you like? ");
		
		String like = keyboard.next();
		
		System.out.println("Eww " + like + " sounds terrible and is obnoxious," );
		
		//prompt for user input
		System.out.println("How many siblings do you have? ");
		
		String have = keyboard.next();
		
		System.out.println("Dang " + have + " is too much and your parents need to calm down," );
		
		//prompt for user input
		System.out.println("What do you want to do when you grow up? ");
		
		String up = keyboard.next();
		
		System.out.println("Really " + up + " as a proffesion will never happen becuase your fat," );
		
		
	}
}