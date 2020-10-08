package interfaces;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        BrownDuck b = new BrownDuck();
        b.fly();
        b.display();
        b.quack();

        RubberDuck r = new RubberDuck();
        r.display();
        r.quack();

        WhiteDuck w = new WhiteDuck();
        w.display();
        w.fly();
        w.quack();

        ArrayList<Duck> l = new ArrayList<Duck>();
        l.add(b);
        l.add(r);
        l.add(w);
        // Liskov substitution principle works!

        ArrayList<Flyable> f = new ArrayList<Flyable>();
        f.add(b);
        f.add(w);
    }

}
