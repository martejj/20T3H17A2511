package strategy;

public abstract class Duck {
    
    FlyingBehaviour flyingBehaviour;

    public void quack() {
        System.out.println("Quack");
    }
    
    public abstract void display();
    
    public void fly() {
        if (this.flyingBehaviour != null) {
            this.flyingBehaviour.fly();
        }
    }

}
