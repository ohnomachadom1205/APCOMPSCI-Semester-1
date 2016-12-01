import java.util.Scanner;

public class Lab_09ex1
{
	public static void Reverse(String[] array)
	{
		System.out.print("In Reverse... ");
		for(int i = array.length-1; i >=0; i--)
		{
			System.out.print(array[i] + " ");
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
		
		System.out.print("In order... ");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println();
		
		Reverse(words);
	}
}