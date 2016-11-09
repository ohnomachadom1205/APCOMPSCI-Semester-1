import java.util.Scanner;

public class Lab_07ex3
{
	public static int getReverse(int number)
	{
		
		int num = number;
		int rev = 0;
		
		while(num > 0)
		{
			rev *= 10;
			rev += num%10;
			num = (int)(num/10);
		}
		return rev;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.printf("%d reversed is %d.", number, getReverse(number));
	}
}