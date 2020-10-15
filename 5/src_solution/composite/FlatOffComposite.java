package composite;

public class FlatOffComposite extends CompositeOrder {

    private double amount;

    public FlatOffComposite(double amount) {
        this.amount = amount;
    }

    @Override
    public String getContents() {
        return amount + "$ Off " + super.getContents();
    }

    @Override
    public double getPrice() {
        return super.getPrice() - amount;
    }
    
}
