package composite;

import java.util.ArrayList;

public class CompositeOrder implements Order {

    ArrayList<Order> orders;

    public CompositeOrder() {
        this.orders = new ArrayList<Order>();
    }

    @Override
    public String getContents() {
        var contents = new ArrayList<String>();
        for (Order o : this.orders) {
            contents.add(o.getContents());
        }
        return "Composite [ " + String.join(", ", contents) + " ]";
    }

    @Override
    public double getPrice() {
        int sum = 0;
        for (Order o : orders) {
            sum += o.getPrice();
        }
        return sum;
    }
    
    public void addOrder(Order o) {
        this.orders.add(o);
    }
    
}
