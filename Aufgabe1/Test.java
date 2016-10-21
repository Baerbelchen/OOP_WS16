/* Aufteilung der Arbeiten in der Gruppe:
 * 
 * Sarah: Group, Test
 * Barbara: besteht auf getter und setter ;) Population, Test
 * Michael: Strategy, Test
 *
 */
public class Test {

	/*
	Grobstruktur Einteilung:
	Sarah: Group, Test,
	Michi: Strategy-> Witterungsverhältnisse, Test
	Babsi: Klasse Squirrel, Test-output improvement
	 */

	/*Funktionsumfang geplant:

	Strategy: Anpassung der Witterungsverhältnisse mit random-Faktor multiplikativ, accessability und danger of Death um
	den Punkt Lebensraum abzudecken;

	Squirrel: Improvement (livestatus, squirrel specific attributes), Methode isMale()-> MachoEichhörnchen das den
	gesamten Futtervorrat frisst; IQ for Squirrel; randomHeritage-erbt intelligenz der eltern,
	Strategieparameter;

	Group: nextDay() methode mit getFoodFromStorage(), /in Strategy oder Group: Reviergröße, beeinflusst foodStorage
	Leckerbissen aufgeschoben bis eventuell Ende; ifSquirrelisMale();
	Ökosystem-variable,methode?,

	Test: Output letzter Punkt nachfragen bei Klara (Granularität) :)


	 */


	public static void main(String[] args) {
		Population population1 = new Population(8, 20, 2);
		System.out.println("Population 1: \n");
		printPopulation(population1);
		Population population2 = new Population(10, 15, 3);
		System.out.println("Population 2: \n");
		printPopulation(population2);
		Population population3 = new Population(1, 60, 4);
		System.out.println("Population 3: \n");
		printPopulation(population3);
		Population population4 = new Population(7, 14, 7);
		System.out.println("Population 4: \n");
		printPopulation(population4);
		Population population5 = new Population(30, 5, 2);
		System.out.println("Population 5: \n");
		printPopulation(population5);
	}
	public static void printPopulation(Population population) {
		System.out.println("Data: non collected food available = 70 kg / descendants per fed, female squirrel = 4 / \n" +
				"  \t  reproduction necessary food = 30.0 kg / survival necessary food = 15.0 kg / avg. collected food per squirrel = 40.0 kg \n");
		System.out.println("Strategies: dig-strategy / hide-in-trees-strategy / steal-strategy / human-strategy");
		System.out.println("\n# " + "\tPerc. of Strategy used" + "\t\tSize over Years");
		int j = 1;
		for(Group g : population.getListOfGroups()) {
			String sizeString = "";
			for(int s : g.getListOfSizes())
				sizeString +=  s + " / ";

			sizeString = sizeString.substring(0, sizeString.length()-3); // to get rid of the unnecessary "/" at the end of a line

			System.out.println(j + "\t"+g.getStratCombo()[0]+" / "+g.getStratCombo()[1]+" / "+g.getStratCombo()[2]+" / "+g.getStratCombo()[3] + "\t\t"+sizeString);
			j++;
		}
		System.out.println("\n");
	}
}
