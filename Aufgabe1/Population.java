//Barbara asd
import java.util.LinkedList;

public class Population {
	private int nrGroups;
	private int nrOfYears;
    private LinkedList<Group> listOfGroups;
	private double suppliesOfAllGroups = 0.0;

	private double[][] strats = {{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};

	public Population(int nrGroups, int nrSquirrelsPerGroup, int nrOfYears) {
		this.nrGroups = nrGroups;
		this.nrOfYears = nrOfYears;
		listOfGroups = new LinkedList<>();

		for (int i = 0; i < nrGroups; i++) {
			Group group;

			if(i<4) {
				group = new Group(nrSquirrelsPerGroup, new Strategy(strats[i])); // the first four groups get only one of each strategy
			} else {
				group = new Group(nrSquirrelsPerGroup, new Strategy()); // the rest of the groups get random strategies
			}
			listOfGroups.add(group);
			suppliesOfAllGroups += group.getCollectedSupplies();
		}
		for(int i = 1; i <= nrOfYears; i++) {
            for(Group g : listOfGroups) {
                g.nextYear(suppliesOfAllGroups);
            }
		}
	}

	public LinkedList<Group> getListOfGroups() {return listOfGroups; }

}