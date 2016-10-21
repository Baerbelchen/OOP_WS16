//Sarah asd
import java.util.LinkedList;

public class Group{
    private int size = 0;
    private double[] stratAttributes = new double[4];
    private double[] stratCombo = new double[4]; //accessibility, forgetting, robbing, death
    private double collectedSupplies = 0;
    private double nonCollectedFoodAvailable = 70;
    private int descendants = 4; // per year
    private static double reproductionFood = 30.0; // kg per year
    private static double survivalFood = 15.0; // kg per year
    private LinkedList<Integer> listOfSizes = new LinkedList<>();

    public Group(int size, Strategy strategy) {
        this.size = size;
        this.stratAttributes = strategy.getData();
        this.stratCombo = strategy.getPerc();
        this.collectedSupplies = 40 * size; // one squirrel collects 40.0 kg of food per year
        listOfSizes.add(size);
    }

    public void nextYear(double suppliesOfAllGroups) {
        double stolenSupplies = suppliesOfAllGroups * 0.1; // the supplies from others that are found by squirrels
        collectedSupplies += stolenSupplies * stratCombo[2]; // only the stealing squirrels find supplies from others
        collectedSupplies *= stratAttributes[0] * (1 - stratAttributes[1]) * (1 - stratAttributes[2]); // the collected supplies depend on the percentage of the strategy used
        double allAvailableFood = collectedSupplies + nonCollectedFoodAvailable;
        double leftAfterSurvival = allAvailableFood - survivalFood * size;
        if (leftAfterSurvival >= 0) {
            size += descendants * ((int)leftAfterSurvival / (reproductionFood - survivalFood)) / 2; // half are male so only half the descendants
        } else {
            size += (int)(allAvailableFood / survivalFood);
        }

        size -= Math.round(Math.random()*(10 - 5) + 1); // Squirrels that die from age or health issues
        size *= (1 - stratAttributes[3]); // Squirrels that die from using the "human method"

        listOfSizes.add(size);
    }

    public double[] getStratCombo() {return stratCombo; }

    public LinkedList<Integer> getListOfSizes() {return listOfSizes; }

    public double getCollectedSupplies() {return collectedSupplies; }
}
