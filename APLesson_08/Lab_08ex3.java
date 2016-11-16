import java.util.Scanner;

public class Lab_08ex3
{
	public static int luck(int num)
	{
		if(num > 0)
		{
			if(num % 10 == 7)
			{
				return 1 + luck(num/10);
			}
			else
			{
				return 0 + luck(num/10);
			}
		}
		return 0;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(luck(n));
	}
}