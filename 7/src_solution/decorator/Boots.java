package decorator;

public class Boots extends ArmourDecorator {

    public Boots(ArmourDecorator other) {
        super(other);
    }

    public double getArmourValue() {
        return super.getArmourValue() + 2;
    }
    
}
