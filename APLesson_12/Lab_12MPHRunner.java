import java.util.Scanner;

public class Lab_12MPHRunner
{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance: ");
		int distance = sc.nextInt();
		System.out.print("Enter hours: ");
		int hours = sc.nextInt();
		System.out.print("Enter minutes: ");
		int minutes = sc.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph\n", distance, hours, minutes, object.getMPH());
		
		
		System.out.print("Enter distance: ");
		distance = sc.nextInt();
		System.out.print("Enter hours: ");
		hours = sc.nextInt();
		System.out.print("Enter minutes: ");
		minutes = sc.nextInt();
		
		object.setValues(distance, hours, minutes);
		
		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph", distance, hours, minutes, object.getMPH());
	}
}
