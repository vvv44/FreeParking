
public class Spot {
	private double x;
	private double y;
	String name;
	private boolean taken;
	
	Spot(double x,double y, String n) {
		this.x=x;
		this.y=y;
		name=n;
		SpotHandler.add(this);
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public boolean getStatus() {
		return taken;
	}
	public void flipStatus(){
		taken=!taken;
	}
	public void printInfo() {
		System.out.print("The parking spot " + this.name + " that is located at " + y + ", " + x + " is ");
		if(taken) {
			System.out.print("taken");
		}
		else {
			System.out.print("free");
		}
		System.out.println(".");
	}

}
