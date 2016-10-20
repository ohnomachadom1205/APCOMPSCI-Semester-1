import java.util.Scanner;

public class Lab_05ex2
{
	public static double discount(double subtotal)
	{
		if(subtotal >= 2000)
		{
			return .15*subtotal;
		}
		else
		{
			return 0;
		}
	}
	public static void format(String word, double num)
	{
		System.out.printf("*%14s ........%10.2f\n",word,num);
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter item 1: ");
		String i1 = sc.nextLine();
		System.out.print("Enter price of item 1: ");
		double p1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 2: ");
		String i2 = sc.nextLine();
		System.out.print("Enter price of item 2: ");
		double p2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 3: ");
		String i3 = sc.nextLine();
		System.out.print("Enter price of item 3: ");
		double p3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 4: ");
		String i4 = sc.nextLine();
		System.out.print("Enter price of item 4: ");
		double p4 = sc.nextDouble();
		sc.nextLine();
		
		double subtotal = p1+p2+p3+p4;
		
		double discount = discount(subtotal);
		
		double tax = subtotal*0.07;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(i1,p1);
		format(i2,p2);
		format(i3,p3);
		format(i4,p4);
		format("Subtotal:",subtotal);
		format("Discount:",discount);
		format("Tax:",tax);
		format("Total:",total);
		System.out.println("__________________________________");
		System.out.println(" * Thanks for the support *");
	}
	
}