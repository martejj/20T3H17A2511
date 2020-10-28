package decorator;

public class ArmourDecorator implements Armour {
    
    Armour armour;
    
    public ArmourDecorator(ArmourDecorator other) {
        this.armour = other;
    }

    public double getArmourValue() {
        if (armour != null) {
            return armour.getArmourValue();
        }
        return 0;
    }

}
