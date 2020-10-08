package strategy;

public class WhiteDuck extends Duck {

    public WhiteDuck() {
        this.flyingBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a white duck to me");
    }
}
