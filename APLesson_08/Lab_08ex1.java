import java.util.Scanner;

public class Lab_08ex1
{
	public static String replace(String sentence)
	{
		int x = sentence.indexOf(" ");
		if(x == -1)
		{
			return sentence;
		}
		else
		{
			return replace(sentence.substring(0,x)+"_" + sentence.substring(x+1));
		}
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		System.out.println(replace(sentence));
	}
}