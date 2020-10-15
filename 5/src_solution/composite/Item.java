package composite;

public class Item implements Order {
    
    private int price;
    private String name;

    public Item(int price, String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getContents() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
