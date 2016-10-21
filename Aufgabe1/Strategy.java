// Michael asd

public class Strategy {

    private double[] perc = {0,0,0,0};
    private double accessibility = 0.0;
    private double dangerOfRobbing = 0.0;
    private double dangerOfForgetting = 0.0;
    private double dangerOfDeath = 0.0;

    public Strategy(double[] perc) {
        // given percentages

        digStrategy(perc[0]);
        hideHighStrategy(perc[1]);
        stealStrategy(perc[2]);
        humanStrategy(perc[3]);
        this.perc = perc;

    }

    public Strategy() {
        // random percentages

        double[] perc = new double[4];

        double total = 0;
        double random = 0;
        for(int i=0; i<4; i++, total += random) {
            random = (int)(Math.random() * ((100 - 0) + 1));
            perc[i] = random;
        }

        for(int i=0; i<4; i++) {
            double temp = (perc[i] / total);
            perc[i] = (double)Math.round(temp * 100d) / 100d;
        }

        digStrategy(perc[0]);
        hideHighStrategy(perc[1]);
        stealStrategy(perc[2]);
        humanStrategy(perc[3]);
        this.perc = perc;
    }

    public void digStrategy(double x) {
        // accessibility (winter)
        // danger of robbing
        // danger of forgetting

        this.accessibility += 0.7*x;
        this.dangerOfRobbing += 0.1*x;
        this.dangerOfForgetting += 0.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public void hideHighStrategy(double x) {
        // accessibility (winter / low)
        // danger of robbing (high)
        // danger of forgetting

        this.accessibility += 0.95*x;
        this.dangerOfRobbing += 0.3*x;
        this.dangerOfForgetting += 0.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public void stealStrategy(double x) {
        // accessibility (winter)

        this.accessibility += 0.3*x;
        this.dangerOfRobbing += 0.0*x;
        this.dangerOfForgetting += 0.0*x;
        this.dangerOfDeath += 0.0*x;
    }

    public void humanStrategy(double x) {
        // danger of death (high)

        this.accessibility += 1*x;
        this.dangerOfRobbing += 0.0*x;
        this.dangerOfForgetting += 0.0*x;
        this.dangerOfDeath = 0.4*x;
    }

    public double[] getPerc() { return perc; }

    public double[] getData() {
        double[] data = {accessibility, dangerOfRobbing, dangerOfForgetting, dangerOfDeath};
        return data;
    };
}
