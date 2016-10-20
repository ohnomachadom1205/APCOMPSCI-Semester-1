import java.util.Scanner;

public class CircleEx8
{	
	public static double calcArea(double r)
	{
		return 3.14*r*r;
	}
	public static void print(double r,double area)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,area);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		
		double area = calcArea(r);
		print(r,area);
	}
}