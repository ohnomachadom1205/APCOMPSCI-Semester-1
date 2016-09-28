public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		System.out.printf("%6s   %10.2f", "test", 4564.3453);
		String word1 = "blaaah";
		double number1 = 444564.3456;
		
		form.format(word1, number1);
		
		String word2 = "yesssss";
		double number2 = 567456.5678767;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
}