public class CompositeFlatAmountOrder extends CompositeOrder {
    
    double amount;
    
    public CompositeFlatAmountOrder(double amount) {
        this.amount = amount;
    }
    
    public double getPrice() {
        return super.getPrice() - amount;
    }
    
}
