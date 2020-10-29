public class ArmourDecorator implements Armour {
    
    Armour armour;
    
    public ArmourDecorator(Armour armour) {
        this.armour = armour;
    }

    @Override
    public int getArmourValue() {
        if (armour != null) {
            return armour.getArmourValue();
        }
        return 0;
    }
    
}
