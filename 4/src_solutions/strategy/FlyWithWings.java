package strategy;

public class FlyWithWings implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("flap flap flap");
    }
    
}
