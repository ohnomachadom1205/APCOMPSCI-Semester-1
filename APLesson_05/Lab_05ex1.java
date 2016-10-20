import java.util.Random;

public class Lab_05ex1
{
	public static String rollDice(int playerRoll, int computerRoll)
	{
		if(playerRoll > computerRoll)
		{
			return "you";
		}
		if(playerRoll < computerRoll)
		{
			return "computer";
		}
		return "not availible";
	}
	public static void main(String[]args)
	{
		
		Random rand = new Random();
		
		int playerRoll = rand.nextInt(6) + 1;
		int computerRoll = rand.nextInt(6) + 1;
		
		String winner = rollDice(playerRoll,computerRoll);
		
		System.out.println("You rolled a " + playerRoll );
		System.out.println("Computer rolled a " + computerRoll );
		System.out.println("The winner is " + winner );
	}
}