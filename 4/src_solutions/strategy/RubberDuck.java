package strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyingBehaviour = new FlyWithNoWings();
    }

    @Override
    public void display() {
        
        System.out.println("I am yellow and rubbery");

    }

    public void quack() {
        System.out.println("Squeek Squeek");
    }

}
