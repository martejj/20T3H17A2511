package interfaces;

public class BrownDuck extends Duck implements Flyable {
    public void display() {
        System.out.println("Looks like a brown duck to me");
    }

    @Override
    public void fly() {
        System.out.println("Flap flap flap I fly away");

    }
}
