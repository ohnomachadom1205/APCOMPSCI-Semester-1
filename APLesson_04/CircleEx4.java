import java.util.Scanner;

public class CircleEx4
{
	static double r;
	static double area;
	
	public static void calcArea()
	{
		area = 3.14*r*r;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,area);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		r = sc.nextDouble();
		
		calcArea();
		print();
	}
}