public class TestDecorators {
    
    public static void main(String[] args) {
        
        Boots b = new Boots(null);
        System.out.println(b.getArmourValue());
        Chestplate c = new Chestplate(b);
        System.out.println(c.getArmourValue());
        Leggings l = new Leggings(c);
        System.out.println(l.getArmourValue());
        
        Armour a = new Leggings(new Boots(new Chestplate(null)));
        
    }
    
}
