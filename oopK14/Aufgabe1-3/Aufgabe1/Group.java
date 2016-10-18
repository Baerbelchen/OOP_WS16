import java.util.LinkedList;

public class Group extends Population{
    private int initialSize = 0;
    //private double[] strategy = new double[4];
    //private double collectedSuppliesPerSquirrel = 40; //OBJEKTKOPPLUNG -> wird über Squirrel geprüft
   // private double nonCollectedFoodAvailable = 15;
   // private double percOwnFoundFood = 0.5;
    //private double foundFood = 0.0;
    //private double percStrangerFoodFound = 0.1;
    //private double strangerFoodFound = 0.0;
    private double percToDie = 0.3;
    

    public Group() {
        //lostFood += (collectedSuppliesPerSquirrel - ownSuppliesFound);
        this.initialSize = getGroupSize();
    	//this.strategy = strategy;
        
        LinkedList<Squirrel> listOfSquirrels = new LinkedList<>();
        for (int i = 0; i <= initialSize; i++) {
            int age = (int)(Math.random()*((5 - 1) + 1));
            Squirrel squirrel = new Squirrel();
            listOfSquirrels.add(squirrel);
        }
    }
    /*
    public void getStrangerFoodFound() {
       // strangerFoodFound = (lostFood - (collectedSuppliesPerSquirrel - ownSuppliesFound)) * percStrangerFoodFound;
    }*/
    
    
    public void setGroupSize(){  //legt random eine neue Gruppengröße fest, wenn aufgerufen
    	InitialSize = (int) Math.random() * 100;
    }
    
    
    public void calculateGroupSize(){ //kalkuliert eine neue Gruppengröße
    	int newSize = 0;
    	//calculation irgendwas wie newSize = 20% weniger Squirrels weil tot und 5% mehr weil fortgepflanzt
    	newSize = initialSize - (initialSize*100/20) + (initialSize*100/5);
    	// + eventuell for-schleife für alle Squirrels der Gruppe auf Squirrel.getLiveStatus()
    	size = newSize;
    }
    
    public static int getGroupSize(){ //gibt aktuelle Gruppengröße zurück
    	return newSize;
    }
    
    
    public static int getAmountOfSupplies(){ //pro Individuum und Jahr gesammelte Menge an Vorräten
    	return Squirrel.getSupplies();
    }
    
    public static int getAmountOfSuppliesWithoutCollecting(){ //pro Individuum und Jahr ohne Bevorratung im Winter verfügbare Futtermenge (an Bäumen verbliebene Samen, Fütterung, etc.)
    	return 0;
    	//Randomwert schon wieder???
    }
    
    
    public static int getAmountOfFoundSupplies(){ //Anteil der im Winter wiedergefundenen eigenen Vorräte (relativ zu den selbst gesammelten Vorräten)
    	return 0;
    }
    
    public static int getAmountOfForeignSupplies(){ //Anteil der im Winter gefundenen fremden Vorräte (relativ zu den durchschnittlich pro Individuum gesammelten Vorräten über alle Gruppen hinweg)
    	
    	
    }
    
    public static int probabilityToDie() {  //Wahrscheinlichkeit eines Individuums, einen Winter wegen Alter, Krankheit oder Fressfeinden (also alles außer Nahrungsmangel) nicht zu überleben
    	this.percToDie;
    }
    
}
