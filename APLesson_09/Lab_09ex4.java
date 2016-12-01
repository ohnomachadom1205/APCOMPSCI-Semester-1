import java.util.Scanner;

public class Lab_09ex4
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your starting number: ");
		int start = sc.nextInt();
		System.out.print("Please enter your sequence size: ");
		int size = sc.nextInt();
		
		int[] seq = new int[size-start];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0 || i ==1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " ");
		}
	}
}