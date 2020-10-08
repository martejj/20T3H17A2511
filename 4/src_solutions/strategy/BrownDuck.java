package strategy;

public class BrownDuck extends Duck {
    
    public BrownDuck() {
        this.flyingBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a brown duck to me");
    }
}
