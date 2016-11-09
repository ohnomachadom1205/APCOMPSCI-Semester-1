import java.util.Scanner;

public class Lab_07ex4
{
	public static String replace(String sentence)
	{
		while(sentence.indexOf("a") != -1)
		{
			int x = sentence.indexOf("a");
			sentence = sentence.substring(0,x) + "@" + sentence.substring(x+1);
		}
		return sentence;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any sentence: ");
		String sentence = sc.nextLine();
		
		System.out.print(replace(sentence)+"\n");
	}
}