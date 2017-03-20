public class StudentAdvance extends Advance
{
	private int daysLeft;
	
	public StudentAdvance(int days){
		super(days);
	}
	public double getPrice(){
		return super.getPrice()_2;
	}
	public String toString(){
		return super.toString() + "\n(STUDENT ID IS REQUIRED)";
	}
}