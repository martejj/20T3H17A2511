package decorator;

public class Leggings extends ArmourDecorator {

    public Leggings(ArmourDecorator other) {
        super(other);
    }
    
    public double getArmourValue() {
        return super.getArmourValue() + 8;
    }

}
