import java.util.Scanner;

public class Lab_07ex1
{
	public static int sumofDigits(int number)
	{
		
		int sum = 0;
		int num = number;
		
		while(num > 0)
		{
			sum += num%10;
			num = (int)(num/10);
		}
		return sum;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int number = sc.nextInt();
		
		System.out.printf("The sum of the digits in %d is %d.", number, sumofDigits(number));
	}
}