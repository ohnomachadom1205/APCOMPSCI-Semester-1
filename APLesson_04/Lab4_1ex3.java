public class Lab4_1ex3
{
	public static void main(String[]args)
	{
		Lab4_1ex3 totalCost = new Lab4_1ex3();
		double r = 0.09;
		double P = 1000;
		double n = 120;
		double t = 68;
		double total = totalCost.CalcComInt(r, P, n, t);
		System.out.printf("Your total monthly payment is $%5.2f", total); 
	}
	
	public double CalcComInt(double r, double P, double n, double t)
	{
		return (P* (Math.pow(1 + r/n, n*t)))/(t*12);
	}
}