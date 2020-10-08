package animal;

import body.Torso;
import body.Head;
import body.Leg;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.bodyParts.add(new Head());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Torso());
    }
    
    public void makeNoise() {
        System.out.println("Woof");
    }
    
}