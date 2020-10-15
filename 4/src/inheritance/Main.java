package inheritance;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        BrownDuck b = new BrownDuck();
        b.fly();
        b.display();
        b.quack();
        
        WhiteDuck w = new WhiteDuck();
        w.fly();
        w.quack();
        w.display();
        
        RubberDuck r = new RubberDuck();
        r.display();
        r.quack();
        r.fly();
        
        ArrayList<Duck> ducksList = new ArrayList<Duck>();
        ducksList.add(b);
        ducksList.add(w);
        ducksList.add(r);

    }

}
