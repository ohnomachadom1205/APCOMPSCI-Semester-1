import java.util.Scanner;

public class Lab_06ex3
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		for(int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}