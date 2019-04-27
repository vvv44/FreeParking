import java.util.*;

public class SpotHandler {
	static ArrayList<Spot> spots = new ArrayList<Spot>();
	SpotHandler(){
		SpotHandler spotHandler = new SpotHandler();
	}
	
	public static void add(Spot s) {
		spots.add(s);
	}
	public static void printAllSpots() {
		for(int i=0;i<spots.size();i++) {
			spots.get(i).printInfo();
		}
	}
	public static void printFreeSpots() {
		for(int i=0;i<spots.size();i++) {
			if(!spots.get(i).getStatus()) {
				spots.get(i).printInfo();
			}
		}
	}
	public static void spotSearch(double xcoord,double ycoord,double distance) {
		for(int i=0;i<spots.size();i++) {
			if((spots.get(i).getX()<xcoord+distance)&&(spots.get(i).getX()>xcoord-distance)&&(spots.get(i).getY()<ycoord+distance)&&(spots.get(i).getY()>ycoord-distance)) {
				spots.get(i).printInfo();
			}
		}
	}
}
