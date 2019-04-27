
public class Testing {
	public static void main(String [] args) {
		Spot utep = new Spot( 0.5,0.5,"The University of Texas at El Paso");
		Spot home = new Spot(0,0,"My House");
		Spot nmsu = new Spot(1,1,"NMSU");
		nmsu.flipStatus();
		Spot work = new Spot(2,2,"Graham Hall");
		work.flipStatus();
		
		SpotHandler.spotSearch(0, 0, 4);
	}

}
