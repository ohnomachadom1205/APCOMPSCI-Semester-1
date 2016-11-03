import java.util.Scanner;

public class Lab_06ex4
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		System.out.print("Enter the size of the table: ");
		int size = sc.nextInt();
		
		System.out.printf("___i_|_i*num___\n");

		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%4d |%4d\n", i, i*num);
		}
	}
}