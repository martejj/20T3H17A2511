package inheritance;

public class BrownDuck extends Duck {

    public BrownDuck() {
        this.flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Imagine I am a Brown Duck");
    }
}
