import java.util.Scanner;

public class Lab_07ex2
{
	public static double averageDigits(int number)
	{
		
		int digits = 0;
		double average = 0;
		int num = number;
		
		while(num > 0)
		{
			digits += 1;
			average += num%10;
			num = (int)(num/10);
		}
		average = average/digits;
		return average;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int number = sc.nextInt();
		
		averageDigits(number);
		System.out.printf("The average of the digits in %d is %f", number, averageDigits(number));
	}
}