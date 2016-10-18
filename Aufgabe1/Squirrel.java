/**
 * Created by Sarah on 17.10.2016.
 */

public class Squirrel {

	/*private double reproductionFood = 30.0; // kg per year
	private double survivalFood = 25.0; // kg per year
	private int babiesPerSquirrel = 2; // per year (4 per squirrel but about halve are male)
	private double ownSuppliesFound = 0.0;*/
	private int collectedSupplies = 0;
	private boolean liveStatus = false;
	private boolean mature = false;
	private final int descendants = 2;
	int alive = 0;
	int amountOfFoodToPopulate = 30000; //fragt sich halt nur, ob es Sinn macht, diese Werte statisch festzulegen
	int amountOfFoodToSurvive = 10000;
	

	public Squirrel(){

		collecting();
	}

	public static void setLiveStatus(){ 
		alive = (int)Math.random()*((0 - 1) + 1); //soll entweder 0 (für tot) oder 1 (für am Leben) festlegen 
		if(alive == 0){
			liveStatus = true;
		}
		if(alive == 1){
			liveStatus = false;
		}
	}

	public static boolean getLiveStatus(){
		return liveStatus;
	}


	public int getDescendants(){ //durchschnittliche Zahl der jährlichen Nachkommen pro fortpflanzungsfähigem Individuum
		return this.descendants;
	}


	public static void collecting(){
		if(liveStatus == true){
			Strategy.getStrategy();
		}
		collectedSupplies = 30; //muss noch besser implementiert werden
		//collectedSupplies abhängig von Strategie und liveStatus?
	}

	public static int getSupplies(){
		return collectedSupplies;
	}

	
	public static int getAmountOfFoodToSurvive(){ //pro Individuum und Jahr im Winter benötigte Nahrungsmenge um zu überleben (kleiner)
		return this.amountOfFoodToSurvive;
	}
	
	public static int getAmountOfFoodToPopulate(){ //pro Individuum und Jahr im Winter benötigte Nahrungsmenge um fortpflanzungsfähig zu sein
		return this.amountOfFoodToPopulate;
	}

}
