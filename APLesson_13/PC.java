public class PC extends GameSystem
{
	public String systemInput(){
		return "Keyboard and Mouse";
	}
	public String getPlatform(){
		return "PC";
	}
	public String toString(){
		return "Platform: " + super.getPlatform() +
			"\nSerial #: " + super.getSerialNo() +
			"\nSystem Input: " + systemInput();
	}
}