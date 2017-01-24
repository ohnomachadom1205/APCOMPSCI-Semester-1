import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hair color: ");
		String h = sc.next();
		System.out.print("Enter eye color: ");
		String e = sc.next();
		System.out.print("Enter skin color: ");
		String s = sc.next();
		
		Human ob = new Human(h, e, s);
		
		System.out.println("\nMy info...");
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s\n\n", ob.getHair(), ob.getEyes(), ob.getSkin());
		
		
		System.out.print("Enter hair color: ");
		h = sc.next();
		System.out.print("Enter eye color: ");
		e = sc.next();
		System.out.print("Enter skin color: ");
		s = sc.next();
		
		ob.setHES(h, e, s);
		
		System.out.println("\nFriend's info...");
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s\n\n", ob.getHair(), ob.getEyes(), ob.getSkin());
	}
}