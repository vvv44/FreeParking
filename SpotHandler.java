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
	public static ArrayList<Spot> spotSearch(double xcoord,double ycoord,double distance) {
		ArrayList<Spot> listing = new ArrayList<Spot>();
		TreeMap<Double,Spot> sorting = new TreeMap<Double,Spot>();
		double dist;
		for(int i=0;i<spots.size();i++) {
			if((spots.get(i).getX()<xcoord+distance)&&(spots.get(i).getX()>xcoord-distance)&&(spots.get(i).getY()<ycoord+distance)&&(spots.get(i).getY()>ycoord-distance)) {
				spots.get(i).printInfo();
				dist= Math.sqrt(Math.pow(spots.get(i).getX(),2)+Math.pow(spots.get(i).getY(),2));
				sorting.put(dist,spots.get(i));
			}
		}
		System.out.println();
		while(!sorting.isEmpty()) {
			listing.add(sorting.get(sorting.firstKey()));
			sorting.remove(sorting.firstKey());
		}
		for(int i=0;i<spots.size();i++) {
			listing.get(i).printInfo();
		}
		return listing;
	}
}
