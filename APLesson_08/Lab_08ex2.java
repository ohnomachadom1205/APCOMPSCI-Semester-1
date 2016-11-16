import java.util.Scanner;

public class Lab_08ex2
{
	public static String theCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}
		else
		{
			return Center(" " + word + " ");
		}
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first word: ");
		String w1 = sc.next();
		System.out.print("Enter the second word: ");
		String w2 = sc.next();
		System.out.print("Enter the third word: ");
		String w3 = sc.next();
		
		System.out.println(theCenter(w1));
		System.out.println(theCenter(w2));
		System.out.println(theCenter(w3));
	}
}