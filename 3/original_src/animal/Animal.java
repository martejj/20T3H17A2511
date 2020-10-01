package animal;

import java.util.ArrayList;
import java.util.List;

import body.BodyPart;

public class Animal {

    protected List<BodyPart> bodyParts;
    protected String name;

    public Animal(String name) {
        this.name = name;
        this.bodyParts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

}
