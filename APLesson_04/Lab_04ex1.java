public class Lab_04ex1
{
	public static void main(String[]args)
	{
		Lab_04ex1 form = new Lab_04ex1();
		
		System.out.printf("%6s   %10.2f", "Cheese Sandwich.....", 4.50);
		String word1 = "French Fries.....";
		double number1 = 2.88;
		
		form.format(word1, number1);
		
		String word2 = "Soda.....";
		double number2 = 1.63;
		form.format(word2, number2);
		
		String word3 = "Subtotal.....";
		double number3 = 9.01;
		form.format(word3, number3);
		
		String word4 = "Tax.....";
		double number4 = 0.69;
		form.format(word4, number4);
		
		String word5 = "Total.....";
		double number5 = 9.64;
		form.format(word5, number5);
		
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}