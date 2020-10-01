import animal.Animal;
import animal.Dog;
import animal.Human;

public class Main {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Fluffy");
        Human harrison = new Human("Harrison", dog);
    }

}
