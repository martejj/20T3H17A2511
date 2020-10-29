public class Chestplate extends ArmourDecorator {

    public Chestplate(Armour armour) {
        super(armour);
        // TODO Auto-generated constructor stub
    }
    
    public int getArmourValue() {
        return super.getArmourValue() + 10;
    }
    
}
