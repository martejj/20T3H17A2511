package inheritance;

public class WhiteDuck extends Duck{
    
    public WhiteDuck() {
        this.flyBehaviour = new FlyWithWings();
    }
    
    public void display() {
        System.out.println("Looks like a white duck to me");
    }
    
}
