package shapes;

public class Shape {
    
    int x;
    int y;
    int area;
    
    static int num = 0;
    
    public Shape(int x, int y, int area) {
        this.x = x;
        this.y = y;
        this.area = area;
        num++;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + ": x=" + this.x + ", y=" + this.y + ", area=" + this.area;
    }
    
    @Override
    public boolean equals(Object o) {
        
        if (o == null) {
            return false;
        }
        
        if (!o.getClass().equals(this.getClass())) {
            return false;
        }
        
        Shape s = (Shape) o;
        
        if (s.x != this.x  || s.y != this.y || s.area != this.area) {
            return false;
        }
    
        return true;
    
    }
    
    public static void main(String[] args) {
        
        Shape myShape1 = new Shape(0, 0, 10);
        
        System.out.println(myShape1.toString());
        
        Rectangle rect = new Rectangle(0, 0, 10, 15);
        
        System.out.println(rect.toString());
        
        System.out.println(Shape.num);
        
    }
    
}
