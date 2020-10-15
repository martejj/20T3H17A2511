package demeter;

public class A {

    String s;

    public void m(String parameter) {
        
        
        
        // Fine 
        this.method1();
        
        // Fine
        parameter.contains("s");
        
        String s = new String();

        // Fine
        String s1 = "string";
        s1.contains("s");        
        
        B b = new B();
        b.method();
        b.s.hashCode();
        
        // Fine
        this.s = "string";
        this.s.contains("s");

        // Fine
        B.s.contains("s");
        
        // Not Fine 
        s1.getBytes(); //.clone().getClass().desiredAssertionStatus();

        this.s.chars(); // .average().getAsDouble();

    }

    public void method1() {
        
    }

}