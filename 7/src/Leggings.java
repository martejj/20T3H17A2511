public class Leggings extends ArmourDecorator {

    public Leggings(Armour armour) {
        super(armour);
        // TODO Auto-generated constructor stub
    }
    
    public int getArmourValue() {
        return super.getArmourValue() + 8;
    }
    
}
