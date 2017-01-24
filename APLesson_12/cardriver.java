import java.util.Scanner;
public class cardriver
{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter paint color: ");
		String p = sc.nextLine();
		System.out.print("Enter interior type: ");
		String i = sc.nextLine();
		System.out.print("Enter engine type: ");
		String e = sc.nextLine();
		System.out.print("Enter tires: ");
		String t = sc.nextLine();
		
		car car = new car(p, i, e, t);
		
		System.out.println("\nYour vehicle is ready......");
		System.out.printf("Paint: %s\nInterior: %s\nEngine: %s\nTires: %s\n", car.getPaint(), car.getInterior(), car.getEngine(), car.getTires());
	}
}