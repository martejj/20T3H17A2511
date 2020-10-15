package inheritance;

public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    
    public void quack() {
        System.out.println("Quack");
    }
    
    public void fly() {
        if (this.flyBehaviour != null) {
            this.flyBehaviour.fly();
        }
    }
    
    public void setFlyBehaviour(FlyBehaviour f) {
        this.flyBehaviour = f;
    }
    
    public abstract void display();

}
