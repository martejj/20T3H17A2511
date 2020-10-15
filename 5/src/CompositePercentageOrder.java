public class CompositePercentageOrder extends CompositeOrder {
    
    double percentage;
    
    public CompositePercentageOrder(double percentage) {
        this.percentage = percentage;
    }
    
    public double getPrice() {
        return super.getPrice() * percentage;
    }
    
}
