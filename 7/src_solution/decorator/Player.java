package decorator;

public class Player implements Armour {

    Armour armour;

    public double getArmourValue() {
        return armour.getArmourValue();
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }
    
}
