package decorator;

public class TestArmourSystem {
    
    public static void main(String[] args) {
        Boots b = new Boots(null);
        Chestplate c = new Chestplate(b);
        System.out.println(c.getArmourValue());
    }

}
