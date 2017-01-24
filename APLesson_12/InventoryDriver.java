import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		Inventory item1;
		
		System.out.print("Enter item manufacturer: ");
		String m = sc.nextLine();
		System.out.print("Enter item name: ");
		String n = sc.nextLine();
		System.out.print("Enter category and price? (y or n) ");
		if(sc.next().equals("n")){
			item1 = new Inventory(m, n);
		}
		else{
			sc.nextLine();
			System.out.print("Enter item category: ");
			String c = sc.nextLine();
			System.out.print("Enter item price: ");
			double p = sc.nextDouble();
			item1 = new Inventory(m, n, c, p);
		}
		System.out.println();
		System.out.println(item1);
	}
}