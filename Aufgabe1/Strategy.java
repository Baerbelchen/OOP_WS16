
public class Strategy {

    private double accessibility = 1.0;
    private double dangerOfRobbing = 0.0;
    private double dangerOfForgetting = 0.0;
    private double dangerOfDeath = 0.0;

    public Strategy(double[] perc) {
        // adding percentages

        digStrategy(perc[0]);
        hideHighStrategy(perc[1]);
        stealStrategy(perc[2]);
        humanStrategy(perc[3]);
    }

    public digStrategy(double x) {
        // accessibility (winter)
        // danger of robbing
        // danger of forgetting

        this.accessibility += 0.7*x;
        this.dangerOfRobbing += 0.1*x;
        this.dangerOfForgetting += 1.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public hideHighStrategy(double x) {
        // accessibility (winter / low)
        // danger of robbing (high)
        // danger of forgetting

        this.accessibility += 0.95*x;
        this.dangerOfRobbing += 0.3*x;
        this.dangerOfForgetting += 1.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public stealStrategy(double x) {
        // accessibility (winter)

        this.accessibility += 0.85*x;
        this.dangerOfRobbing += 0.1*x;
        this.dangerOfForgetting += 1.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public humanStrategy(double x) {
        // danger of death (high)

        this.accessibility += 1*x;
        this.dangerOfRobbing += 0.0*x;
        this.dangerOfForgetting += 0.0*x;
        this.dangerOfDeath += 0.5*x;
    }
    
    public Strategy getStrategy(){
    	int random = (int)(Math.random()*((5 - 1) + 1));
    	if(random == 1){
    		return digStrategy;
    	}
    	if(random == 2){
    		return hideHighStrategy;
    	}
    	if(random == 3){
    		return stealStrategy;
    	}
    	if(random == 4){
    		return humanStrategy;
    	}
    }
}
