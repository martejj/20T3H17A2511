package composite;

public class Test {
    
    public static void main(String[] args) {
        Item textbook = new Item(100, "Harrison's 2511 textbook");
        Item noodles = new Item(3, "2 Minute Noodles");
        FlatOffComposite tenDollarsOff = new FlatOffComposite(2.5);
        tenDollarsOff.addOrder(textbook);
        tenDollarsOff.addOrder(noodles);
        
        Item coffee = new Item(4, "Coffee");
        Item pens = new Item(10, "10 Pens");
        CompositeOrder composite = new CompositeOrder();
        composite.addOrder(textbook);
        composite.addOrder(noodles);
        
        
    }

}
