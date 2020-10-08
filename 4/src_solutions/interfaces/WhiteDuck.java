package interfaces;

public class WhiteDuck extends Duck implements Flyable{
    public void display() {
        System.out.println("Looks like a white duck to me");
    }

    @Override
    public void fly() {
        System.out.println("Flap flap flap I fly away");

    }
}
