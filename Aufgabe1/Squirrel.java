
public class Squirrel {

    private double reproductionFood = 30.0; // kg per year
    private double survivalFood = 25.0; // kg per year
    private int babiesPerSquirrel = 2; // per year (4 per squirrel but about halve are male)
    private double ownSuppliesFound = 0.0;
    private int collectedSupplies = 0;
    private static boolean liveStatus = false;
    private boolean mature = false;
    private final int descendants = 2;
    int alive = 0;
    int amountOfFoodToPopulate = 30000; //fragt sich halt nur, ob es Sinn macht, diese Werte statisch festzulegen
    int amountOfFoodToSurvive = 10000;


    public Squirrel(){

        collecting();
    }

    public static void setLiveStatus(){

    }

    public static boolean getLiveStatus(){

        return liveStatus;
    }


    public int getDescendants(){ //durchschnittliche Zahl der jährlichen Nachkommen pro fortpflanzungsfähigem Individuum
        return this.descendants;
    }


    public static void collecting(){
        if(liveStatus == true){
            //Strategy.getStrategy();
        }

    }

    public static int getSupplies(){
        return 0;
    }


    public static int getAmountOfFoodToSurvive(){ //pro Individuum und Jahr im Winter benötigte Nahrungsmenge um zu überleben (kleiner)
        return 0;
    }

    public static int getAmountOfFoodToPopulate(){ //pro Individuum und Jahr im Winter benötigte Nahrungsmenge um fortpflanzungsfähig zu sein
        return 0;
    }

}
