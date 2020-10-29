package decorator;

public class TestArmourSystem {
    
    public static void main(String[] args) {
        Boots b = new Boots(null);
        System.out.println(b.getArmourValue());
        Chestplate c = new Chestplate(b);
        System.out.println(c.getArmourValue());
        Leggings l = new Leggings(c);
        System.out.println(l.getArmourValue());
        Player player = new Player();
        player.setArmour(l);
    }

}
