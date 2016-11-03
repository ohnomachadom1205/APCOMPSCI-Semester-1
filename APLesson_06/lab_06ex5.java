import java.util.Scanner;

public class lab_06ex5
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to count up to: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number to count by: ");
		int n2 = sc.nextInt();
		
		for(int i = n2; i <= n1; i+= n2)
		{
			System.out.print(i+"\t");
		}
	}
}