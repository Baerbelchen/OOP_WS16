/* Aufteilung der Arbeiten in der Gruppe:
 * 
 * Sarah: Strategy, Test, Year
 * Barbara: besteht auf getter und setter ;) Squirrel, Test, Year
 * Michael: Strategy, Test, Year
 * 
 * 
 */
public class Test {
	final Object[][] table;
	int counter = 0;
	
	/*Getter und Setter Methoden vermehrt einsetzen!!!
	 * Schreiben Sie nur den Kern eines solchen Programms ohne Benutzerschnittstelle sowie ein Testprogramm.
	 * Der Kern soll die oben beschriebene Funktionalität aufweisen, aber keinerlei Eingabe von der 
	 * Tastatur oder Ausgabe auf den Bildschirm (und auch nicht von/auf eine Datei) machen. 
	 * --->> !!!
	 * Daher müssen alle benötigten bzw. erzeugten Daten über Parameter und Rückgabewerte von Methoden übergeben werden.
	 * !!!!
	 */
	

	public static void main(String[] args) {
		/*double[] strat1 = {1, 0, 0, 0};
		double[] strat2 = {0, 1, 0, 0};
		double[] strat3 = {0, 0, 1, 0};
		double[] strat4 = {0, 0, 0, 1};
		int size = 0;*/ 
		// alles über getter und setter gelöst
	
		for(int i=0; i<= value; i++){
		Group group = new Group(Group.getSize(), Strategy.getStrategy(), Year.getYear());
		addGroupToSimulation();
		counter++;
		}
		
	
		printTable(); 
	}
	
	/* Angabetext:
	 * Ein Simulationslauf über mehrere Jahre verwendet pro Jahr dieselben Parameterwerte (ausgenommen die Anfangsgrößen) 
	 * und errechnet pro Jahr eine neue Größe jeder Gruppe. Dabei fallen Nachkommen in dieselben Gruppen wie die Eltern. 
	 * Am Ende eines Simulationslaufs wird ein Text produziert, der alle verwendeten Parameterwerte sowie die
	 * jährlichen Veränderungen der Gruppengrößen in Form einer Tabelle enthält.
	 */
	
	public static void addGroupToSimulation(){
		Simulation sim = new Simulation(group);
	}
	
	public static void printTable(){
		//System.out.println("Size of Group:" + Group.getGroupSize());
		//System.out.format(Group.getGroupSize(),)
		table = new String[counter][];
		table[0][] = new String[]{"Gruppengröße", "simulierte Jahre", "Überlebende Eichhörnchen", "Strategie", "Vorräte"};
		
		for(int i=0; i<= counter; i++){
			
		}
		
		for(Object[] row : table){
			System.out.format("%30s%30s%30s\n", row);
		}
		
	}

}
