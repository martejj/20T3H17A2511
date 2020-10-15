package composite;

import java.util.ArrayList;

public class CompositeOrder implements Order {

    ArrayList<Order> orders;

    public CompositeOrder() {
        this.orders = new ArrayList<Order>();
    }

    @Override
    public String getContents() {
        return null;
    }

    @Override
    public double getPrice() {
        int sum = 0;
        for (Order o : orders) {
            sum += o.getPrice();
        }
        return sum;
    }
    
}
