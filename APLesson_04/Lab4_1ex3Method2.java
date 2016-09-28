import java.util.Scanner;

public class Lab4_1ex3Method2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Lab4_1ex3Method2 interest = new Lab4_1ex3Method2();
		
		System.out.println("What is your interest rate?");
		double rate = keyboard.nextDouble();
		
		System.out.println("How much is the original amount you want to borrow?");
		int principal = keyboard.nextInt();
		
		System.out.println("How many times would the loan compound every year?");
		int number = keyboard.nextInt();
		
		System.out.println("How many years wil you have the loan?");
		int time = keyboard.nextInt();
		
		double CI = interest.compound(principal,rate,number,time);
		System.out.printf("Your compound interest of the loan is %10.2f\n", CI);
	}
	public double compound(int p, double r, int n, int t)
	{
		return Math.pow((1+r/n), n*t) * p;
	}
}