import java.util.Scanner;

public class RectangleEx1
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void calcPerim()
	{
		perimeter = 2*(l+w);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around.",perimeter);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		l = sc.nextDouble();
		System.out.print("Enter width: ");
		w = sc.nextDouble();
		
		calcPerim();
		print();
	}
}