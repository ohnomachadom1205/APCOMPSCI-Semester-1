import java.util.Scanner;

public class RectangleEx5
{
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around.",perimeter);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double l = sc.nextDouble();
		System.out.print("Enter width: ");
		double w = sc.nextDouble();
		
		double perimeter = calcPerim(l,w);
		print(perimeter);
	}
}