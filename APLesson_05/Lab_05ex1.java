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
		//creates Random object named rand
		Random rand = new Random();
		//sets the roll for the player and computer
		int playerRoll = rand.nextInt(6) + 1;
		int computerRoll = rand.nextInt(6) + 1;
		//runs the rollDice method
		String winner = rollDice(playerRoll,computerRoll);
		//prints the rolls and the winner
		System.out.println("You rolled a " + playerRoll );
		System.out.println("Computer rolled a " + computerRoll );
		System.out.println("The winner is " + winner );
	}
}