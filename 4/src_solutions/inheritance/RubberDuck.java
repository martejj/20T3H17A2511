package inheritance;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        
        System.out.println("I am yellow and rubbery");

    }

    public void quack() {
        System.out.println("Squeek Squeek");
    }
    
    // Refused bequest!
    public void fly() {

    }

}
