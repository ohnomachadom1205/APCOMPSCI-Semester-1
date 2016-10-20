import java.util.Scanner;

public class CubeEx7
{
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with sides of length %f is %.5f",side,sa);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter side length: ");
		double side = sc.nextDouble();
		
		double sa = calcSurf(side);
		print(side,sa);
	}
}