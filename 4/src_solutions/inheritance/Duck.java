package inheritance;

public abstract class Duck {
    
    public void quack() {
        System.out.println("Quack");
    }
    
    public abstract void display();
    
    public void fly() {
        System.out.println("I am now flying");
    }

}
