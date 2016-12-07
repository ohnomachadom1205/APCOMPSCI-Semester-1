public class Lab_09ex3
{
	public static double average(int[] nums)
	{
		double avg = 0;
		for(int num : nums)
		{
			avg += num;
		}
		return avg/nums.length;
	}
	public static void main(String[]args)
	{
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.print("Numbers... ");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println();
		
		System.out.print("The average of the above numbers is... " + average(numbers));
	}
}