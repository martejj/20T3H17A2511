package animal;

import body.Arm;
import body.Torso;
import body.Head;
import body.Leg;

public class Human extends Animal {
    
    Dog petDog;

    public Human(String name) {
        super(name);
        this.bodyParts.add(new Head());
        this.bodyParts.add(new Torso());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Leg());
        this.bodyParts.add(new Arm());
        this.bodyParts.add(new Arm());
    }

    public Human(String name, Dog petDog) {
        this(name);
        this.petDog = petDog;
    }

    public void setDog(Dog dog) {
        this.petDog = dog;
    }

    public Dog getDog() {
        return this.petDog;
    }

}
