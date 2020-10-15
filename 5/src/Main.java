public class Main {
    
    public static void main(String[] args) {
        
        Item i1 = new Item(4, "Coffee");
        Item i2 = new Item(1, "Two minute Noodles");
        Item i3 = new Item(5000, "Laptop");
        
        CompositePercentageOrder composite20Off = new CompositePercentageOrder(0.8);
        composite20Off.addItem(i1);
        composite20Off.addItem(i2);
        CompositeOrder order = new CompositeOrder();
        order.addItem(composite20Off);
        order.addItem(i3);
        System.out.println(order.getPrice());
    }
    
}
