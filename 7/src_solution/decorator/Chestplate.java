package decorator;

public class Chestplate extends ArmourDecorator {

    public Chestplate(ArmourDecorator other) {
        super(other);
    }
    
    public double getArmourValue() {
        return super.getArmourValue() + 10;
    }

}
