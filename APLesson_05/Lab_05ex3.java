import java.util.Scanner;

public class Lab_05ex3
{
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return 0.0;
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first grade: ");
		String G1 = sc.next();
		System.out.print("Enter second grade: ");
		String G2 = sc.next();
		System.out.print("Enter third grade: ");
		String G3 = sc.next();
		System.out.print("Enter fourth grade: ");
		String G4 = sc.next();
		System.out.print("Enter fifth grade: ");
		String G5 = sc.next();
		System.out.print("Enter sixth grade: ");
		String G6 = sc.next();
		System.out.print("Enter seventh grade: ");
		String G7 = sc.next();
		
		double total = calcPoints(G1)+calcPoints(G2)+calcPoints(G3)+calcPoints(G4)+calcPoints(G5)+calcPoints(G6)+calcPoints(G7);
		
		System.out.printf("Your GPA is %.2f",total/7);
		
	}
}