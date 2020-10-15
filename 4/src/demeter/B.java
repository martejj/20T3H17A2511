package demeter;

public class B {

    public static String s = "Hello";
    
    private String s;
    
    public B() {
        s = "String";
    }
    
    public int method() {
        return s.hashCode();
    }
    
}
