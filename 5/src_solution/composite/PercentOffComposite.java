package composite;

public class PercentOffComposite extends CompositeOrder {

    private double percentage;

    public PercentOffComposite(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String getContents() {
        return 100*percentage + "% Off " + super.getContents();
    }

    @Override
    public double getPrice() {
        return super.getPrice() * percentage;
    }
    
}
