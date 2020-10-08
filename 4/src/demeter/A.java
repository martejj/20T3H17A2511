package demeter;

public class A {

    String s;

    public void m(String parameter) {
        
        this.method1();

        parameter.contains("s");

        String s1 = "string";
        s1.contains("s");
        
        this.s = "string";
        this.s.contains("s");

        B.s.contains("s");

        s1.getBytes().clone().getClass().desiredAssertionStatus();

        this.s.chars().average().getAsDouble();

    }

    public void method1() {
        
    }

}