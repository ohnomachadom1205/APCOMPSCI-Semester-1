
public class Lab_02
{
	public static void main(String[]args)
	{
		//prints product of 2 numbers
		int num1 = 2;
		int num2 = 4;
		System.out.println(num1+" multiplied by "+num2+" is "+num1*num2);
		
		System.out.println();
		
		//prints address label
		String name = "Marcelo Ohno-Machado";
		String address = "4044 Via Cangrejo";
		String city = "San Diego, CA";
		String zip = "92130";
		System.out.println(name+"\n"+address+"\n"+city+", "+zip);
		
		System.out.println();
		
		//prints calculated surface area
		int length = 3;
		int height = 4;
		int width = 5;
		System.out.println("The surface area of your rectangle is "+length*width*height);
	}
}