import java.util.Scanner;

public class Lab_09ex2
{
	public static void first(String[] array)
	{
		System.out.print("First letter of each word inputted: ");
		for(String word : array)
		{
			System.out.print(word.charAt(0) + " ");
		}
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String[] words = new String[5];
		
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = sc.next();
		}
		
		first(words);
	}
}