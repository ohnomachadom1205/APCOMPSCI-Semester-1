public abstract class Console extends GameSystem
{
	public abstract String getController();
	public String toString(){
		return "Platform: " + getPlatform() + 
			"\nSerial #: " + getSerialNo() +
			"\nController: " + getController();
	}
}