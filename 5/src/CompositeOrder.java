import java.util.ArrayList;

public class CompositeOrder implements Orderable {
    
    ArrayList<Orderable> orders;
    
    public CompositeOrder() {
        this.orders = new ArrayList<Orderable>();
    }
    
    public double getPrice() {
        int sum = 0;
        for (Orderable i : orders) {
            sum += i.getPrice();
        }
        
        return sum;
    }
    
    public String getName() {
        return "Name";
    }
    
    public void addItem(Orderable i) {
        this.orders.add(i);
    }
    
}
