public class Boots extends ArmourDecorator {

    public Boots(Armour armour) {
        super(armour);
        // TODO Auto-generated constructor stub
    }
    
    public int getArmourValue() {
        return super.getArmourValue() + 2;
    }
    
}
